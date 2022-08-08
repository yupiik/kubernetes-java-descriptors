package io.yupiik.kubernetes.bindings.v1_22_4;

import java.util.Objects;

public class PodListItemsSpecInitContainersEnv {
    private String name;
    private String value;
    private PodListItemsSpecInitContainersEnvValueFrom valueFrom;

    public PodListItemsSpecInitContainersEnv() {
        // no-op
    }

    public PodListItemsSpecInitContainersEnv(final String name,
                                             final String value,
                                             final PodListItemsSpecInitContainersEnvValueFrom valueFrom) {
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

    public PodListItemsSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodListItemsSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodListItemsSpecInitContainersEnv)) {
            return false;
        }
        final PodListItemsSpecInitContainersEnv __otherCasted = (PodListItemsSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
