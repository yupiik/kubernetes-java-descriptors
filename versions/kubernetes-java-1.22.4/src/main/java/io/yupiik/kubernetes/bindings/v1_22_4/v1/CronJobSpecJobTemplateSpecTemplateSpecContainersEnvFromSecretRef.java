package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef {
    private String name;
    private Boolean optional;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef(final String name,
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
