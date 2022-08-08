package io.yupiik.kubernetes.bindings.v1_13_9.v2beta1;

import io.yupiik.kubernetes.bindings.v1_13_9.Validable;
import io.yupiik.kubernetes.bindings.v1_13_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResourceMetricStatus implements Validable<ResourceMetricStatus> {
    private Integer currentAverageUtilization;
    private String currentAverageValue;
    private String name;

    public ResourceMetricStatus() {
        // no-op
    }

    public ResourceMetricStatus(final Integer currentAverageUtilization,
                                final String currentAverageValue,
                                final String name) {
        // no-op
    }

    public Integer getCurrentAverageUtilization() {
        return currentAverageUtilization;
    }

    public void setCurrentAverageUtilization(final Integer currentAverageUtilization) {
        this.currentAverageUtilization = currentAverageUtilization;
    }

    public String getCurrentAverageValue() {
        return currentAverageValue;
    }

    public void setCurrentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
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
                currentAverageUtilization,
                currentAverageValue,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceMetricStatus)) {
            return false;
        }
        final ResourceMetricStatus __otherCasted = (ResourceMetricStatus) __other;
        return Objects.equals(currentAverageUtilization, __otherCasted.currentAverageUtilization) &&
            Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(name, __otherCasted.name);
    }

    public ResourceMetricStatus currentAverageUtilization(final Integer currentAverageUtilization) {
        this.currentAverageUtilization = currentAverageUtilization;
        return this;
    }

    public ResourceMetricStatus currentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
        return this;
    }

    public ResourceMetricStatus name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public ResourceMetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (currentAverageValue == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "currentAverageValue", "currentAverageValue",
                "Missing 'currentAverageValue' attribute.", true));
        }
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
