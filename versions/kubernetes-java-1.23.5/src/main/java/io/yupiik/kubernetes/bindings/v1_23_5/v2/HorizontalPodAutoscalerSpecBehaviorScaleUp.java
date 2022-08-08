package io.yupiik.kubernetes.bindings.v1_23_5.v2;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerSpecBehaviorScaleUp {
    private List<HorizontalPodAutoscalerSpecBehaviorScaleUpPolicies> policies;
    private String selectPolicy;
    private Integer stabilizationWindowSeconds;

    public HorizontalPodAutoscalerSpecBehaviorScaleUp() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecBehaviorScaleUp(final List<HorizontalPodAutoscalerSpecBehaviorScaleUpPolicies> policies,
                                                      final String selectPolicy,
                                                      final Integer stabilizationWindowSeconds) {
        // no-op
    }

    public List<HorizontalPodAutoscalerSpecBehaviorScaleUpPolicies> getPolicies() {
        return policies;
    }

    public void setPolicies(final List<HorizontalPodAutoscalerSpecBehaviorScaleUpPolicies> policies) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecBehaviorScaleUp)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecBehaviorScaleUp __otherCasted = (HorizontalPodAutoscalerSpecBehaviorScaleUp) __other;
        return Objects.equals(policies, __otherCasted.policies) &&
            Objects.equals(selectPolicy, __otherCasted.selectPolicy) &&
            Objects.equals(stabilizationWindowSeconds, __otherCasted.stabilizationWindowSeconds);
    }
}
