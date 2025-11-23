package io.yupiik.kubernetes.bindings.v1_26_0.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_26_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_0.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ParamRef implements Validable<ParamRef>, Exportable {
    private String name;
    private String namespace;

    public ParamRef() {
        // no-op
    }

    public ParamRef(final String name,
                    final String namespace) {
        this.name = name;
        this.namespace = namespace;
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
        if (!(__other instanceof ParamRef)) {
            return false;
        }
        final ParamRef __otherCasted = (ParamRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace);
    }

    public ParamRef name(final String name) {
        this.name = name;
        return this;
    }

    public ParamRef namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public ParamRef validate() {
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
