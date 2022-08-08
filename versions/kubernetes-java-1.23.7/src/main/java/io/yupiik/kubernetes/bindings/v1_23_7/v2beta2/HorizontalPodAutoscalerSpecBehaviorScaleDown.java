package io.yupiik.kubernetes.bindings.v1_23_7.v2beta2;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerSpecBehaviorScaleDown {
    private List<HorizontalPodAutoscalerSpecBehaviorScaleDownPolicies> policies;
    private String selectPolicy;
    private Integer stabilizationWindowSeconds;

    public HorizontalPodAutoscalerSpecBehaviorScaleDown() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecBehaviorScaleDown(final List<HorizontalPodAutoscalerSpecBehaviorScaleDownPolicies> policies,
                                                        final String selectPolicy,
                                                        final Integer stabilizationWindowSeconds) {
        // no-op
    }

    public List<HorizontalPodAutoscalerSpecBehaviorScaleDownPolicies> getPolicies() {
        return policies;
    }

    public void setPolicies(final List<HorizontalPodAutoscalerSpecBehaviorScaleDownPolicies> policies) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecBehaviorScaleDown)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecBehaviorScaleDown __otherCasted = (HorizontalPodAutoscalerSpecBehaviorScaleDown) __other;
        return Objects.equals(policies, __otherCasted.policies) &&
            Objects.equals(selectPolicy, __otherCasted.selectPolicy) &&
            Objects.equals(stabilizationWindowSeconds, __otherCasted.stabilizationWindowSeconds);
    }
}
