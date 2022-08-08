package io.yupiik.kubernetes.bindings.v1_19_2;

import java.util.List;
import java.util.Objects;

public class EndpointsSubsets {
    private List<EndpointsSubsetsAddresses> addresses;
    private List<EndpointsSubsetsNotReadyAddresses> notReadyAddresses;
    private List<EndpointsSubsetsPorts> ports;

    public EndpointsSubsets() {
        // no-op
    }

    public EndpointsSubsets(final List<EndpointsSubsetsAddresses> addresses,
                            final List<EndpointsSubsetsNotReadyAddresses> notReadyAddresses,
                            final List<EndpointsSubsetsPorts> ports) {
        // no-op
    }

    public List<EndpointsSubsetsAddresses> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<EndpointsSubsetsAddresses> addresses) {
        this.addresses = addresses;
    }

    public List<EndpointsSubsetsNotReadyAddresses> getNotReadyAddresses() {
        return notReadyAddresses;
    }

    public void setNotReadyAddresses(final List<EndpointsSubsetsNotReadyAddresses> notReadyAddresses) {
        this.notReadyAddresses = notReadyAddresses;
    }

    public List<EndpointsSubsetsPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<EndpointsSubsetsPorts> ports) {
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
        if (!(__other instanceof EndpointsSubsets)) {
            return false;
        }
        final EndpointsSubsets __otherCasted = (EndpointsSubsets) __other;
        return Objects.equals(addresses, __otherCasted.addresses) &&
            Objects.equals(notReadyAddresses, __otherCasted.notReadyAddresses) &&
            Objects.equals(ports, __otherCasted.ports);
    }
}
