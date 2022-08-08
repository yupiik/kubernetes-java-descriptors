package io.yupiik.kubernetes.bindings.v1_21_3;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public JobListItemsSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (JobListItemsSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
