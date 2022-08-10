package io.yupiik.kubernetes.bindings.v1_20_15.v2beta2;

import io.yupiik.kubernetes.bindings.v1_20_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_15.Validable;
import io.yupiik.kubernetes.bindings.v1_20_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ExternalMetricSource implements Validable<ExternalMetricSource>, Exportable {
    private MetricIdentifier metric;
    private MetricTarget target;

    public ExternalMetricSource() {
        // no-op
    }

    public ExternalMetricSource(final MetricIdentifier metric,
                                final MetricTarget target) {
        // no-op
    }

    public MetricIdentifier getMetric() {
        return metric;
    }

    public void setMetric(final MetricIdentifier metric) {
        this.metric = metric;
    }

    public MetricTarget getTarget() {
        return target;
    }

    public void setTarget(final MetricTarget target) {
        this.target = target;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metric,
                target);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExternalMetricSource)) {
            return false;
        }
        final ExternalMetricSource __otherCasted = (ExternalMetricSource) __other;
        return Objects.equals(metric, __otherCasted.metric) &&
            Objects.equals(target, __otherCasted.target);
    }

    public ExternalMetricSource metric(final MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

    public ExternalMetricSource target(final MetricTarget target) {
        this.target = target;
        return this;
    }

    @Override
    public ExternalMetricSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (metric == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metric", "metric",
                "Missing 'metric' attribute.", true));
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
                    (metric != null ? "\"metric\":" + metric.asJson() : ""),
                    (target != null ? "\"target\":" + target.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}