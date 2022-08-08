package io.yupiik.kubernetes.bindings.v1_22_7;

import java.util.List;
import java.util.Objects;

public class RoleBindingList {
    private String apiVersion;
    private List<RoleBindingListItems> items;
    private String kind;
    private RoleBindingListMetadata metadata;

    public RoleBindingList() {
        // no-op
    }

    public RoleBindingList(final String apiVersion,
                           final List<RoleBindingListItems> items,
                           final String kind,
                           final RoleBindingListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<RoleBindingListItems> getItems() {
        return items;
    }

    public void setItems(final List<RoleBindingListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public RoleBindingListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final RoleBindingListMetadata metadata) {
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
        if (!(__other instanceof RoleBindingList)) {
            return false;
        }
        final RoleBindingList __otherCasted = (RoleBindingList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
