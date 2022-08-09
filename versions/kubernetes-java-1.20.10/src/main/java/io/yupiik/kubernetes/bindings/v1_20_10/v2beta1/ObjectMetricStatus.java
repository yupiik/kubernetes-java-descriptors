package io.yupiik.kubernetes.bindings.v1_20_10.v2beta1;

import io.yupiik.kubernetes.bindings.v1_20_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_10.Validable;
import io.yupiik.kubernetes.bindings.v1_20_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ObjectMetricStatus implements Validable<ObjectMetricStatus>, Exportable {
    private String averageValue;
    private String currentValue;
    private String metricName;
    private LabelSelector selector;
    private CrossVersionObjectReference target;

    public ObjectMetricStatus() {
        // no-op
    }

    public ObjectMetricStatus(final String averageValue,
                              final String currentValue,
                              final String metricName,
                              final LabelSelector selector,
                              final CrossVersionObjectReference target) {
        // no-op
    }

    public String getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(final String averageValue) {
        this.averageValue = averageValue;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                averageValue,
                currentValue,
                metricName,
                selector,
                target);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ObjectMetricStatus)) {
            return false;
        }
        final ObjectMetricStatus __otherCasted = (ObjectMetricStatus) __other;
        return Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(currentValue, __otherCasted.currentValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(target, __otherCasted.target);
    }

    public ObjectMetricStatus averageValue(final String averageValue) {
        this.averageValue = averageValue;
        return this;
    }

    public ObjectMetricStatus currentValue(final String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    public ObjectMetricStatus metricName(final String metricName) {
        this.metricName = metricName;
        return this;
    }

    public ObjectMetricStatus selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public ObjectMetricStatus target(final CrossVersionObjectReference target) {
        this.target = target;
        return this;
    }

    @Override
    public ObjectMetricStatus validate() {
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
        if (target == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "target", "target",
                "Missing 'target' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (averageValue != null ? "\"averageValue\":\"" +  JsonStrings.escapeJson(averageValue) + "\"" : ""),
                    (currentValue != null ? "\"currentValue\":\"" +  JsonStrings.escapeJson(currentValue) + "\"" : ""),
                    (metricName != null ? "\"metricName\":\"" +  JsonStrings.escapeJson(metricName) + "\"" : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""),
                    (target != null ? "\"target\":" + target.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
