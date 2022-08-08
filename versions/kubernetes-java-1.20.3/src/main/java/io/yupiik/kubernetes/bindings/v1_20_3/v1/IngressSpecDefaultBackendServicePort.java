package io.yupiik.kubernetes.bindings.v1_20_3.v1;

import java.util.Objects;

public class IngressSpecDefaultBackendServicePort {
    private String name;
    private Integer number;

    public IngressSpecDefaultBackendServicePort() {
        // no-op
    }

    public IngressSpecDefaultBackendServicePort(final String name,
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
        if (!(__other instanceof IngressSpecDefaultBackendServicePort)) {
            return false;
        }
        final IngressSpecDefaultBackendServicePort __otherCasted = (IngressSpecDefaultBackendServicePort) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(number, __otherCasted.number);
    }
}
