package io.yupiik.kubernetes.bindings.v1_8_3.v1beta2;

import io.yupiik.kubernetes.bindings.v1_8_3.Validable;
import io.yupiik.kubernetes.bindings.v1_8_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HTTPHeader implements Validable<HTTPHeader> {
    private String name;
    private String value;

    public HTTPHeader() {
        // no-op
    }

    public HTTPHeader(final String name,
                      final String value) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HTTPHeader)) {
            return false;
        }
        final HTTPHeader __otherCasted = (HTTPHeader) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }

    public HTTPHeader name(final String name) {
        this.name = name;
        return this;
    }

    public HTTPHeader value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public HTTPHeader validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (value == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "value", "value",
                "Missing 'value' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
