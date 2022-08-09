package io.yupiik.kubernetes.bindings.v1_21_13.v2beta2;

import io.yupiik.kubernetes.bindings.v1_21_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_13.Validable;
import io.yupiik.kubernetes.bindings.v1_21_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ObjectMetricStatus implements Validable<ObjectMetricStatus>, Exportable {
    private MetricValueStatus current;
    private CrossVersionObjectReference describedObject;
    private MetricIdentifier metric;

    public ObjectMetricStatus() {
        // no-op
    }

    public ObjectMetricStatus(final MetricValueStatus current,
                              final CrossVersionObjectReference describedObject,
                              final MetricIdentifier metric) {
        // no-op
    }

    public MetricValueStatus getCurrent() {
        return current;
    }

    public void setCurrent(final MetricValueStatus current) {
        this.current = current;
    }

    public CrossVersionObjectReference getDescribedObject() {
        return describedObject;
    }

    public void setDescribedObject(final CrossVersionObjectReference describedObject) {
        this.describedObject = describedObject;
    }

    public MetricIdentifier getMetric() {
        return metric;
    }

    public void setMetric(final MetricIdentifier metric) {
        this.metric = metric;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                current,
                describedObject,
                metric);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ObjectMetricStatus)) {
            return false;
        }
        final ObjectMetricStatus __otherCasted = (ObjectMetricStatus) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(describedObject, __otherCasted.describedObject) &&
            Objects.equals(metric, __otherCasted.metric);
    }

    public ObjectMetricStatus current(final MetricValueStatus current) {
        this.current = current;
        return this;
    }

    public ObjectMetricStatus describedObject(final CrossVersionObjectReference describedObject) {
        this.describedObject = describedObject;
        return this;
    }

    public ObjectMetricStatus metric(final MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

    @Override
    public ObjectMetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (current == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "current", "current",
                "Missing 'current' attribute.", true));
        }
        if (describedObject == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "describedObject", "describedObject",
                "Missing 'describedObject' attribute.", true));
        }
        if (metric == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metric", "metric",
                "Missing 'metric' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (current != null ? "\"current\":" + current.asJson() : ""),
                    (describedObject != null ? "\"describedObject\":" + describedObject.asJson() : ""),
                    (metric != null ? "\"metric\":" + metric.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
