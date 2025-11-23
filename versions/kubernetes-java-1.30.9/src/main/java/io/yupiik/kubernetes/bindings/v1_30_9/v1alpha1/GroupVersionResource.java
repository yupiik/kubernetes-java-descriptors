package io.yupiik.kubernetes.bindings.v1_30_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_30_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_9.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class GroupVersionResource implements Validable<GroupVersionResource>, Exportable {
    private String group;
    private String resource;
    private String version;

    public GroupVersionResource() {
        // no-op
    }

    public GroupVersionResource(final String group,
                                final String resource,
                                final String version) {
        this.group = group;
        this.resource = resource;
        this.version = version;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(final String resource) {
        this.resource = resource;
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
                resource,
                version);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof GroupVersionResource)) {
            return false;
        }
        final GroupVersionResource __otherCasted = (GroupVersionResource) __other;
        return Objects.equals(group, __otherCasted.group) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(version, __otherCasted.version);
    }

    public GroupVersionResource group(final String group) {
        this.group = group;
        return this;
    }

    public GroupVersionResource resource(final String resource) {
        this.resource = resource;
        return this;
    }

    public GroupVersionResource version(final String version) {
        this.version = version;
        return this;
    }

    @Override
    public GroupVersionResource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (group != null ? "\"group\":\"" +  JsonStrings.escapeJson(group) + "\"" : ""),
                    (resource != null ? "\"resource\":\"" +  JsonStrings.escapeJson(resource) + "\"" : ""),
                    (version != null ? "\"version\":\"" +  JsonStrings.escapeJson(version) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
