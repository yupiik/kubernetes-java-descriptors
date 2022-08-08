package io.yupiik.kubernetes.bindings.v1_16_7;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private DaemonSetSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public DaemonSetSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersEnv(final String name,
                                                      final String value,
                                                      final DaemonSetSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public DaemonSetSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final DaemonSetSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersEnv __otherCasted = (DaemonSetSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
