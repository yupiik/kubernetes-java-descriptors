package io.yupiik.kubernetes.bindings.v1_19_16;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EndpointSliceEndpoints {
    private List<String> addresses;
    private EndpointSliceEndpointsConditions conditions;
    private String hostname;
    private EndpointSliceEndpointsTargetRef targetRef;
    private Map<String, String> topology;

    public EndpointSliceEndpoints() {
        // no-op
    }

    public EndpointSliceEndpoints(final List<String> addresses,
                                  final EndpointSliceEndpointsConditions conditions,
                                  final String hostname,
                                  final EndpointSliceEndpointsTargetRef targetRef,
                                  final Map<String, String> topology) {
        // no-op
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<String> addresses) {
        this.addresses = addresses;
    }

    public EndpointSliceEndpointsConditions getConditions() {
        return conditions;
    }

    public void setConditions(final EndpointSliceEndpointsConditions conditions) {
        this.conditions = conditions;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public EndpointSliceEndpointsTargetRef getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(final EndpointSliceEndpointsTargetRef targetRef) {
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
        if (!(__other instanceof EndpointSliceEndpoints)) {
            return false;
        }
        final EndpointSliceEndpoints __otherCasted = (EndpointSliceEndpoints) __other;
        return Objects.equals(addresses, __otherCasted.addresses) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(targetRef, __otherCasted.targetRef) &&
            Objects.equals(topology, __otherCasted.topology);
    }
}
