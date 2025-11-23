package io.yupiik.kubernetes.bindings.v1_26_11.v2;

import io.yupiik.kubernetes.bindings.v1_26_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_11.Validable;
import io.yupiik.kubernetes.bindings.v1_26_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodsMetricStatus implements Validable<PodsMetricStatus>, Exportable {
    private MetricValueStatus current;
    private MetricIdentifier metric;

    public PodsMetricStatus() {
        // no-op
    }

    public PodsMetricStatus(final MetricValueStatus current,
                            final MetricIdentifier metric) {
        this.current = current;
        this.metric = metric;
    }

    public MetricValueStatus getCurrent() {
        return current;
    }

    public void setCurrent(final MetricValueStatus current) {
        this.current = current;
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
                metric);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodsMetricStatus)) {
            return false;
        }
        final PodsMetricStatus __otherCasted = (PodsMetricStatus) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(metric, __otherCasted.metric);
    }

    public PodsMetricStatus current(final MetricValueStatus current) {
        this.current = current;
        return this;
    }

    public PodsMetricStatus metric(final MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

    @Override
    public PodsMetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (current == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "current", "current",
                "Missing 'current' attribute.", true));
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
                    (metric != null ? "\"metric\":" + metric.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
