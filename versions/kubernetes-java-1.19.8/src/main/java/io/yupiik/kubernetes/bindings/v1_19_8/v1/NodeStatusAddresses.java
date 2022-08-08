package io.yupiik.kubernetes.bindings.v1_19_8.v1;

import java.util.Objects;

public class NodeStatusAddresses {
    private String address;
    private String type;

    public NodeStatusAddresses() {
        // no-op
    }

    public NodeStatusAddresses(final String address,
                               final String type) {
        // no-op
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                address,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeStatusAddresses)) {
            return false;
        }
        final NodeStatusAddresses __otherCasted = (NodeStatusAddresses) __other;
        return Objects.equals(address, __otherCasted.address) &&
            Objects.equals(type, __otherCasted.type);
    }
}
