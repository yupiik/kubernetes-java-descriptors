package io.yupiik.kubernetes.bindings.v1_23_6.v2;

import io.yupiik.kubernetes.bindings.v1_23_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_6.Validable;
import io.yupiik.kubernetes.bindings.v1_23_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HorizontalPodAutoscalerBehavior implements Validable<HorizontalPodAutoscalerBehavior>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (scaleDown != null ? "\"scaleDown\":" + scaleDown.asJson() : ""),
                    (scaleUp != null ? "\"scaleUp\":" + scaleUp.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
