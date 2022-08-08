package io.yupiik.kubernetes.bindings.v1_22_0.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public PodTemplateTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesScaleIOSecretRef(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesScaleIOSecretRef __otherCasted = (PodTemplateTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
