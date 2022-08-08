package io.yupiik.kubernetes.bindings.v1_23_7.v1;

import java.util.Objects;

public class IngressListItemsSpecDefaultBackendServicePort {
    private String name;
    private Integer number;

    public IngressListItemsSpecDefaultBackendServicePort() {
        // no-op
    }

    public IngressListItemsSpecDefaultBackendServicePort(final String name,
                                                         final Integer number) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(final Integer number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                number);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressListItemsSpecDefaultBackendServicePort)) {
            return false;
        }
        final IngressListItemsSpecDefaultBackendServicePort __otherCasted = (IngressListItemsSpecDefaultBackendServicePort) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(number, __otherCasted.number);
    }
}
