/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Manifest implements Validable<Manifest>, Exportable {
    private List<Alveolus> alveoli;
    private List<Requirement> requirements;

    public Manifest() {
        // no-op
    }

    public Manifest(final List<Alveolus> alveoli,
                    final List<Requirement> requirements) {
        // no-op
    }

    public List<Alveolus> getAlveoli() {
        return alveoli;
    }

    public void setAlveoli(final List<Alveolus> alveoli) {
        this.alveoli = alveoli;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(final List<Requirement> requirements) {
        this.requirements = requirements;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                alveoli,
                requirements);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Manifest)) {
            return false;
        }
        final Manifest __otherCasted = (Manifest) __other;
        return Objects.equals(alveoli, __otherCasted.alveoli) &&
            Objects.equals(requirements, __otherCasted.requirements);
    }

    public Manifest alveoli(final List<Alveolus> alveoli) {
        this.alveoli = alveoli;
        return this;
    }

    public Manifest requirements(final List<Requirement> requirements) {
        this.requirements = requirements;
        return this;
    }

    @Override
    public Manifest validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (alveoli != null ? "\"alveoli\":" + alveoli.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (requirements != null ? "\"requirements\":" + requirements.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }

    public Manifest writeTo(final Path path) {
        try {
            final var logger = Logger.getLogger(getClass().getName());
            final var bundlebee = Files.createDirectories(path.resolve("bundlebee"));
            final var k8s = Files.createDirectories(bundlebee.resolve("kubernetes"));

            final var manifestJson = bundlebee.resolve("manifest.json");
            Files.writeString(manifestJson, asJson());
            logger.info(() -> "Wrote '" + manifestJson + "'");

            if (alveoli != null) {
                for (final var alveolus : alveoli) {
                    if (alveolus.getDescriptors() == null) {
                        continue;
                    }

                    for (final var desc : alveolus.getDescriptors()) {
                        final var file = k8s.resolve(desc.getLocation());
                        final var underlyingDescriptor = desc.underlyingDescriptor();
                        if (underlyingDescriptor != null) {
                            final var asJson = underlyingDescriptor.getClass().getMethod("asJson");
                            if (!asJson.canAccess(underlyingDescriptor)) {
                                asJson.setAccessible(true);
                            }
                            Files.writeString(file, asJson.invoke(underlyingDescriptor).toString());
                            logger.info(() -> "Wrote '" + file + "'");
                        }
                    }
                }
            }
        } catch (final NoSuchMethodException | IllegalAccessException e) {
            throw new IllegalStateException("Invalid descriptor", e);
        } catch (final InvocationTargetException e) {
            throw new IllegalStateException("Invalid descriptor", e.getTargetException());
        } catch (final IOException ioe) {
            throw new IllegalStateException(ioe);
        }
        return this;
    }
}
