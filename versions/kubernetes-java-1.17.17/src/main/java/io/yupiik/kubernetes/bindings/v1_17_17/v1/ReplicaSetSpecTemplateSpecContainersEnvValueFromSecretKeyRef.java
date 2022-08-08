package io.yupiik.kubernetes.bindings.v1_17_17.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef {
    private String key;
    private String name;
    private Boolean optional;

    public ReplicaSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef(final String key,
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef __otherCasted = (ReplicaSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
