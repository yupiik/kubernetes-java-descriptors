package io.yupiik.kubernetes.bindings.v1_21_7;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecImagePullSecrets {
    private String name;

    public JobListItemsSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecImagePullSecrets __otherCasted = (JobListItemsSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
