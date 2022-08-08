package io.yupiik.kubernetes.bindings.v1_21_8;

import java.util.Objects;

public class EndpointSliceEndpointsHintsForZones {
    private String name;

    public EndpointSliceEndpointsHintsForZones() {
        // no-op
    }

    public EndpointSliceEndpointsHintsForZones(final String name) {
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
        if (!(__other instanceof EndpointSliceEndpointsHintsForZones)) {
            return false;
        }
        final EndpointSliceEndpointsHintsForZones __otherCasted = (EndpointSliceEndpointsHintsForZones) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
