package io.yupiik.kubernetes.bindings.v1_19_13.v2beta2;

import io.yupiik.kubernetes.bindings.v1_19_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_13.Validable;
import io.yupiik.kubernetes.bindings.v1_19_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodsMetricSource implements Validable<PodsMetricSource>, Exportable {
    private MetricIdentifier metric;
    private MetricTarget target;

    public PodsMetricSource() {
        // no-op
    }

    public PodsMetricSource(final MetricIdentifier metric,
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
        if (!(__other instanceof PodsMetricSource)) {
            return false;
        }
        final PodsMetricSource __otherCasted = (PodsMetricSource) __other;
        return Objects.equals(metric, __otherCasted.metric) &&
            Objects.equals(target, __otherCasted.target);
    }

    public PodsMetricSource metric(final MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

    public PodsMetricSource target(final MetricTarget target) {
        this.target = target;
        return this;
    }

    @Override
    public PodsMetricSource validate() {
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
