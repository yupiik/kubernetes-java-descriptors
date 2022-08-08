package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EndpointSliceListItemsEndpoints {
    private List<String> addresses;
    private EndpointSliceListItemsEndpointsConditions conditions;
    private Map<String, String> deprecatedTopology;
    private EndpointSliceListItemsEndpointsHints hints;
    private String hostname;
    private String nodeName;
    private EndpointSliceListItemsEndpointsTargetRef targetRef;
    private String zone;

    public EndpointSliceListItemsEndpoints() {
        // no-op
    }

    public EndpointSliceListItemsEndpoints(final List<String> addresses,
                                           final EndpointSliceListItemsEndpointsConditions conditions,
                                           final Map<String, String> deprecatedTopology,
                                           final EndpointSliceListItemsEndpointsHints hints,
                                           final String hostname,
                                           final String nodeName,
                                           final EndpointSliceListItemsEndpointsTargetRef targetRef,
                                           final String zone) {
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

    public Map<String, String> getDeprecatedTopology() {
        return deprecatedTopology;
    }

    public void setDeprecatedTopology(final Map<String, String> deprecatedTopology) {
        this.deprecatedTopology = deprecatedTopology;
    }

    public EndpointSliceListItemsEndpointsHints getHints() {
        return hints;
    }

    public void setHints(final EndpointSliceListItemsEndpointsHints hints) {
        this.hints = hints;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public EndpointSliceListItemsEndpointsTargetRef getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(final EndpointSliceListItemsEndpointsTargetRef targetRef) {
        this.targetRef = targetRef;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(final String zone) {
        this.zone = zone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                addresses,
                conditions,
                deprecatedTopology,
                hints,
                hostname,
                nodeName,
                targetRef,
                zone);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointSliceListItemsEndpoints)) {
            return false;
        }
        final EndpointSliceListItemsEndpoints __otherCasted = (EndpointSliceListItemsEndpoints) __other;
        return Objects.equals(addresses, __otherCasted.addresses) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(deprecatedTopology, __otherCasted.deprecatedTopology) &&
            Objects.equals(hints, __otherCasted.hints) &&
            Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(targetRef, __otherCasted.targetRef) &&
            Objects.equals(zone, __otherCasted.zone);
    }
}
