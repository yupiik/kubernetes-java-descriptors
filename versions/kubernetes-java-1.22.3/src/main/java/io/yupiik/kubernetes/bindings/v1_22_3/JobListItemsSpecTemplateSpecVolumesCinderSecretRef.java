package io.yupiik.kubernetes.bindings.v1_22_3;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public JobListItemsSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (JobListItemsSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
