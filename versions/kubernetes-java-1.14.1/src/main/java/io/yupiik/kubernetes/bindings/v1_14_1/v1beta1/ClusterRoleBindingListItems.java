package io.yupiik.kubernetes.bindings.v1_14_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class ClusterRoleBindingListItems {
    private String apiVersion;
    private String kind;
    private ClusterRoleBindingListItemsMetadata metadata;
    private ClusterRoleBindingListItemsRoleRef roleRef;
    private List<ClusterRoleBindingListItemsSubjects> subjects;

    public ClusterRoleBindingListItems() {
        // no-op
    }

    public ClusterRoleBindingListItems(final String apiVersion,
                                       final String kind,
                                       final ClusterRoleBindingListItemsMetadata metadata,
                                       final ClusterRoleBindingListItemsRoleRef roleRef,
                                       final List<ClusterRoleBindingListItemsSubjects> subjects) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ClusterRoleBindingListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ClusterRoleBindingListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public ClusterRoleBindingListItemsRoleRef getRoleRef() {
        return roleRef;
    }

    public void setRoleRef(final ClusterRoleBindingListItemsRoleRef roleRef) {
        this.roleRef = roleRef;
    }

    public List<ClusterRoleBindingListItemsSubjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<ClusterRoleBindingListItemsSubjects> subjects) {
        this.subjects = subjects;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                roleRef,
                subjects);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClusterRoleBindingListItems)) {
            return false;
        }
        final ClusterRoleBindingListItems __otherCasted = (ClusterRoleBindingListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(roleRef, __otherCasted.roleRef) &&
            Objects.equals(subjects, __otherCasted.subjects);
    }
}
