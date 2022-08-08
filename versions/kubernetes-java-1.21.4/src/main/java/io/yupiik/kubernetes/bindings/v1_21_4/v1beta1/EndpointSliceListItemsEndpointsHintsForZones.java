package io.yupiik.kubernetes.bindings.v1_21_4.v1beta1;

import java.util.Objects;

public class EndpointSliceListItemsEndpointsHintsForZones {
    private String name;

    public EndpointSliceListItemsEndpointsHintsForZones() {
        // no-op
    }

    public EndpointSliceListItemsEndpointsHintsForZones(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointSliceListItemsEndpointsHintsForZones)) {
            return false;
        }
        final EndpointSliceListItemsEndpointsHintsForZones __otherCasted = (EndpointSliceListItemsEndpointsHintsForZones) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
