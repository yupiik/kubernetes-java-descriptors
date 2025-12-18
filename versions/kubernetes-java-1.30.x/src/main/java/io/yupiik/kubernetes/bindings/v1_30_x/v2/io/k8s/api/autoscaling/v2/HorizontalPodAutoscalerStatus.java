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
package io.yupiik.kubernetes.bindings.v1_30_x.v2;

import io.yupiik.kubernetes.bindings.v1_30_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus implements Validable<io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus>, Exportable {
    private List<HorizontalPodAutoscalerCondition> conditions;
    private List<MetricStatus> currentMetrics;
    private Integer currentReplicas;
    private int desiredReplicas;
    private String lastScaleTime;
    private Integer observedGeneration;

    public io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus() {
        // no-op
    }

    public io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus(final List<HorizontalPodAutoscalerCondition> conditions,
                                                                   final List<MetricStatus> currentMetrics,
                                                                   final Integer currentReplicas,
                                                                   final int desiredReplicas,
                                                                   final String lastScaleTime,
                                                                   final Integer observedGeneration) {
        this.conditions = conditions;
        this.currentMetrics = currentMetrics;
        this.currentReplicas = currentReplicas;
        this.desiredReplicas = desiredReplicas;
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    public List<HorizontalPodAutoscalerCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<HorizontalPodAutoscalerCondition> conditions) {
        this.conditions = conditions;
    }

    public List<MetricStatus> getCurrentMetrics() {
        return currentMetrics;
    }

    public void setCurrentMetrics(final List<MetricStatus> currentMetrics) {
        this.currentMetrics = currentMetrics;
    }

    public Integer getCurrentReplicas() {
        return currentReplicas;
    }

    public void setCurrentReplicas(final Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
    }

    public int getDesiredReplicas() {
        return desiredReplicas;
    }

    public void setDesiredReplicas(final int desiredReplicas) {
        this.desiredReplicas = desiredReplicas;
    }

    public String getLastScaleTime() {
        return lastScaleTime;
    }

    public void setLastScaleTime(final String lastScaleTime) {
        this.lastScaleTime = lastScaleTime;
    }

    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions,
                currentMetrics,
                currentReplicas,
                desiredReplicas,
                lastScaleTime,
                observedGeneration);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus)) {
            return false;
        }
        final io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus __otherCasted = (io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(currentMetrics, __otherCasted.currentMetrics) &&
            Objects.equals(currentReplicas, __otherCasted.currentReplicas) &&
            Objects.equals(desiredReplicas, __otherCasted.desiredReplicas) &&
            Objects.equals(lastScaleTime, __otherCasted.lastScaleTime) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration);
    }

    public io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus conditions(final List<HorizontalPodAutoscalerCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus currentMetrics(final List<MetricStatus> currentMetrics) {
        this.currentMetrics = currentMetrics;
        return this;
    }

    public io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus currentReplicas(final Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
        return this;
    }

    public io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus desiredReplicas(final int desiredReplicas) {
        this.desiredReplicas = desiredReplicas;
        return this;
    }

    public io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus lastScaleTime(final String lastScaleTime) {
        this.lastScaleTime = lastScaleTime;
        return this;
    }

    public io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    @Override
    public io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (currentMetrics != null ? "\"currentMetrics\":" + currentMetrics.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (currentReplicas != null ? "\"currentReplicas\":" + currentReplicas : ""),
                    "\"desiredReplicas\":" + desiredReplicas,
                    (lastScaleTime != null ? "\"lastScaleTime\":\"" +  JsonStrings.escapeJson(lastScaleTime) + "\"" : ""),
                    (observedGeneration != null ? "\"observedGeneration\":" + observedGeneration : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
