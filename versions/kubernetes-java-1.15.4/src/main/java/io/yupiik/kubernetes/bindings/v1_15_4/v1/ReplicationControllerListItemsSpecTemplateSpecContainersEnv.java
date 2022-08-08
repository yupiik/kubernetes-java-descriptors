package io.yupiik.kubernetes.bindings.v1_15_4.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnv(final String name,
                                                                       final String value,
                                                                       final ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersEnv __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
