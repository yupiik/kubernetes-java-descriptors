package io.yupiik.kubernetes.bindings.v1_21_3.v1;

import io.yupiik.kubernetes.bindings.v1_21_3.Validable;
import io.yupiik.kubernetes.bindings.v1_21_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ForZone implements Validable<ForZone> {
    private String name;

    public ForZone() {
        // no-op
    }

    public ForZone(final String name) {
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
        if (!(__other instanceof ForZone)) {
            return false;
        }
        final ForZone __otherCasted = (ForZone) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public ForZone name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public ForZone validate() {
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
