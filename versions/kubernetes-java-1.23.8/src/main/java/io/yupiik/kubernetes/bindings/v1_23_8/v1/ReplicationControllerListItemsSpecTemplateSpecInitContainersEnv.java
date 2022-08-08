package io.yupiik.kubernetes.bindings.v1_23_8.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnv(final String name,
                                                                           final String value,
                                                                           final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnv __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
