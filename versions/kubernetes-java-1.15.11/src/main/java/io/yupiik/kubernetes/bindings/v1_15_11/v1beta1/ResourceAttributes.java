package io.yupiik.kubernetes.bindings.v1_15_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_11.Validable;
import io.yupiik.kubernetes.bindings.v1_15_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResourceAttributes implements Validable<ResourceAttributes> {
    private String group;
    private String name;
    private String namespace;
    private String resource;
    private String subresource;
    private String verb;
    private String version;

    public ResourceAttributes() {
        // no-op
    }

    public ResourceAttributes(final String group,
                              final String name,
                              final String namespace,
                              final String resource,
                              final String subresource,
                              final String verb,
                              final String version) {
        // no-op
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

    public String getSubresource() {
        return subresource;
    }

    public void setSubresource(final String subresource) {
        this.subresource = subresource;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(final String verb) {
        this.verb = verb;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                group,
                name,
                namespace,
                resource,
                subresource,
                verb,
                version);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceAttributes)) {
            return false;
        }
        final ResourceAttributes __otherCasted = (ResourceAttributes) __other;
        return Objects.equals(group, __otherCasted.group) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(subresource, __otherCasted.subresource) &&
            Objects.equals(verb, __otherCasted.verb) &&
            Objects.equals(version, __otherCasted.version);
    }

    public ResourceAttributes group(final String group) {
        this.group = group;
        return this;
    }

    public ResourceAttributes name(final String name) {
        this.name = name;
        return this;
    }

    public ResourceAttributes namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ResourceAttributes resource(final String resource) {
        this.resource = resource;
        return this;
    }

    public ResourceAttributes subresource(final String subresource) {
        this.subresource = subresource;
        return this;
    }

    public ResourceAttributes verb(final String verb) {
        this.verb = verb;
        return this;
    }

    public ResourceAttributes version(final String version) {
        this.version = version;
        return this;
    }

    @Override
    public ResourceAttributes validate() {
        return this;
    }
}
