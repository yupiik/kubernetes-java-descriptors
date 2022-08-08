package io.yupiik.kubernetes.bindings.v1_16_10.v1;

import java.util.Objects;

public class JobSpecTemplateSpecContainersEnvValueFromSecretKeyRef {
    private String key;
    private String name;
    private Boolean optional;

    public JobSpecTemplateSpecContainersEnvValueFromSecretKeyRef() {
        // no-op
    }

    public JobSpecTemplateSpecContainersEnvValueFromSecretKeyRef(final String key,
                                                                 final String name,
                                                                 final Boolean optional) {
        // no-op
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
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
                key,
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobSpecTemplateSpecContainersEnvValueFromSecretKeyRef)) {
            return false;
        }
        final JobSpecTemplateSpecContainersEnvValueFromSecretKeyRef __otherCasted = (JobSpecTemplateSpecContainersEnvValueFromSecretKeyRef) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
