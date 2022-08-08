package io.yupiik.kubernetes.bindings.v1_17_11.v1alpha1;

import java.util.Objects;

public class PodPresetSpecEnv {
    private String name;
    private String value;
    private PodPresetSpecEnvValueFrom valueFrom;

    public PodPresetSpecEnv() {
        // no-op
    }

    public PodPresetSpecEnv(final String name,
                            final String value,
                            final PodPresetSpecEnvValueFrom valueFrom) {
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

    public PodPresetSpecEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodPresetSpecEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodPresetSpecEnv)) {
            return false;
        }
        final PodPresetSpecEnv __otherCasted = (PodPresetSpecEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
