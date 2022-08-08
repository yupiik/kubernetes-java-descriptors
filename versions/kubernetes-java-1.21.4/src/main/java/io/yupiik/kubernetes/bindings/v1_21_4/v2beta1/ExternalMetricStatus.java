package io.yupiik.kubernetes.bindings.v1_21_4.v2beta1;

import io.yupiik.kubernetes.bindings.v1_21_4.Validable;
import io.yupiik.kubernetes.bindings.v1_21_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExternalMetricStatus implements Validable<ExternalMetricStatus> {
    private String currentAverageValue;
    private String currentValue;
    private String metricName;
    private LabelSelector metricSelector;

    public ExternalMetricStatus() {
        // no-op
    }

    public ExternalMetricStatus(final String currentAverageValue,
                                final String currentValue,
                                final String metricName,
                                final LabelSelector metricSelector) {
        // no-op
    }

    public String getCurrentAverageValue() {
        return currentAverageValue;
    }

    public void setCurrentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(final String currentValue) {
        this.currentValue = currentValue;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    public LabelSelector getMetricSelector() {
        return metricSelector;
    }

    public void setMetricSelector(final LabelSelector metricSelector) {
        this.metricSelector = metricSelector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                currentAverageValue,
                currentValue,
                metricName,
                metricSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExternalMetricStatus)) {
            return false;
        }
        final ExternalMetricStatus __otherCasted = (ExternalMetricStatus) __other;
        return Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(currentValue, __otherCasted.currentValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(metricSelector, __otherCasted.metricSelector);
    }

    public ExternalMetricStatus currentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
        return this;
    }

    public ExternalMetricStatus currentValue(final String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    public ExternalMetricStatus metricName(final String metricName) {
        this.metricName = metricName;
        return this;
    }

    public ExternalMetricStatus metricSelector(final LabelSelector metricSelector) {
        this.metricSelector = metricSelector;
        return this;
    }

    @Override
    public ExternalMetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (currentValue == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "currentValue", "currentValue",
                "Missing 'currentValue' attribute.", true));
        }
        if (metricName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metricName", "metricName",
                "Missing 'metricName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
