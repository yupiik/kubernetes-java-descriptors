package io.yupiik.kubernetes.bindings.v1_20_0;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecBehaviorScaleDown {
    private List<HorizontalPodAutoscalerListItemsSpecBehaviorScaleDownPolicies> policies;
    private String selectPolicy;
    private Integer stabilizationWindowSeconds;

    public HorizontalPodAutoscalerListItemsSpecBehaviorScaleDown() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecBehaviorScaleDown(final List<HorizontalPodAutoscalerListItemsSpecBehaviorScaleDownPolicies> policies,
                                                                 final String selectPolicy,
                                                                 final Integer stabilizationWindowSeconds) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsSpecBehaviorScaleDownPolicies> getPolicies() {
        return policies;
    }

    public void setPolicies(final List<HorizontalPodAutoscalerListItemsSpecBehaviorScaleDownPolicies> policies) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecBehaviorScaleDown)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecBehaviorScaleDown __otherCasted = (HorizontalPodAutoscalerListItemsSpecBehaviorScaleDown) __other;
        return Objects.equals(policies, __otherCasted.policies) &&
            Objects.equals(selectPolicy, __otherCasted.selectPolicy) &&
            Objects.equals(stabilizationWindowSeconds, __otherCasted.stabilizationWindowSeconds);
    }
}
