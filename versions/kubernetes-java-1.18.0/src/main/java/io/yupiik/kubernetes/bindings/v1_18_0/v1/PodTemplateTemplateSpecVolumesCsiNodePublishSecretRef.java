package io.yupiik.kubernetes.bindings.v1_18_0.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public PodTemplateTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (PodTemplateTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
