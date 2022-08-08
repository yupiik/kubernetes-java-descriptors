package io.yupiik.kubernetes.bindings.v1_24_1;

import java.util.List;
import java.util.Objects;

public class RoleBindingListItems {
    private String apiVersion;
    private String kind;
    private RoleBindingListItemsMetadata metadata;
    private RoleBindingListItemsRoleRef roleRef;
    private List<RoleBindingListItemsSubjects> subjects;

    public RoleBindingListItems() {
        // no-op
    }

    public RoleBindingListItems(final String apiVersion,
                                final String kind,
                                final RoleBindingListItemsMetadata metadata,
                                final RoleBindingListItemsRoleRef roleRef,
                                final List<RoleBindingListItemsSubjects> subjects) {
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

    public RoleBindingListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final RoleBindingListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public RoleBindingListItemsRoleRef getRoleRef() {
        return roleRef;
    }

    public void setRoleRef(final RoleBindingListItemsRoleRef roleRef) {
        this.roleRef = roleRef;
    }

    public List<RoleBindingListItemsSubjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<RoleBindingListItemsSubjects> subjects) {
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
        if (!(__other instanceof RoleBindingListItems)) {
            return false;
        }
        final RoleBindingListItems __otherCasted = (RoleBindingListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(roleRef, __otherCasted.roleRef) &&
            Objects.equals(subjects, __otherCasted.subjects);
    }
}
