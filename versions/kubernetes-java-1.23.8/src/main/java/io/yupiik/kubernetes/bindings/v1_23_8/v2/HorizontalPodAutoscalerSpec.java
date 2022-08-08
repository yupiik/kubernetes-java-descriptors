package io.yupiik.kubernetes.bindings.v1_23_8.v2;

import io.yupiik.kubernetes.bindings.v1_23_8.Validable;
import io.yupiik.kubernetes.bindings.v1_23_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerSpec implements Validable<HorizontalPodAutoscalerSpec> {
    private HorizontalPodAutoscalerBehavior behavior;
    private int maxReplicas;
    private List<MetricSpec> metrics;
    private Integer minReplicas;
    private CrossVersionObjectReference scaleTargetRef;

    public HorizontalPodAutoscalerSpec() {
        // no-op
    }

    public HorizontalPodAutoscalerSpec(final HorizontalPodAutoscalerBehavior behavior,
                                       final int maxReplicas,
                                       final List<MetricSpec> metrics,
                                       final Integer minReplicas,
                                       final CrossVersionObjectReference scaleTargetRef) {
        // no-op
    }

    public HorizontalPodAutoscalerBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(final HorizontalPodAutoscalerBehavior behavior) {
        this.behavior = behavior;
    }

    public int getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(final int maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public List<MetricSpec> getMetrics() {
        return metrics;
    }

    public void setMetrics(final List<MetricSpec> metrics) {
        this.metrics = metrics;
    }

    public Integer getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(final Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    public CrossVersionObjectReference getScaleTargetRef() {
        return scaleTargetRef;
    }

    public void setScaleTargetRef(final CrossVersionObjectReference scaleTargetRef) {
        this.scaleTargetRef = scaleTargetRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                behavior,
                maxReplicas,
                metrics,
                minReplicas,
                scaleTargetRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpec)) {
            return false;
        }
        final HorizontalPodAutoscalerSpec __otherCasted = (HorizontalPodAutoscalerSpec) __other;
        return Objects.equals(behavior, __otherCasted.behavior) &&
            Objects.equals(maxReplicas, __otherCasted.maxReplicas) &&
            Objects.equals(metrics, __otherCasted.metrics) &&
            Objects.equals(minReplicas, __otherCasted.minReplicas) &&
            Objects.equals(scaleTargetRef, __otherCasted.scaleTargetRef);
    }

    public HorizontalPodAutoscalerSpec behavior(final HorizontalPodAutoscalerBehavior behavior) {
        this.behavior = behavior;
        return this;
    }

    public HorizontalPodAutoscalerSpec maxReplicas(final int maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    public HorizontalPodAutoscalerSpec metrics(final List<MetricSpec> metrics) {
        this.metrics = metrics;
        return this;
    }

    public HorizontalPodAutoscalerSpec minReplicas(final Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    public HorizontalPodAutoscalerSpec scaleTargetRef(final CrossVersionObjectReference scaleTargetRef) {
        this.scaleTargetRef = scaleTargetRef;
        return this;
    }

    @Override
    public HorizontalPodAutoscalerSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (scaleTargetRef == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "scaleTargetRef", "scaleTargetRef",
                "Missing 'scaleTargetRef' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
