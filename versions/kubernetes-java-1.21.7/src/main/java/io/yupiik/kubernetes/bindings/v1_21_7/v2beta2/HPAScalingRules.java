package io.yupiik.kubernetes.bindings.v1_21_7.v2beta2;

import io.yupiik.kubernetes.bindings.v1_21_7.Validable;
import io.yupiik.kubernetes.bindings.v1_21_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HPAScalingRules implements Validable<HPAScalingRules> {
    private List<HPAScalingPolicy> policies;
    private String selectPolicy;
    private Integer stabilizationWindowSeconds;

    public HPAScalingRules() {
        // no-op
    }

    public HPAScalingRules(final List<HPAScalingPolicy> policies,
                           final String selectPolicy,
                           final Integer stabilizationWindowSeconds) {
        // no-op
    }

    public List<HPAScalingPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(final List<HPAScalingPolicy> policies) {
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
        if (!(__other instanceof HPAScalingRules)) {
            return false;
        }
        final HPAScalingRules __otherCasted = (HPAScalingRules) __other;
        return Objects.equals(policies, __otherCasted.policies) &&
            Objects.equals(selectPolicy, __otherCasted.selectPolicy) &&
            Objects.equals(stabilizationWindowSeconds, __otherCasted.stabilizationWindowSeconds);
    }

    public HPAScalingRules policies(final List<HPAScalingPolicy> policies) {
        this.policies = policies;
        return this;
    }

    public HPAScalingRules selectPolicy(final String selectPolicy) {
        this.selectPolicy = selectPolicy;
        return this;
    }

    public HPAScalingRules stabilizationWindowSeconds(final Integer stabilizationWindowSeconds) {
        this.stabilizationWindowSeconds = stabilizationWindowSeconds;
        return this;
    }

    @Override
    public HPAScalingRules validate() {
        return this;
    }
}
