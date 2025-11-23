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
    private List<IgnoredLintingRule> ignoredLintingRules;
    private Boolean interpolateAlveoli;
    private List<ManifestReference> references;
    private List<Requirement> requirements;

    public Manifest() {
        // no-op
    }

    public Manifest(final List<Alveolus> alveoli,
                    final List<IgnoredLintingRule> ignoredLintingRules,
                    final Boolean interpolateAlveoli,
                    final List<ManifestReference> references,
                    final List<Requirement> requirements) {
        this.alveoli = alveoli;
        this.ignoredLintingRules = ignoredLintingRules;
        this.interpolateAlveoli = interpolateAlveoli;
        this.references = references;
        this.requirements = requirements;
    }

    public List<Alveolus> getAlveoli() {
        return alveoli;
    }

    public void setAlveoli(final List<Alveolus> alveoli) {
        this.alveoli = alveoli;
    }

    public List<IgnoredLintingRule> getIgnoredLintingRules() {
        return ignoredLintingRules;
    }

    public void setIgnoredLintingRules(final List<IgnoredLintingRule> ignoredLintingRules) {
        this.ignoredLintingRules = ignoredLintingRules;
    }

    public Boolean getInterpolateAlveoli() {
        return interpolateAlveoli;
    }

    public void setInterpolateAlveoli(final Boolean interpolateAlveoli) {
        this.interpolateAlveoli = interpolateAlveoli;
    }

    public List<ManifestReference> getReferences() {
        return references;
    }

    public void setReferences(final List<ManifestReference> references) {
        this.references = references;
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
                ignoredLintingRules,
                interpolateAlveoli,
                references,
                requirements);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Manifest)) {
            return false;
        }
        final Manifest __otherCasted = (Manifest) __other;
        return Objects.equals(alveoli, __otherCasted.alveoli) &&
            Objects.equals(ignoredLintingRules, __otherCasted.ignoredLintingRules) &&
            Objects.equals(interpolateAlveoli, __otherCasted.interpolateAlveoli) &&
            Objects.equals(references, __otherCasted.references) &&
            Objects.equals(requirements, __otherCasted.requirements);
    }

    public Manifest alveoli(final List<Alveolus> alveoli) {
        this.alveoli = alveoli;
        return this;
    }

    public Manifest ignoredLintingRules(final List<IgnoredLintingRule> ignoredLintingRules) {
        this.ignoredLintingRules = ignoredLintingRules;
        return this;
    }

    public Manifest interpolateAlveoli(final Boolean interpolateAlveoli) {
        this.interpolateAlveoli = interpolateAlveoli;
        return this;
    }

    public Manifest references(final List<ManifestReference> references) {
        this.references = references;
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
                    (ignoredLintingRules != null ? "\"ignoredLintingRules\":" + ignoredLintingRules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (interpolateAlveoli != null ? "\"interpolateAlveoli\":" + interpolateAlveoli : ""),
                    (references != null ? "\"references\":" + references.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
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
