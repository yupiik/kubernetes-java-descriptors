package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public ReplicaSetListItemsSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersEnv(final String name,
                                                            final String value,
                                                            final ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersEnv __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
