package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import io.yupiik.kubernetes.bindings.bundlebee.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
}
