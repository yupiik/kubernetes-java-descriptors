package io.yupiik.kubernetes.bindings.v1_21_4;

import java.util.List;
import java.util.Objects;

public class EndpointsListItemsSubsets {
    private List<EndpointsListItemsSubsetsAddresses> addresses;
    private List<EndpointsListItemsSubsetsNotReadyAddresses> notReadyAddresses;
    private List<EndpointsListItemsSubsetsPorts> ports;

    public EndpointsListItemsSubsets() {
        // no-op
    }

    public EndpointsListItemsSubsets(final List<EndpointsListItemsSubsetsAddresses> addresses,
                                     final List<EndpointsListItemsSubsetsNotReadyAddresses> notReadyAddresses,
                                     final List<EndpointsListItemsSubsetsPorts> ports) {
        // no-op
    }

    public List<EndpointsListItemsSubsetsAddresses> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<EndpointsListItemsSubsetsAddresses> addresses) {
        this.addresses = addresses;
    }

    public List<EndpointsListItemsSubsetsNotReadyAddresses> getNotReadyAddresses() {
        return notReadyAddresses;
    }

    public void setNotReadyAddresses(final List<EndpointsListItemsSubsetsNotReadyAddresses> notReadyAddresses) {
        this.notReadyAddresses = notReadyAddresses;
    }

    public List<EndpointsListItemsSubsetsPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<EndpointsListItemsSubsetsPorts> ports) {
        this.ports = ports;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                addresses,
                notReadyAddresses,
                ports);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointsListItemsSubsets)) {
            return false;
        }
        final EndpointsListItemsSubsets __otherCasted = (EndpointsListItemsSubsets) __other;
        return Objects.equals(addresses, __otherCasted.addresses) &&
            Objects.equals(notReadyAddresses, __otherCasted.notReadyAddresses) &&
            Objects.equals(ports, __otherCasted.ports);
    }
}
