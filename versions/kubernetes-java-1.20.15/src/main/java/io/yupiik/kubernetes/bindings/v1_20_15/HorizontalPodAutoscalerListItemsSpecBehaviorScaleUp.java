package io.yupiik.kubernetes.bindings.v1_20_15;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecBehaviorScaleUp {
    private List<HorizontalPodAutoscalerListItemsSpecBehaviorScaleUpPolicies> policies;
    private String selectPolicy;
    private Integer stabilizationWindowSeconds;

    public HorizontalPodAutoscalerListItemsSpecBehaviorScaleUp() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecBehaviorScaleUp(final List<HorizontalPodAutoscalerListItemsSpecBehaviorScaleUpPolicies> policies,
                                                               final String selectPolicy,
                                                               final Integer stabilizationWindowSeconds) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsSpecBehaviorScaleUpPolicies> getPolicies() {
        return policies;
    }

    public void setPolicies(final List<HorizontalPodAutoscalerListItemsSpecBehaviorScaleUpPolicies> policies) {
        this.policies = policies;
    }

    public String getSelectPolicy() {
        return selectPolicy;
    }

    public void setSelectPolicy(final String selectPolicy) {
        this.selectPolicy = selectPolicy;
    }

    public Integer getStabilizationWindowSeconds() {
        return stabilizationWindowSeconds;
    }

    public void setStabilizationWindowSeconds(final Integer stabilizationWindowSeconds) {
        this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                policies,
                selectPolicy,
                stabilizationWindowSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecBehaviorScaleUp)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecBehaviorScaleUp __otherCasted = (HorizontalPodAutoscalerListItemsSpecBehaviorScaleUp) __other;
        return Objects.equals(policies, __otherCasted.policies) &&
            Objects.equals(selectPolicy, __otherCasted.selectPolicy) &&
            Objects.equals(stabilizationWindowSeconds, __otherCasted.stabilizationWindowSeconds);
    }
}
