package io.yupiik.kubernetes.bindings.v1_16_4.v1;

import java.util.Objects;

public class PodSpecInitContainersEnv {
    private String name;
    private String value;
    private PodSpecInitContainersEnvValueFrom valueFrom;

    public PodSpecInitContainersEnv() {
        // no-op
    }

    public PodSpecInitContainersEnv(final String name,
                                    final String value,
                                    final PodSpecInitContainersEnvValueFrom valueFrom) {
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

    public PodSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodSpecInitContainersEnv)) {
            return false;
        }
        final PodSpecInitContainersEnv __otherCasted = (PodSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
