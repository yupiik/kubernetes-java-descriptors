package io.yupiik.kubernetes.bindings.v1_19_0.v2beta2;

import io.yupiik.kubernetes.bindings.v1_19_0.Validable;
import io.yupiik.kubernetes.bindings.v1_19_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MetricTarget implements Validable<MetricTarget> {
    private Integer averageUtilization;
    private String averageValue;
    private String type;
    private String value;

    public MetricTarget() {
        // no-op
    }

    public MetricTarget(final Integer averageUtilization,
                        final String averageValue,
                        final String type,
                        final String value) {
        // no-op
    }

    public Integer getAverageUtilization() {
        return averageUtilization;
    }

    public void setAverageUtilization(final Integer averageUtilization) {
        this.averageUtilization = averageUtilization;
    }

    public String getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(final String averageValue) {
        this.averageValue = averageValue;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
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
                averageUtilization,
                averageValue,
                type,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof MetricTarget)) {
            return false;
        }
        final MetricTarget __otherCasted = (MetricTarget) __other;
        return Objects.equals(averageUtilization, __otherCasted.averageUtilization) &&
            Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(value, __otherCasted.value);
    }

    public MetricTarget averageUtilization(final Integer averageUtilization) {
        this.averageUtilization = averageUtilization;
        return this;
    }

    public MetricTarget averageValue(final String averageValue) {
        this.averageValue = averageValue;
        return this;
    }

    public MetricTarget type(final String type) {
        this.type = type;
        return this;
    }

    public MetricTarget value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public MetricTarget validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
