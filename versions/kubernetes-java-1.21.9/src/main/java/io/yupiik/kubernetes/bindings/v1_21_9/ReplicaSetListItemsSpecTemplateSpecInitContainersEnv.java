package io.yupiik.kubernetes.bindings.v1_21_9;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public ReplicaSetListItemsSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersEnv(final String name,
                                                                final String value,
                                                                final ReplicaSetListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public ReplicaSetListItemsSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final ReplicaSetListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecInitContainersEnv __otherCasted = (ReplicaSetListItemsSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
