package io.yupiik.kubernetes.bindings.v1_22_10.v2beta1;

import io.yupiik.kubernetes.bindings.v1_22_10.Validable;
import io.yupiik.kubernetes.bindings.v1_22_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObjectMetricSource implements Validable<ObjectMetricSource> {
    private String averageValue;
    private String metricName;
    private LabelSelector selector;
    private CrossVersionObjectReference target;
    private String targetValue;

    public ObjectMetricSource() {
        // no-op
    }

    public ObjectMetricSource(final String averageValue,
                              final String metricName,
                              final LabelSelector selector,
                              final CrossVersionObjectReference target,
                              final String targetValue) {
        // no-op
    }

    public String getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(final String averageValue) {
        this.averageValue = averageValue;
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

    public CrossVersionObjectReference getTarget() {
        return target;
    }

    public void setTarget(final CrossVersionObjectReference target) {
        this.target = target;
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
                averageValue,
                metricName,
                selector,
                target,
                targetValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ObjectMetricSource)) {
            return false;
        }
        final ObjectMetricSource __otherCasted = (ObjectMetricSource) __other;
        return Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(target, __otherCasted.target) &&
            Objects.equals(targetValue, __otherCasted.targetValue);
    }

    public ObjectMetricSource averageValue(final String averageValue) {
        this.averageValue = averageValue;
        return this;
    }

    public ObjectMetricSource metricName(final String metricName) {
        this.metricName = metricName;
        return this;
    }

    public ObjectMetricSource selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public ObjectMetricSource target(final CrossVersionObjectReference target) {
        this.target = target;
        return this;
    }

    public ObjectMetricSource targetValue(final String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    @Override
    public ObjectMetricSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (metricName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metricName", "metricName",
                "Missing 'metricName' attribute.", true));
        }
        if (target == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "target", "target",
                "Missing 'target' attribute.", true));
        }
        if (targetValue == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "targetValue", "targetValue",
                "Missing 'targetValue' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
