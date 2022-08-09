package io.yupiik.kubernetes.bindings.v1_20_10.v1;

import io.yupiik.kubernetes.bindings.v1_20_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_10.Validable;
import io.yupiik.kubernetes.bindings.v1_20_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EndpointSubset implements Validable<EndpointSubset>, Exportable {
    private List<EndpointAddress> addresses;
    private List<EndpointAddress> notReadyAddresses;
    private List<EndpointPort> ports;

    public EndpointSubset() {
        // no-op
    }

    public EndpointSubset(final List<EndpointAddress> addresses,
                          final List<EndpointAddress> notReadyAddresses,
                          final List<EndpointPort> ports) {
        // no-op
    }

    public List<EndpointAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<EndpointAddress> addresses) {
        this.addresses = addresses;
    }

    public List<EndpointAddress> getNotReadyAddresses() {
        return notReadyAddresses;
    }

    public void setNotReadyAddresses(final List<EndpointAddress> notReadyAddresses) {
        this.notReadyAddresses = notReadyAddresses;
    }

    public List<EndpointPort> getPorts() {
        return ports;
    }

    public void setPorts(final List<EndpointPort> ports) {
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
        if (!(__other instanceof EndpointSubset)) {
            return false;
        }
        final EndpointSubset __otherCasted = (EndpointSubset) __other;
        return Objects.equals(addresses, __otherCasted.addresses) &&
            Objects.equals(notReadyAddresses, __otherCasted.notReadyAddresses) &&
            Objects.equals(ports, __otherCasted.ports);
    }

    public EndpointSubset addresses(final List<EndpointAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public EndpointSubset notReadyAddresses(final List<EndpointAddress> notReadyAddresses) {
        this.notReadyAddresses = notReadyAddresses;
        return this;
    }

    public EndpointSubset ports(final List<EndpointPort> ports) {
        this.ports = ports;
        return this;
    }

    @Override
    public EndpointSubset validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (addresses != null ? "\"addresses\":" + addresses.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (notReadyAddresses != null ? "\"notReadyAddresses\":" + notReadyAddresses.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (ports != null ? "\"ports\":" + ports.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
