package io.yupiik.kubernetes.bindings.v1_19_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_19_9.Validable;
import io.yupiik.kubernetes.bindings.v1_19_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserSubject implements Validable<UserSubject> {
    private String name;

    public UserSubject() {
        // no-op
    }

    public UserSubject(final String name) {
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
        if (!(__other instanceof UserSubject)) {
            return false;
        }
        final UserSubject __otherCasted = (UserSubject) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public UserSubject name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserSubject validate() {
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
