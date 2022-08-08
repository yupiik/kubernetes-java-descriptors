package io.yupiik.kubernetes.bindings.v1_21_12.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private ReplicaSetSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public ReplicaSetSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersEnv(final String name,
                                                   final String value,
                                                   final ReplicaSetSpecTemplateSpecContainersEnvValueFrom valueFrom) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public ReplicaSetSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final ReplicaSetSpecTemplateSpecContainersEnvValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value,
                valueFrom);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersEnv __otherCasted = (ReplicaSetSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
