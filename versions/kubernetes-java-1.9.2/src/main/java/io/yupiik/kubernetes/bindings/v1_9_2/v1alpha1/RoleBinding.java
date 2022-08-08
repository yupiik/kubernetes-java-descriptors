package io.yupiik.kubernetes.bindings.v1_9_2.v1alpha1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class RoleBinding {
    private String apiVersion;
    private String kind;
    private RoleBindingMetadata metadata;
    private RoleBindingRoleRef roleRef;
    private List<JsonValue> subjects;

    public RoleBinding() {
        // no-op
    }

    public RoleBinding(final String apiVersion,
                       final String kind,
                       final RoleBindingMetadata metadata,
                       final RoleBindingRoleRef roleRef,
                       final List<JsonValue> subjects) {
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

    public RoleBindingMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final RoleBindingMetadata metadata) {
        this.metadata = metadata;
    }

    public RoleBindingRoleRef getRoleRef() {
        return roleRef;
    }

    public void setRoleRef(final RoleBindingRoleRef roleRef) {
        this.roleRef = roleRef;
    }

    public List<JsonValue> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<JsonValue> subjects) {
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
        if (!(__other instanceof RoleBinding)) {
            return false;
        }
        final RoleBinding __otherCasted = (RoleBinding) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(roleRef, __otherCasted.roleRef) &&
            Objects.equals(subjects, __otherCasted.subjects);
    }
}
