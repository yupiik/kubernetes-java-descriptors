package io.yupiik.kubernetes.bindings.v1_20_3.v2beta1;

import io.yupiik.kubernetes.bindings.v1_20_3.Validable;
import io.yupiik.kubernetes.bindings.v1_20_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContainerResourceMetricStatus implements Validable<ContainerResourceMetricStatus> {
    private String container;
    private Integer currentAverageUtilization;
    private String currentAverageValue;
    private String name;

    public ContainerResourceMetricStatus() {
        // no-op
    }

    public ContainerResourceMetricStatus(final String container,
                                         final Integer currentAverageUtilization,
                                         final String currentAverageValue,
                                         final String name) {
        // no-op
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(final String container) {
        this.container = container;
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
                container,
                currentAverageUtilization,
                currentAverageValue,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerResourceMetricStatus)) {
            return false;
        }
        final ContainerResourceMetricStatus __otherCasted = (ContainerResourceMetricStatus) __other;
        return Objects.equals(container, __otherCasted.container) &&
            Objects.equals(currentAverageUtilization, __otherCasted.currentAverageUtilization) &&
            Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(name, __otherCasted.name);
    }

    public ContainerResourceMetricStatus container(final String container) {
        this.container = container;
        return this;
    }

    public ContainerResourceMetricStatus currentAverageUtilization(final Integer currentAverageUtilization) {
        this.currentAverageUtilization = currentAverageUtilization;
        return this;
    }

    public ContainerResourceMetricStatus currentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
        return this;
    }

    public ContainerResourceMetricStatus name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public ContainerResourceMetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (container == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "container", "container",
                "Missing 'container' attribute.", true));
        }
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
