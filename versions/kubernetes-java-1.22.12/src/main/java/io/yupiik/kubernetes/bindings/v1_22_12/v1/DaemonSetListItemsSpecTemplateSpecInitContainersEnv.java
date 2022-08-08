package io.yupiik.kubernetes.bindings.v1_22_12.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnv(final String name,
                                                               final String value,
                                                               final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersEnv __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
