package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.List;
import java.util.Objects;

public class EndpointSliceListItemsEndpointsHints {
    private List<EndpointSliceListItemsEndpointsHintsForZones> forZones;

    public EndpointSliceListItemsEndpointsHints() {
        // no-op
    }

    public EndpointSliceListItemsEndpointsHints(final List<EndpointSliceListItemsEndpointsHintsForZones> forZones) {
        // no-op
    }

    public List<EndpointSliceListItemsEndpointsHintsForZones> getForZones() {
        return forZones;
    }

    public void setForZones(final List<EndpointSliceListItemsEndpointsHintsForZones> forZones) {
        this.forZones = forZones;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                forZones);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointSliceListItemsEndpointsHints)) {
            return false;
        }
        final EndpointSliceListItemsEndpointsHints __otherCasted = (EndpointSliceListItemsEndpointsHints) __other;
        return Objects.equals(forZones, __otherCasted.forZones);
    }
}
