package io.yupiik.kubernetes.bindings.v1_18_16;

import java.util.Objects;

public class LocalSubjectAccessReviewSpecResourceAttributes {
    private String group;
    private String name;
    private String namespace;
    private String resource;
    private String subresource;
    private String verb;
    private String version;

    public LocalSubjectAccessReviewSpecResourceAttributes() {
        // no-op
    }

    public LocalSubjectAccessReviewSpecResourceAttributes(final String group,
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
        if (!(__other instanceof LocalSubjectAccessReviewSpecResourceAttributes)) {
            return false;
        }
        final LocalSubjectAccessReviewSpecResourceAttributes __otherCasted = (LocalSubjectAccessReviewSpecResourceAttributes) __other;
        return Objects.equals(group, __otherCasted.group) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(subresource, __otherCasted.subresource) &&
            Objects.equals(verb, __otherCasted.verb) &&
            Objects.equals(version, __otherCasted.version);
    }
}
