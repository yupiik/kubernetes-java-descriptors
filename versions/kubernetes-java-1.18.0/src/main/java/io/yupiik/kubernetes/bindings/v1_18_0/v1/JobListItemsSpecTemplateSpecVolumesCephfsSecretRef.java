package io.yupiik.kubernetes.bindings.v1_18_0.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public JobListItemsSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (JobListItemsSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
