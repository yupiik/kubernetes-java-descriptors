package io.yupiik.kubernetes.bindings.v1_19_6.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecBehavior {
    private HorizontalPodAutoscalerSpecBehaviorScaleDown scaleDown;
    private HorizontalPodAutoscalerSpecBehaviorScaleUp scaleUp;

    public HorizontalPodAutoscalerSpecBehavior() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecBehavior(final HorizontalPodAutoscalerSpecBehaviorScaleDown scaleDown,
                                               final HorizontalPodAutoscalerSpecBehaviorScaleUp scaleUp) {
        // no-op
    }

    public HorizontalPodAutoscalerSpecBehaviorScaleDown getScaleDown() {
        return scaleDown;
    }

    public void setScaleDown(final HorizontalPodAutoscalerSpecBehaviorScaleDown scaleDown) {
        this.scaleDown = scaleDown;
    }

    public HorizontalPodAutoscalerSpecBehaviorScaleUp getScaleUp() {
        return scaleUp;
    }

    public void setScaleUp(final HorizontalPodAutoscalerSpecBehaviorScaleUp scaleUp) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecBehavior)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecBehavior __otherCasted = (HorizontalPodAutoscalerSpecBehavior) __other;
        return Objects.equals(scaleDown, __otherCasted.scaleDown) &&
            Objects.equals(scaleUp, __otherCasted.scaleUp);
    }
}
