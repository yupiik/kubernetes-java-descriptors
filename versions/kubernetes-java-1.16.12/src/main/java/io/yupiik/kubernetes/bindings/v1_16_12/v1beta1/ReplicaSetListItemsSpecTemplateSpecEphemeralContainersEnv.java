package io.yupiik.kubernetes.bindings.v1_16_12.v1beta1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnv(final String name,
                                                                     final String value,
                                                                     final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnv __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
