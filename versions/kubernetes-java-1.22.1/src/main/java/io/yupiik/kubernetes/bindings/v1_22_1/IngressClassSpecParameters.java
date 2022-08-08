package io.yupiik.kubernetes.bindings.v1_22_1;

import java.util.Objects;

public class IngressClassSpecParameters {
    private String apiGroup;
    private String kind;
    private String name;
    private String namespace;
    private String scope;

    public IngressClassSpecParameters() {
        // no-op
    }

    public IngressClassSpecParameters(final String apiGroup,
                                      final String kind,
                                      final String name,
                                      final String namespace,
                                      final String scope) {
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

    public String getScope() {
        return scope;
    }

    public void setScope(final String scope) {
        this.scope = scope;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiGroup,
                kind,
                name,
                namespace,
                scope);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressClassSpecParameters)) {
            return false;
        }
        final IngressClassSpecParameters __otherCasted = (IngressClassSpecParameters) __other;
        return Objects.equals(apiGroup, __otherCasted.apiGroup) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(scope, __otherCasted.scope);
    }
}
