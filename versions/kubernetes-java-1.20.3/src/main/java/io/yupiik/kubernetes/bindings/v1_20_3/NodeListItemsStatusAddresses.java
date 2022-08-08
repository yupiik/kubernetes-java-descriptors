package io.yupiik.kubernetes.bindings.v1_20_3;

import java.util.Objects;

public class NodeListItemsStatusAddresses {
    private String address;
    private String type;

    public NodeListItemsStatusAddresses() {
        // no-op
    }

    public NodeListItemsStatusAddresses(final String address,
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
        if (!(__other instanceof NodeListItemsStatusAddresses)) {
            return false;
        }
        final NodeListItemsStatusAddresses __otherCasted = (NodeListItemsStatusAddresses) __other;
        return Objects.equals(address, __otherCasted.address) &&
            Objects.equals(type, __otherCasted.type);
    }
}
