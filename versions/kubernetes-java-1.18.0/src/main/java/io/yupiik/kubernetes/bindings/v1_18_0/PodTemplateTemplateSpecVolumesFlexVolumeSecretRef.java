package io.yupiik.kubernetes.bindings.v1_18_0;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public PodTemplateTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (PodTemplateTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
