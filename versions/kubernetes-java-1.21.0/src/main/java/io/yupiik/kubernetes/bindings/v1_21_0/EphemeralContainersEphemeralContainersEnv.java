package io.yupiik.kubernetes.bindings.v1_21_0;

import java.util.Objects;

public class EphemeralContainersEphemeralContainersEnv {
    private String name;
    private String value;
    private EphemeralContainersEphemeralContainersEnvValueFrom valueFrom;

    public EphemeralContainersEphemeralContainersEnv() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersEnv(final String name,
                                                     final String value,
                                                     final EphemeralContainersEphemeralContainersEnvValueFrom valueFrom) {
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

    public EphemeralContainersEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final EphemeralContainersEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof EphemeralContainersEphemeralContainersEnv)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersEnv __otherCasted = (EphemeralContainersEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
