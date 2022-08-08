package io.yupiik.kubernetes.bindings.v1_8_5.v1beta2;

import io.yupiik.kubernetes.bindings.v1_8_5.Validable;
import io.yupiik.kubernetes.bindings.v1_8_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConfigMapProjection implements Validable<ConfigMapProjection> {
    private List<KeyToPath> items;
    private String name;
    private Boolean optional;

    public ConfigMapProjection() {
        // no-op
    }

    public ConfigMapProjection(final List<KeyToPath> items,
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
        if (!(__other instanceof ConfigMapProjection)) {
            return false;
        }
        final ConfigMapProjection __otherCasted = (ConfigMapProjection) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }

    public ConfigMapProjection items(final List<KeyToPath> items) {
        this.items = items;
        return this;
    }

    public ConfigMapProjection name(final String name) {
        this.name = name;
        return this;
    }

    public ConfigMapProjection optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    @Override
    public ConfigMapProjection validate() {
        return this;
    }
}
