package io.yupiik.kubernetes.bindings.v1_14_6.v1alpha1;

import java.util.List;
import java.util.Objects;

public class ClusterRoleBinding {
    private String apiVersion;
    private String kind;
    private ClusterRoleBindingMetadata metadata;
    private ClusterRoleBindingRoleRef roleRef;
    private List<ClusterRoleBindingSubjects> subjects;

    public ClusterRoleBinding() {
        // no-op
    }

    public ClusterRoleBinding(final String apiVersion,
                              final String kind,
                              final ClusterRoleBindingMetadata metadata,
                              final ClusterRoleBindingRoleRef roleRef,
                              final List<ClusterRoleBindingSubjects> subjects) {
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

    public ClusterRoleBindingMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ClusterRoleBindingMetadata metadata) {
        this.metadata = metadata;
    }

    public ClusterRoleBindingRoleRef getRoleRef() {
        return roleRef;
    }

    public void setRoleRef(final ClusterRoleBindingRoleRef roleRef) {
        this.roleRef = roleRef;
    }

    public List<ClusterRoleBindingSubjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<ClusterRoleBindingSubjects> subjects) {
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
        if (!(__other instanceof ClusterRoleBinding)) {
            return false;
        }
        final ClusterRoleBinding __otherCasted = (ClusterRoleBinding) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(roleRef, __otherCasted.roleRef) &&
            Objects.equals(subjects, __otherCasted.subjects);
    }
}
