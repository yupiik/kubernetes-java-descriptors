package io.yupiik.kubernetes.bindings.v1_16_3;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public JobListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (JobListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
