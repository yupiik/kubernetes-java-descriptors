package io.yupiik.kubernetes.bindings.v1_20_12.v1;

import java.util.Objects;

public class PodSpecContainersEnv {
    private String name;
    private String value;
    private PodSpecContainersEnvValueFrom valueFrom;

    public PodSpecContainersEnv() {
        // no-op
    }

    public PodSpecContainersEnv(final String name,
                                final String value,
                                final PodSpecContainersEnvValueFrom valueFrom) {
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

    public PodSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodSpecContainersEnv)) {
            return false;
        }
        final PodSpecContainersEnv __otherCasted = (PodSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
