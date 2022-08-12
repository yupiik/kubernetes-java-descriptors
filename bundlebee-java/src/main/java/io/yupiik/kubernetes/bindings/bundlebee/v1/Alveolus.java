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
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Alveolus implements Validable<Alveolus>, Exportable {
    private List<AlveolusDependency> dependencies;
    private List<Descriptor> descriptors;
    private List<DescriptorRef> excludedDescriptors;
    private String name;
    private List<Patch> patches;
    private Map<String, String> placeholders;
    private String version;

    public Alveolus() {
        // no-op
    }

    public Alveolus(final List<AlveolusDependency> dependencies,
                    final List<Descriptor> descriptors,
                    final List<DescriptorRef> excludedDescriptors,
                    final String name,
                    final List<Patch> patches,
                    final Map<String, String> placeholders,
                    final String version) {
        // no-op
    }

    public List<AlveolusDependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(final List<AlveolusDependency> dependencies) {
        this.dependencies = dependencies;
    }

    public List<Descriptor> getDescriptors() {
        return descriptors;
    }

    public void setDescriptors(final List<Descriptor> descriptors) {
        this.descriptors = descriptors;
    }

    public List<DescriptorRef> getExcludedDescriptors() {
        return excludedDescriptors;
    }

    public void setExcludedDescriptors(final List<DescriptorRef> excludedDescriptors) {
        this.excludedDescriptors = excludedDescriptors;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Patch> getPatches() {
        return patches;
    }

    public void setPatches(final List<Patch> patches) {
        this.patches = patches;
    }

    public Map<String, String> getPlaceholders() {
        return placeholders;
    }

    public void setPlaceholders(final Map<String, String> placeholders) {
        this.placeholders = placeholders;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                dependencies,
                descriptors,
                excludedDescriptors,
                name,
                patches,
                placeholders,
                version);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Alveolus)) {
            return false;
        }
        final Alveolus __otherCasted = (Alveolus) __other;
        return Objects.equals(dependencies, __otherCasted.dependencies) &&
            Objects.equals(descriptors, __otherCasted.descriptors) &&
            Objects.equals(excludedDescriptors, __otherCasted.excludedDescriptors) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(patches, __otherCasted.patches) &&
            Objects.equals(placeholders, __otherCasted.placeholders) &&
            Objects.equals(version, __otherCasted.version);
    }

    public Alveolus dependencies(final List<AlveolusDependency> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public Alveolus descriptors(final List<Descriptor> descriptors) {
        this.descriptors = descriptors;
        return this;
    }

    public Alveolus excludedDescriptors(final List<DescriptorRef> excludedDescriptors) {
        this.excludedDescriptors = excludedDescriptors;
        return this;
    }

    public Alveolus name(final String name) {
        this.name = name;
        return this;
    }

    public Alveolus patches(final List<Patch> patches) {
        this.patches = patches;
        return this;
    }

    public Alveolus placeholders(final Map<String, String> placeholders) {
        this.placeholders = placeholders;
        return this;
    }

    public Alveolus version(final String version) {
        this.version = version;
        return this;
    }

    @Override
    public Alveolus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (dependencies != null ? "\"dependencies\":" + dependencies.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (descriptors != null ? "\"descriptors\":" + descriptors.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (excludedDescriptors != null ? "\"excludedDescriptors\":" + excludedDescriptors.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (patches != null ? "\"patches\":" + patches.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (placeholders != null ? "\"placeholders\":" + placeholders.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (version != null ? "\"version\":\"" +  JsonStrings.escapeJson(version) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
