package io.yupiik.kubernetes.bindings.v1_18_7.v1;

import java.util.Objects;

public class RoleBindingSubjects {
    private String apiGroup;
    private String kind;
    private String name;
    private String namespace;

    public RoleBindingSubjects() {
        // no-op
    }

    public RoleBindingSubjects(final String apiGroup,
                               final String kind,
                               final String name,
                               final String namespace) {
        // no-op
    }

    public String getApiGroup() {
        return apiGroup;
    }

    public void setApiGroup(final String apiGroup) {
        this.apiGroup = apiGroup;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiGroup,
                kind,
                name,
                namespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RoleBindingSubjects)) {
            return false;
        }
        final RoleBindingSubjects __otherCasted = (RoleBindingSubjects) __other;
        return Objects.equals(apiGroup, __otherCasted.apiGroup) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace);
    }
}
