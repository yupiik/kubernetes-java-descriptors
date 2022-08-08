package io.yupiik.kubernetes.bindings.v1_14_2.v1beta2;

import io.yupiik.kubernetes.bindings.v1_14_2.Validable;
import io.yupiik.kubernetes.bindings.v1_14_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EnvVar implements Validable<EnvVar> {
    private String name;
    private String value;
    private EnvVarSource valueFrom;

    public EnvVar() {
        // no-op
    }

    public EnvVar(final String name,
                  final String value,
                  final EnvVarSource valueFrom) {
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

    public EnvVarSource getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final EnvVarSource valueFrom) {
        this.valueFrom = valueFrom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value,
                valueFrom);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EnvVar)) {
            return false;
        }
        final EnvVar __otherCasted = (EnvVar) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }

    public EnvVar name(final String name) {
        this.name = name;
        return this;
    }

    public EnvVar value(final String value) {
        this.value = value;
        return this;
    }

    public EnvVar valueFrom(final EnvVarSource valueFrom) {
        this.valueFrom = valueFrom;
        return this;
    }

    @Override
    public EnvVar validate() {
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
