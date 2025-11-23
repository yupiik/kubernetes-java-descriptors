/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_27_12.v2;

import io.yupiik.kubernetes.bindings.v1_27_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_12.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HPAScalingRules implements Validable<HPAScalingRules>, Exportable {
    private List<HPAScalingPolicy> policies;
    private String selectPolicy;
    private Integer stabilizationWindowSeconds;

    public HPAScalingRules() {
        // no-op
    }

    public HPAScalingRules(final List<HPAScalingPolicy> policies,
                           final String selectPolicy,
                           final Integer stabilizationWindowSeconds) {
        this.policies = policies;
        this.selectPolicy = selectPolicy;
        this.stabilizationWindowSeconds = stabilizationWindowSeconds;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (policies != null ? "\"policies\":" + policies.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (selectPolicy != null ? "\"selectPolicy\":\"" +  JsonStrings.escapeJson(selectPolicy) + "\"" : ""),
                    (stabilizationWindowSeconds != null ? "\"stabilizationWindowSeconds\":" + stabilizationWindowSeconds : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
