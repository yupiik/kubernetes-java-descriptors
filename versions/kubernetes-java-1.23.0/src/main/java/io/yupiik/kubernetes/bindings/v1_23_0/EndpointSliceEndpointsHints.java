package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.List;
import java.util.Objects;

public class EndpointSliceEndpointsHints {
    private List<EndpointSliceEndpointsHintsForZones> forZones;

    public EndpointSliceEndpointsHints() {
        // no-op
    }

    public EndpointSliceEndpointsHints(final List<EndpointSliceEndpointsHintsForZones> forZones) {
        // no-op
    }

    public List<EndpointSliceEndpointsHintsForZones> getForZones() {
        return forZones;
    }

    public void setForZones(final List<EndpointSliceEndpointsHintsForZones> forZones) {
        this.forZones = forZones;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                forZones);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointSliceEndpointsHints)) {
            return false;
        }
        final EndpointSliceEndpointsHints __otherCasted = (EndpointSliceEndpointsHints) __other;
        return Objects.equals(forZones, __otherCasted.forZones);
    }
}
