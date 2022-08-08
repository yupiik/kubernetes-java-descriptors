package io.yupiik.kubernetes.bindings.v1_16_3;

import java.util.Objects;

public class PodListItemsSpecContainersEnv {
    private String name;
    private String value;
    private PodListItemsSpecContainersEnvValueFrom valueFrom;

    public PodListItemsSpecContainersEnv() {
        // no-op
    }

    public PodListItemsSpecContainersEnv(final String name,
                                         final String value,
                                         final PodListItemsSpecContainersEnvValueFrom valueFrom) {
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

    public PodListItemsSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodListItemsSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodListItemsSpecContainersEnv)) {
            return false;
        }
        final PodListItemsSpecContainersEnv __otherCasted = (PodListItemsSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
