package io.yupiik.kubernetes.bindings.v1_15_11.v1;

import io.yupiik.kubernetes.bindings.v1_15_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_11.Validable;
import io.yupiik.kubernetes.bindings.v1_15_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SecretReference implements Validable<SecretReference>, Exportable {
    private String name;
    private String namespace;

    public SecretReference() {
        // no-op
    }

    public SecretReference(final String name,
                           final String namespace) {
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

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                namespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SecretReference)) {
            return false;
        }
        final SecretReference __otherCasted = (SecretReference) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace);
    }

    public SecretReference name(final String name) {
        this.name = name;
        return this;
    }

    public SecretReference namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public SecretReference validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
