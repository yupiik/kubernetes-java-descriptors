package io.yupiik.kubernetes.bindings.v1_14_1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public JobSpecTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (JobSpecTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
