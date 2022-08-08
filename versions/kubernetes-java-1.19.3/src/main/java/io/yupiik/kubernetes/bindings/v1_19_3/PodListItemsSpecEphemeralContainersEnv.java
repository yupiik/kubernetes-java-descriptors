package io.yupiik.kubernetes.bindings.v1_19_3;

import java.util.Objects;

public class PodListItemsSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private PodListItemsSpecEphemeralContainersEnvValueFrom valueFrom;

    public PodListItemsSpecEphemeralContainersEnv() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersEnv(final String name,
                                                  final String value,
                                                  final PodListItemsSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public PodListItemsSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodListItemsSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersEnv)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersEnv __otherCasted = (PodListItemsSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
