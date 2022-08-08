package io.yupiik.kubernetes.bindings.v1_22_1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public JobListItemsSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (JobListItemsSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
