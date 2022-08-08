package io.yupiik.kubernetes.bindings.v1_19_6;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnv(final String name,
                                                                    final String value,
                                                                    final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnv __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
