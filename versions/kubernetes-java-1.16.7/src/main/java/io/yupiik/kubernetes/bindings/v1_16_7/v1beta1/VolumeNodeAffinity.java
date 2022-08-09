package io.yupiik.kubernetes.bindings.v1_16_7.v1beta1;

import io.yupiik.kubernetes.bindings.v1_16_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_7.Validable;
import io.yupiik.kubernetes.bindings.v1_16_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeNodeAffinity implements Validable<VolumeNodeAffinity>, Exportable {
    private NodeSelector required;

    public VolumeNodeAffinity() {
        // no-op
    }

    public VolumeNodeAffinity(final NodeSelector required) {
        // no-op
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
