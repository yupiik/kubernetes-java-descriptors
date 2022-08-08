package io.yupiik.kubernetes.bindings.v1_14_7.v2beta1;

import io.yupiik.kubernetes.bindings.v1_14_7.Validable;
import io.yupiik.kubernetes.bindings.v1_14_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodsMetricSource implements Validable<PodsMetricSource> {
    private String metricName;
    private LabelSelector selector;
    private String targetAverageValue;

    public PodsMetricSource() {
        // no-op
    }

    public PodsMetricSource(final String metricName,
                            final LabelSelector selector,
                            final String targetAverageValue) {
        // no-op
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

    public String getTargetAverageValue() {
        return targetAverageValue;
    }

    public void setTargetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metricName,
                selector,
                targetAverageValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodsMetricSource)) {
            return false;
        }
        final PodsMetricSource __otherCasted = (PodsMetricSource) __other;
        return Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(targetAverageValue, __otherCasted.targetAverageValue);
    }

    public PodsMetricSource metricName(final String metricName) {
        this.metricName = metricName;
        return this;
    }

    public PodsMetricSource selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public PodsMetricSource targetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
        return this;
    }

    @Override
    public PodsMetricSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (metricName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metricName", "metricName",
                "Missing 'metricName' attribute.", true));
        }
        if (targetAverageValue == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "targetAverageValue", "targetAverageValue",
                "Missing 'targetAverageValue' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
