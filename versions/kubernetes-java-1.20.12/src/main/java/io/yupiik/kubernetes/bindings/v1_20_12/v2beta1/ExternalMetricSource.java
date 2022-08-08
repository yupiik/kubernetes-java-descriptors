package io.yupiik.kubernetes.bindings.v1_20_12.v2beta1;

import io.yupiik.kubernetes.bindings.v1_20_12.Validable;
import io.yupiik.kubernetes.bindings.v1_20_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExternalMetricSource implements Validable<ExternalMetricSource> {
    private String metricName;
    private LabelSelector metricSelector;
    private String targetAverageValue;
    private String targetValue;

    public ExternalMetricSource() {
        // no-op
    }

    public ExternalMetricSource(final String metricName,
                                final LabelSelector metricSelector,
                                final String targetAverageValue,
                                final String targetValue) {
        // no-op
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

    public String getTargetAverageValue() {
        return targetAverageValue;
    }

    public void setTargetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
    }

    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(final String targetValue) {
        this.targetValue = targetValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metricName,
                metricSelector,
                targetAverageValue,
                targetValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExternalMetricSource)) {
            return false;
        }
        final ExternalMetricSource __otherCasted = (ExternalMetricSource) __other;
        return Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(metricSelector, __otherCasted.metricSelector) &&
            Objects.equals(targetAverageValue, __otherCasted.targetAverageValue) &&
            Objects.equals(targetValue, __otherCasted.targetValue);
    }

    public ExternalMetricSource metricName(final String metricName) {
        this.metricName = metricName;
        return this;
    }

    public ExternalMetricSource metricSelector(final LabelSelector metricSelector) {
        this.metricSelector = metricSelector;
        return this;
    }

    public ExternalMetricSource targetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
        return this;
    }

    public ExternalMetricSource targetValue(final String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    @Override
    public ExternalMetricSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
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
