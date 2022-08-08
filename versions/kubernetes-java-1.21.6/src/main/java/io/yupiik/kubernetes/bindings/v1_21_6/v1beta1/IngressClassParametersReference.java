package io.yupiik.kubernetes.bindings.v1_21_6.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_6.Validable;
import io.yupiik.kubernetes.bindings.v1_21_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngressClassParametersReference implements Validable<IngressClassParametersReference> {
    private String apiGroup;
    private String kind;
    private String name;
    private String namespace;
    private String scope;

    public IngressClassParametersReference() {
        // no-op
    }

    public IngressClassParametersReference(final String apiGroup,
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
        if (!(__other instanceof IngressClassParametersReference)) {
            return false;
        }
        final IngressClassParametersReference __otherCasted = (IngressClassParametersReference) __other;
        return Objects.equals(apiGroup, __otherCasted.apiGroup) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(scope, __otherCasted.scope);
    }

    public IngressClassParametersReference apiGroup(final String apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }

    public IngressClassParametersReference kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public IngressClassParametersReference name(final String name) {
        this.name = name;
        return this;
    }

    public IngressClassParametersReference namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public IngressClassParametersReference scope(final String scope) {
        this.scope = scope;
        return this;
    }

    @Override
    public IngressClassParametersReference validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (kind == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "kind", "kind",
                "Missing 'kind' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
