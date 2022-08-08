package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public JobListItemsSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (JobListItemsSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
