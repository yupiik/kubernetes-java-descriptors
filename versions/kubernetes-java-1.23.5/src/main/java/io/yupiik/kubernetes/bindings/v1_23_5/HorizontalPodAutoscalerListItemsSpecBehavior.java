package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecBehavior {
    private HorizontalPodAutoscalerListItemsSpecBehaviorScaleDown scaleDown;
    private HorizontalPodAutoscalerListItemsSpecBehaviorScaleUp scaleUp;

    public HorizontalPodAutoscalerListItemsSpecBehavior() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecBehavior(final HorizontalPodAutoscalerListItemsSpecBehaviorScaleDown scaleDown,
                                                        final HorizontalPodAutoscalerListItemsSpecBehaviorScaleUp scaleUp) {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecBehaviorScaleDown getScaleDown() {
        return scaleDown;
    }

    public void setScaleDown(final HorizontalPodAutoscalerListItemsSpecBehaviorScaleDown scaleDown) {
        this.scaleDown = scaleDown;
    }

    public HorizontalPodAutoscalerListItemsSpecBehaviorScaleUp getScaleUp() {
        return scaleUp;
    }

    public void setScaleUp(final HorizontalPodAutoscalerListItemsSpecBehaviorScaleUp scaleUp) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecBehavior)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecBehavior __otherCasted = (HorizontalPodAutoscalerListItemsSpecBehavior) __other;
        return Objects.equals(scaleDown, __otherCasted.scaleDown) &&
            Objects.equals(scaleUp, __otherCasted.scaleUp);
    }
}
