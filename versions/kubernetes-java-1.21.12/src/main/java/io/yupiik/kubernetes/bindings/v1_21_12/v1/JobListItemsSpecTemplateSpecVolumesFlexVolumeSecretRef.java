package io.yupiik.kubernetes.bindings.v1_21_12.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public JobListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (JobListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
