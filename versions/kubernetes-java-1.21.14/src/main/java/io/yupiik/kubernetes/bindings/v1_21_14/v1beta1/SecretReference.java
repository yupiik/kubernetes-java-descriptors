package io.yupiik.kubernetes.bindings.v1_21_14.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_14.Validable;
import io.yupiik.kubernetes.bindings.v1_21_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SecretReference implements Validable<SecretReference> {
    private String name;
    private String namespace;

    public SecretReference() {
        // no-op
    }

    public SecretReference(final String name,
                           final String namespace) {
        // no-op
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
                name,
                namespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SecretReference)) {
            return false;
        }
        final SecretReference __otherCasted = (SecretReference) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace);
    }

    public SecretReference name(final String name) {
        this.name = name;
        return this;
    }

    public SecretReference namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public SecretReference validate() {
        return this;
    }
}
