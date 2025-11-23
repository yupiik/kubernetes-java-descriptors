package io.yupiik.kubernetes.bindings.v1_33_0.v2;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HPAScalingRules implements Validable<HPAScalingRules>, Exportable {
    private List<HPAScalingPolicy> policies;
    private String selectPolicy;
    private Integer stabilizationWindowSeconds;
    private String tolerance;

    public HPAScalingRules() {
        // no-op
    }

    public HPAScalingRules(final List<HPAScalingPolicy> policies,
                           final String selectPolicy,
                           final Integer stabilizationWindowSeconds,
                           final String tolerance) {
        this.policies = policies;
        this.selectPolicy = selectPolicy;
        this.stabilizationWindowSeconds = stabilizationWindowSeconds;
        this.tolerance = tolerance;
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

    public String getTolerance() {
        return tolerance;
    }

    public void setTolerance(final String tolerance) {
        this.tolerance = tolerance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                policies,
                selectPolicy,
                stabilizationWindowSeconds,
                tolerance);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HPAScalingRules)) {
            return false;
        }
        final HPAScalingRules __otherCasted = (HPAScalingRules) __other;
        return Objects.equals(policies, __otherCasted.policies) &&
            Objects.equals(selectPolicy, __otherCasted.selectPolicy) &&
            Objects.equals(stabilizationWindowSeconds, __otherCasted.stabilizationWindowSeconds) &&
            Objects.equals(tolerance, __otherCasted.tolerance);
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

    public HPAScalingRules tolerance(final String tolerance) {
        this.tolerance = tolerance;
        return this;
    }

    @Override
    public HPAScalingRules validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (policies != null ? "\"policies\":" + policies.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (selectPolicy != null ? "\"selectPolicy\":\"" +  JsonStrings.escapeJson(selectPolicy) + "\"" : ""),
                    (stabilizationWindowSeconds != null ? "\"stabilizationWindowSeconds\":" + stabilizationWindowSeconds : ""),
                    (tolerance != null ? "\"tolerance\":\"" +  JsonStrings.escapeJson(tolerance) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
