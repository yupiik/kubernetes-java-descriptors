package io.yupiik.kubernetes.bindings.v1_23_10.v1;

import io.yupiik.kubernetes.bindings.v1_23_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_10.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeNodeAffinity implements Validable<VolumeNodeAffinity>, Exportable {
    private NodeSelector required;

    public VolumeNodeAffinity() {
        // no-op
    }

    public VolumeNodeAffinity(final NodeSelector required) {
        this.required = required;
    }

    public NodeSelector getRequired() {
        return required;
    }

    public void setRequired(final NodeSelector required) {
        this.required = required;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                required);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeNodeAffinity)) {
            return false;
        }
        final VolumeNodeAffinity __otherCasted = (VolumeNodeAffinity) __other;
        return Objects.equals(required, __otherCasted.required);
    }

    public VolumeNodeAffinity required(final NodeSelector required) {
        this.required = required;
        return this;
    }

    @Override
    public VolumeNodeAffinity validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (required != null ? "\"required\":" + required.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
