package io.yupiik.kubernetes.bindings.v1_16_9.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private ReplicaSetSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public ReplicaSetSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersEnv(final String name,
                                                       final String value,
                                                       final ReplicaSetSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public ReplicaSetSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final ReplicaSetSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersEnv __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
