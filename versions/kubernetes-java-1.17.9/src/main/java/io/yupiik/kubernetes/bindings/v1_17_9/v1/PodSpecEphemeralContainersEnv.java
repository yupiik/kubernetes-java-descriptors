package io.yupiik.kubernetes.bindings.v1_17_9.v1;

import java.util.Objects;

public class PodSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private PodSpecEphemeralContainersEnvValueFrom valueFrom;

    public PodSpecEphemeralContainersEnv() {
        // no-op
    }

    public PodSpecEphemeralContainersEnv(final String name,
                                         final String value,
                                         final PodSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public PodSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodSpecEphemeralContainersEnv)) {
            return false;
        }
        final PodSpecEphemeralContainersEnv __otherCasted = (PodSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
