package io.yupiik.kubernetes.bindings.v1_13_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_1.Validable;
import io.yupiik.kubernetes.bindings.v1_13_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SecretProjection implements Validable<SecretProjection> {
    private List<KeyToPath> items;
    private String name;
    private Boolean optional;

    public SecretProjection() {
        // no-op
    }

    public SecretProjection(final List<KeyToPath> items,
                            final String name,
                            final Boolean optional) {
        // no-op
    }

    public List<KeyToPath> getItems() {
        return items;
    }

    public void setItems(final List<KeyToPath> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items,
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SecretProjection)) {
            return false;
        }
        final SecretProjection __otherCasted = (SecretProjection) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }

    public SecretProjection items(final List<KeyToPath> items) {
        this.items = items;
        return this;
    }

    public SecretProjection name(final String name) {
        this.name = name;
        return this;
    }

    public SecretProjection optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    @Override
    public SecretProjection validate() {
        return this;
    }
}
