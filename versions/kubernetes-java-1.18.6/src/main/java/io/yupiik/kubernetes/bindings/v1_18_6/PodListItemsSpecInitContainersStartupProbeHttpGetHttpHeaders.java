package io.yupiik.kubernetes.bindings.v1_18_6;

import java.util.Objects;

public class PodListItemsSpecInitContainersStartupProbeHttpGetHttpHeaders {
    private String name;
    private String value;

    public PodListItemsSpecInitContainersStartupProbeHttpGetHttpHeaders() {
        // no-op
    }

    public PodListItemsSpecInitContainersStartupProbeHttpGetHttpHeaders(final String name,
                                                                        final String value) {
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

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecInitContainersStartupProbeHttpGetHttpHeaders)) {
            return false;
        }
        final PodListItemsSpecInitContainersStartupProbeHttpGetHttpHeaders __otherCasted = (PodListItemsSpecInitContainersStartupProbeHttpGetHttpHeaders) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }
}
