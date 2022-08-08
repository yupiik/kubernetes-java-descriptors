package io.yupiik.kubernetes.bindings.v1_20_15;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public JobListItemsSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (JobListItemsSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
