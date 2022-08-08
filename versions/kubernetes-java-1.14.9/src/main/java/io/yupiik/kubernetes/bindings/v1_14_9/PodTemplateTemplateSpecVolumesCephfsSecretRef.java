package io.yupiik.kubernetes.bindings.v1_14_9;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public PodTemplateTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesCephfsSecretRef __otherCasted = (PodTemplateTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
