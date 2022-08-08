package io.yupiik.kubernetes.bindings.v1_13_7.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_13_7.Validable;
import io.yupiik.kubernetes.bindings.v1_13_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Initializer implements Validable<Initializer> {
    private String name;

    public Initializer() {
        // no-op
    }

    public Initializer(final String name) {
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
        if (!(__other instanceof Initializer)) {
            return false;
        }
        final Initializer __otherCasted = (Initializer) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public Initializer name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public Initializer validate() {
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
