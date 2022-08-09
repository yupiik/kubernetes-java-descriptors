package io.yupiik.kubernetes.bindings.v1_22_10.v1;

import io.yupiik.kubernetes.bindings.v1_22_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_10.Validable;
import io.yupiik.kubernetes.bindings.v1_22_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceBackendPort implements Validable<ServiceBackendPort>, Exportable {
    private String name;
    private Integer number;

    public ServiceBackendPort() {
        // no-op
    }

    public ServiceBackendPort(final String name,
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
        if (!(__other instanceof ServiceBackendPort)) {
            return false;
        }
        final ServiceBackendPort __otherCasted = (ServiceBackendPort) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(number, __otherCasted.number);
    }

    public ServiceBackendPort name(final String name) {
        this.name = name;
        return this;
    }

    public ServiceBackendPort number(final Integer number) {
        this.number = number;
        return this;
    }

    @Override
    public ServiceBackendPort validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (number != null ? "\"number\":" + number : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
