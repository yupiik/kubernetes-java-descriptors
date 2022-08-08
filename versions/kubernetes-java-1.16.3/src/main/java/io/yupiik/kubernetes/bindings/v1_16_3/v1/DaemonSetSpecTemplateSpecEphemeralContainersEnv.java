package io.yupiik.kubernetes.bindings.v1_16_3.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private DaemonSetSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public DaemonSetSpecTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersEnv(final String name,
                                                           final String value,
                                                           final DaemonSetSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public DaemonSetSpecTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final DaemonSetSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersEnv __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
