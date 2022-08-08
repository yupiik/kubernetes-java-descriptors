package io.yupiik.kubernetes.bindings.v1_19_11.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecBehaviorScaleDownPolicies {
    private int periodSeconds;
    private String type;
    private int value;

    public HorizontalPodAutoscalerListItemsSpecBehaviorScaleDownPolicies() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecBehaviorScaleDownPolicies(final int periodSeconds,
                                                                         final String type,
                                                                         final int value) {
        // no-op
    }

    public int getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(final int periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                periodSeconds,
                type,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecBehaviorScaleDownPolicies)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecBehaviorScaleDownPolicies __otherCasted = (HorizontalPodAutoscalerListItemsSpecBehaviorScaleDownPolicies) __other;
        return Objects.equals(periodSeconds, __otherCasted.periodSeconds) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(value, __otherCasted.value);
    }
}
