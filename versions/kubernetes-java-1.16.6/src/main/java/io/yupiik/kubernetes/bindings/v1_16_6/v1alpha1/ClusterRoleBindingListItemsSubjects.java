package io.yupiik.kubernetes.bindings.v1_16_6.v1alpha1;

import java.util.Objects;

public class ClusterRoleBindingListItemsSubjects {
    private String apiVersion;
    private String kind;
    private String name;
    private String namespace;

    public ClusterRoleBindingListItemsSubjects() {
        // no-op
    }

    public ClusterRoleBindingListItemsSubjects(final String apiVersion,
                                               final String kind,
                                               final String name,
                                               final String namespace) {
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
                apiVersion,
                kind,
                name,
                namespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClusterRoleBindingListItemsSubjects)) {
            return false;
        }
        final ClusterRoleBindingListItemsSubjects __otherCasted = (ClusterRoleBindingListItemsSubjects) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace);
    }
}
