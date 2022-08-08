package io.yupiik.kubernetes.bindings.v1_19_8.v1;

import java.util.Objects;

public class JobSpecTemplateSpecImagePullSecrets {
    private String name;

    public JobSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public JobSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof JobSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final JobSpecTemplateSpecImagePullSecrets __otherCasted = (JobSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
