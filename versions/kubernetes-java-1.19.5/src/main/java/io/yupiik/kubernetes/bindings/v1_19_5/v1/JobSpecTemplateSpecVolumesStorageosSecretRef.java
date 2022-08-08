package io.yupiik.kubernetes.bindings.v1_19_5.v1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public JobSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (JobSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
