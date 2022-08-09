package io.yupiik.kubernetes.bindings.v1_19_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_8.Validable;
import io.yupiik.kubernetes.bindings.v1_19_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceReference implements Validable<ServiceReference>, Exportable {
    private String name;
    private String namespace;
    private Integer port;

    public ServiceReference() {
        // no-op
    }

    public ServiceReference(final String name,
                            final String namespace,
                            final Integer port) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(final Integer port) {
        this.port = port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                namespace,
                port);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceReference)) {
            return false;
        }
        final ServiceReference __otherCasted = (ServiceReference) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(port, __otherCasted.port);
    }

    public ServiceReference name(final String name) {
        this.name = name;
        return this;
    }

    public ServiceReference namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ServiceReference port(final Integer port) {
        this.port = port;
        return this;
    }

    @Override
    public ServiceReference validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""),
                    (port != null ? "\"port\":" + port : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
