package io.yupiik.kubernetes.bindings.v1_19_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class RoleList {
    private String apiVersion;
    private List<RoleListItems> items;
    private String kind;
    private RoleListMetadata metadata;

    public RoleList() {
        // no-op
    }

    public RoleList(final String apiVersion,
                    final List<RoleListItems> items,
                    final String kind,
                    final RoleListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<RoleListItems> getItems() {
        return items;
    }

    public void setItems(final List<RoleListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public RoleListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final RoleListMetadata metadata) {
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
        if (!(__other instanceof RoleList)) {
            return false;
        }
        final RoleList __otherCasted = (RoleList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
