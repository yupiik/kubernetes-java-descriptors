package io.yupiik.kubernetes.bindings.v1_10_3.v1alpha1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ClusterRoleList {
    private String apiVersion;
    private List<JsonValue> items;
    private String kind;
    private ClusterRoleListMetadata metadata;

    public ClusterRoleList() {
        // no-op
    }

    public ClusterRoleList(final String apiVersion,
                           final List<JsonValue> items,
                           final String kind,
                           final ClusterRoleListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<JsonValue> getItems() {
        return items;
    }

    public void setItems(final List<JsonValue> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ClusterRoleListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ClusterRoleListMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClusterRoleList)) {
            return false;
        }
        final ClusterRoleList __otherCasted = (ClusterRoleList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
