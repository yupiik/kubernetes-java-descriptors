package io.yupiik.kubernetes.bindings.v1_20_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class ClusterRoleBindingList {
    private String apiVersion;
    private List<ClusterRoleBindingListItems> items;
    private String kind;
    private ClusterRoleBindingListMetadata metadata;

    public ClusterRoleBindingList() {
        // no-op
    }

    public ClusterRoleBindingList(final String apiVersion,
                                  final List<ClusterRoleBindingListItems> items,
                                  final String kind,
                                  final ClusterRoleBindingListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ClusterRoleBindingListItems> getItems() {
        return items;
    }

    public void setItems(final List<ClusterRoleBindingListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ClusterRoleBindingListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ClusterRoleBindingListMetadata metadata) {
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
        if (!(__other instanceof ClusterRoleBindingList)) {
            return false;
        }
        final ClusterRoleBindingList __otherCasted = (ClusterRoleBindingList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
