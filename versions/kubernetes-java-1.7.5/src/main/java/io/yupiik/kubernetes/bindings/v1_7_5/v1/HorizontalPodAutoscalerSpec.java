package io.yupiik.kubernetes.bindings.v1_7_5.v1;

import io.yupiik.kubernetes.bindings.v1_7_5.Validable;
import io.yupiik.kubernetes.bindings.v1_7_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerSpec implements Validable<HorizontalPodAutoscalerSpec> {
    private int maxReplicas;
    private Integer minReplicas;
    private CrossVersionObjectReference scaleTargetRef;
    private Integer targetCPUUtilizationPercentage;

    public HorizontalPodAutoscalerSpec() {
        // no-op
    }

    public HorizontalPodAutoscalerSpec(final int maxReplicas,
                                       final Integer minReplicas,
                                       final CrossVersionObjectReference scaleTargetRef,
                                       final Integer targetCPUUtilizationPercentage) {
        // no-op
    }

    public int getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(final int maxReplicas) {
        this.maxReplicas = maxReplicas;
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

    public Integer getTargetCPUUtilizationPercentage() {
        return targetCPUUtilizationPercentage;
    }

    public void setTargetCPUUtilizationPercentage(final Integer targetCPUUtilizationPercentage) {
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxReplicas,
                minReplicas,
                scaleTargetRef,
                targetCPUUtilizationPercentage);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpec)) {
            return false;
        }
        final HorizontalPodAutoscalerSpec __otherCasted = (HorizontalPodAutoscalerSpec) __other;
        return Objects.equals(maxReplicas, __otherCasted.maxReplicas) &&
            Objects.equals(minReplicas, __otherCasted.minReplicas) &&
            Objects.equals(scaleTargetRef, __otherCasted.scaleTargetRef) &&
            Objects.equals(targetCPUUtilizationPercentage, __otherCasted.targetCPUUtilizationPercentage);
    }

    public HorizontalPodAutoscalerSpec maxReplicas(final int maxReplicas) {
        this.maxReplicas = maxReplicas;
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

    public HorizontalPodAutoscalerSpec targetCPUUtilizationPercentage(final Integer targetCPUUtilizationPercentage) {
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
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
