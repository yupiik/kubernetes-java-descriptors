package io.yupiik.kubernetes.bindings.v1_22_11;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private DaemonSetSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public DaemonSetSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersEnv(final String name,
                                                  final String value,
                                                  final DaemonSetSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public DaemonSetSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final DaemonSetSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersEnv __otherCasted = (DaemonSetSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
