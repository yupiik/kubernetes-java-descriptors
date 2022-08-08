package io.yupiik.kubernetes.bindings.v1_18_9.v1beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EndpointSliceListItemsEndpoints {
    private List<String> addresses;
    private EndpointSliceListItemsEndpointsConditions conditions;
    private String hostname;
    private EndpointSliceListItemsEndpointsTargetRef targetRef;
    private Map<String, String> topology;

    public EndpointSliceListItemsEndpoints() {
        // no-op
    }

    public EndpointSliceListItemsEndpoints(final List<String> addresses,
                                           final EndpointSliceListItemsEndpointsConditions conditions,
                                           final String hostname,
                                           final EndpointSliceListItemsEndpointsTargetRef targetRef,
                                           final Map<String, String> topology) {
        // no-op
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<String> addresses) {
        this.addresses = addresses;
    }

    public EndpointSliceListItemsEndpointsConditions getConditions() {
        return conditions;
    }

    public void setConditions(final EndpointSliceListItemsEndpointsConditions conditions) {
        this.conditions = conditions;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public EndpointSliceListItemsEndpointsTargetRef getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(final EndpointSliceListItemsEndpointsTargetRef targetRef) {
        this.targetRef = targetRef;
    }

    public Map<String, String> getTopology() {
        return topology;
    }

    public void setTopology(final Map<String, String> topology) {
        this.topology = topology;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                addresses,
                conditions,
                hostname,
                targetRef,
                topology);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointSliceListItemsEndpoints)) {
            return false;
        }
        final EndpointSliceListItemsEndpoints __otherCasted = (EndpointSliceListItemsEndpoints) __other;
        return Objects.equals(addresses, __otherCasted.addresses) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(targetRef, __otherCasted.targetRef) &&
            Objects.equals(topology, __otherCasted.topology);
    }
}
