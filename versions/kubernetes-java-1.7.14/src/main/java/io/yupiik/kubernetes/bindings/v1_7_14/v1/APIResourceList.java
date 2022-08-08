package io.yupiik.kubernetes.bindings.v1_7_14.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class APIResourceList {
    private String apiVersion;
    private String groupVersion;
    private String kind;
    private List<JsonValue> resources;

    public APIResourceList() {
        // no-op
    }

    public APIResourceList(final String apiVersion,
                           final String groupVersion,
                           final String kind,
                           final List<JsonValue> resources) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getGroupVersion() {
        return groupVersion;
    }

    public void setGroupVersion(final String groupVersion) {
        this.groupVersion = groupVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public List<JsonValue> getResources() {
        return resources;
    }

    public void setResources(final List<JsonValue> resources) {
        this.resources = resources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                groupVersion,
                kind,
                resources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIResourceList)) {
            return false;
        }
        final APIResourceList __otherCasted = (APIResourceList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(groupVersion, __otherCasted.groupVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(resources, __otherCasted.resources);
    }
}
