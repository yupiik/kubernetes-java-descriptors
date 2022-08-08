package io.yupiik.kubernetes.bindings.v1_21_8.v1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public JobSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (JobSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
