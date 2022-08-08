package io.yupiik.kubernetes.bindings.v1_16_0.v1;

import io.yupiik.kubernetes.bindings.v1_16_0.Validable;
import io.yupiik.kubernetes.bindings.v1_16_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClusterRoleBinding implements Validable<ClusterRoleBinding> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private RoleRef roleRef;
    private List<Subject> subjects;

    public ClusterRoleBinding() {
        // no-op
    }

    public ClusterRoleBinding(final String apiVersion,
                              final String kind,
                              final ObjectMeta metadata,
                              final RoleRef roleRef,
                              final List<Subject> subjects) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public RoleRef getRoleRef() {
        return roleRef;
    }

    public void setRoleRef(final RoleRef roleRef) {
        this.roleRef = roleRef;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
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

    public ClusterRoleBinding apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ClusterRoleBinding kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ClusterRoleBinding metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ClusterRoleBinding roleRef(final RoleRef roleRef) {
        this.roleRef = roleRef;
        return this;
    }

    public ClusterRoleBinding subjects(final List<Subject> subjects) {
        this.subjects = subjects;
        return this;
    }

    @Override
    public ClusterRoleBinding validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (roleRef == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "roleRef", "roleRef",
                "Missing 'roleRef' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
