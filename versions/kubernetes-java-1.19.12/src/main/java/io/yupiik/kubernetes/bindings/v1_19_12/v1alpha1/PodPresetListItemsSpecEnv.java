package io.yupiik.kubernetes.bindings.v1_19_12.v1alpha1;

import java.util.Objects;

public class PodPresetListItemsSpecEnv {
    private String name;
    private String value;
    private PodPresetListItemsSpecEnvValueFrom valueFrom;

    public PodPresetListItemsSpecEnv() {
        // no-op
    }

    public PodPresetListItemsSpecEnv(final String name,
                                     final String value,
                                     final PodPresetListItemsSpecEnvValueFrom valueFrom) {
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

    public PodPresetListItemsSpecEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodPresetListItemsSpecEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodPresetListItemsSpecEnv)) {
            return false;
        }
        final PodPresetListItemsSpecEnv __otherCasted = (PodPresetListItemsSpecEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
