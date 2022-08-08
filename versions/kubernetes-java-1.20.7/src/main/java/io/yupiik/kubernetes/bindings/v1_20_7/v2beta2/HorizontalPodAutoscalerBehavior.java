package io.yupiik.kubernetes.bindings.v1_20_7.v2beta2;

import io.yupiik.kubernetes.bindings.v1_20_7.Validable;
import io.yupiik.kubernetes.bindings.v1_20_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerBehavior implements Validable<HorizontalPodAutoscalerBehavior> {
    private HPAScalingRules scaleDown;
    private HPAScalingRules scaleUp;

    public HorizontalPodAutoscalerBehavior() {
        // no-op
    }

    public HorizontalPodAutoscalerBehavior(final HPAScalingRules scaleDown,
                                           final HPAScalingRules scaleUp) {
        // no-op
    }

    public HPAScalingRules getScaleDown() {
        return scaleDown;
    }

    public void setScaleDown(final HPAScalingRules scaleDown) {
        this.scaleDown = scaleDown;
    }

    public HPAScalingRules getScaleUp() {
        return scaleUp;
    }

    public void setScaleUp(final HPAScalingRules scaleUp) {
        this.scaleUp = scaleUp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                scaleDown,
                scaleUp);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerBehavior)) {
            return false;
        }
        final HorizontalPodAutoscalerBehavior __otherCasted = (HorizontalPodAutoscalerBehavior) __other;
        return Objects.equals(scaleDown, __otherCasted.scaleDown) &&
            Objects.equals(scaleUp, __otherCasted.scaleUp);
    }

    public HorizontalPodAutoscalerBehavior scaleDown(final HPAScalingRules scaleDown) {
        this.scaleDown = scaleDown;
        return this;
    }

    public HorizontalPodAutoscalerBehavior scaleUp(final HPAScalingRules scaleUp) {
        this.scaleUp = scaleUp;
        return this;
    }

    @Override
    public HorizontalPodAutoscalerBehavior validate() {
        return this;
    }
}
