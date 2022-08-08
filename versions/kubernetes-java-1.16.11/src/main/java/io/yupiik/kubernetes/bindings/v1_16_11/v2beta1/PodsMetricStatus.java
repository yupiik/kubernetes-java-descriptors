package io.yupiik.kubernetes.bindings.v1_16_11.v2beta1;

import io.yupiik.kubernetes.bindings.v1_16_11.Validable;
import io.yupiik.kubernetes.bindings.v1_16_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodsMetricStatus implements Validable<PodsMetricStatus> {
    private String currentAverageValue;
    private String metricName;
    private LabelSelector selector;

    public PodsMetricStatus() {
        // no-op
    }

    public PodsMetricStatus(final String currentAverageValue,
                            final String metricName,
                            final LabelSelector selector) {
        // no-op
    }

    public String getCurrentAverageValue() {
        return currentAverageValue;
    }

    public void setCurrentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                currentAverageValue,
                metricName,
                selector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodsMetricStatus)) {
            return false;
        }
        final PodsMetricStatus __otherCasted = (PodsMetricStatus) __other;
        return Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector);
    }

    public PodsMetricStatus currentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
        return this;
    }

    public PodsMetricStatus metricName(final String metricName) {
        this.metricName = metricName;
        return this;
    }

    public PodsMetricStatus selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    @Override
    public PodsMetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (currentAverageValue == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "currentAverageValue", "currentAverageValue",
                "Missing 'currentAverageValue' attribute.", true));
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
