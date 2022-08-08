package io.yupiik.kubernetes.bindings.v1_12_6.v1beta2;

import io.yupiik.kubernetes.bindings.v1_12_6.Validable;
import io.yupiik.kubernetes.bindings.v1_12_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LocalObjectReference implements Validable<LocalObjectReference> {
    private String name;

    public LocalObjectReference() {
        // no-op
    }

    public LocalObjectReference(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LocalObjectReference)) {
            return false;
        }
        final LocalObjectReference __otherCasted = (LocalObjectReference) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public LocalObjectReference name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public LocalObjectReference validate() {
        return this;
    }
}
