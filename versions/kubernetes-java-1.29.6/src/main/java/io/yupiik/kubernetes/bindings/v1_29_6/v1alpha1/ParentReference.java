package io.yupiik.kubernetes.bindings.v1_29_6.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_29_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_6.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ParentReference implements Validable<ParentReference>, Exportable {
    private String group;
    private String name;
    private String namespace;
    private String resource;

    public ParentReference() {
        // no-op
    }

    public ParentReference(final String group,
                           final String name,
                           final String namespace,
                           final String resource) {
        this.group = group;
        this.name = name;
        this.namespace = namespace;
        this.resource = resource;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
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

    public String getResource() {
        return resource;
    }

    public void setResource(final String resource) {
        this.resource = resource;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                group,
                name,
                namespace,
                resource);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ParentReference)) {
            return false;
        }
        final ParentReference __otherCasted = (ParentReference) __other;
        return Objects.equals(group, __otherCasted.group) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(resource, __otherCasted.resource);
    }

    public ParentReference group(final String group) {
        this.group = group;
        return this;
    }

    public ParentReference name(final String name) {
        this.name = name;
        return this;
    }

    public ParentReference namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ParentReference resource(final String resource) {
        this.resource = resource;
        return this;
    }

    @Override
    public ParentReference validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (group != null ? "\"group\":\"" +  JsonStrings.escapeJson(group) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""),
                    (resource != null ? "\"resource\":\"" +  JsonStrings.escapeJson(resource) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
