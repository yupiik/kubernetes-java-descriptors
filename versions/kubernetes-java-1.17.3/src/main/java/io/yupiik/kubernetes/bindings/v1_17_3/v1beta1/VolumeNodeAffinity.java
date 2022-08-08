package io.yupiik.kubernetes.bindings.v1_17_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_3.Validable;
import io.yupiik.kubernetes.bindings.v1_17_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VolumeNodeAffinity implements Validable<VolumeNodeAffinity> {
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
}
