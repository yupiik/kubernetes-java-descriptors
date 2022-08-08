package io.yupiik.kubernetes.bindings.v1_18_17.v1beta1;

import java.util.Objects;

public class EndpointSliceEndpointsConditions {
    private Boolean ready;

    public EndpointSliceEndpointsConditions() {
        // no-op
    }

    public EndpointSliceEndpointsConditions(final Boolean ready) {
        // no-op
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(final Boolean ready) {
        this.ready = ready;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ready);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointSliceEndpointsConditions)) {
            return false;
        }
        final EndpointSliceEndpointsConditions __otherCasted = (EndpointSliceEndpointsConditions) __other;
        return Objects.equals(ready, __otherCasted.ready);
    }
}
