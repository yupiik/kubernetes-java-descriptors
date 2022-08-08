package io.yupiik.kubernetes.bindings.v1_10_3.v1;

import io.yupiik.kubernetes.bindings.v1_10_3.Validable;
import io.yupiik.kubernetes.bindings.v1_10_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NodeAddress implements Validable<NodeAddress> {
    private String address;
    private String type;

    public NodeAddress() {
        // no-op
    }

    public NodeAddress(final String address,
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
        if (!(__other instanceof NodeAddress)) {
            return false;
        }
        final NodeAddress __otherCasted = (NodeAddress) __other;
        return Objects.equals(address, __otherCasted.address) &&
            Objects.equals(type, __otherCasted.type);
    }

    public NodeAddress address(final String address) {
        this.address = address;
        return this;
    }

    public NodeAddress type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public NodeAddress validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (address == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "address", "address",
                "Missing 'address' attribute.", true));
        }
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
