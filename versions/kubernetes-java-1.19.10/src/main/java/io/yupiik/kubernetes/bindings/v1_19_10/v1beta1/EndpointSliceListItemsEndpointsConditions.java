package io.yupiik.kubernetes.bindings.v1_19_10.v1beta1;

import java.util.Objects;

public class EndpointSliceListItemsEndpointsConditions {
    private Boolean ready;

    public EndpointSliceListItemsEndpointsConditions() {
        // no-op
    }

    public EndpointSliceListItemsEndpointsConditions(final Boolean ready) {
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
        if (!(__other instanceof EndpointSliceListItemsEndpointsConditions)) {
            return false;
        }
        final EndpointSliceListItemsEndpointsConditions __otherCasted = (EndpointSliceListItemsEndpointsConditions) __other;
        return Objects.equals(ready, __otherCasted.ready);
    }
}
