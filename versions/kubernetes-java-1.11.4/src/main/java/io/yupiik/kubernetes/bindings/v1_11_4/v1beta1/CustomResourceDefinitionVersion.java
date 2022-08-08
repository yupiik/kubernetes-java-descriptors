package io.yupiik.kubernetes.bindings.v1_11_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_4.Validable;
import io.yupiik.kubernetes.bindings.v1_11_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionVersion implements Validable<CustomResourceDefinitionVersion> {
    private String name;
    private boolean served;
    private boolean storage;

    public CustomResourceDefinitionVersion() {
        // no-op
    }

    public CustomResourceDefinitionVersion(final String name,
                                           final boolean served,
                                           final boolean storage) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public boolean getServed() {
        return served;
    }

    public void setServed(final boolean served) {
        this.served = served;
    }

    public boolean getStorage() {
        return storage;
    }

    public void setStorage(final boolean storage) {
        this.storage = storage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                served,
                storage);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionVersion)) {
            return false;
        }
        final CustomResourceDefinitionVersion __otherCasted = (CustomResourceDefinitionVersion) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(served, __otherCasted.served) &&
            Objects.equals(storage, __otherCasted.storage);
    }

    public CustomResourceDefinitionVersion name(final String name) {
        this.name = name;
        return this;
    }

    public CustomResourceDefinitionVersion served(final boolean served) {
        this.served = served;
        return this;
    }

    public CustomResourceDefinitionVersion storage(final boolean storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public CustomResourceDefinitionVersion validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
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
