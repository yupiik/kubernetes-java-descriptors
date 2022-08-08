package io.yupiik.kubernetes.bindings.v1_18_4.v1;

import java.util.Objects;

public class JobSpecTemplateSpecContainersEnvFromSecretRef {
    private String name;
    private Boolean optional;

    public JobSpecTemplateSpecContainersEnvFromSecretRef() {
        // no-op
    }

    public JobSpecTemplateSpecContainersEnvFromSecretRef(final String name,
                                                         final Boolean optional) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobSpecTemplateSpecContainersEnvFromSecretRef)) {
            return false;
        }
        final JobSpecTemplateSpecContainersEnvFromSecretRef __otherCasted = (JobSpecTemplateSpecContainersEnvFromSecretRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
