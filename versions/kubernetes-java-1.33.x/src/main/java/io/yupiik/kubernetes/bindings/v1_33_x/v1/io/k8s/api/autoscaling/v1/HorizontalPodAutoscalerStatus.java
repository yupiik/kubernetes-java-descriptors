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
package io.yupiik.kubernetes.bindings.v1_33_x.v1;

import io.yupiik.kubernetes.bindings.v1_33_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus implements Validable<io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus>, Exportable {
    private Integer currentCPUUtilizationPercentage;
    private int currentReplicas;
    private int desiredReplicas;
    private String lastScaleTime;
    private Integer observedGeneration;

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus() {
        // no-op
    }

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus(final Integer currentCPUUtilizationPercentage,
                                                                   final int currentReplicas,
                                                                   final int desiredReplicas,
                                                                   final String lastScaleTime,
                                                                   final Integer observedGeneration) {
        this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
        this.currentReplicas = currentReplicas;
        this.desiredReplicas = desiredReplicas;
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    public Integer getCurrentCPUUtilizationPercentage() {
        return currentCPUUtilizationPercentage;
    }

    public void setCurrentCPUUtilizationPercentage(final Integer currentCPUUtilizationPercentage) {
        this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
    }

    public int getCurrentReplicas() {
        return currentReplicas;
    }

    public void setCurrentReplicas(final int currentReplicas) {
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
                currentCPUUtilizationPercentage,
                currentReplicas,
                desiredReplicas,
                lastScaleTime,
                observedGeneration);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus)) {
            return false;
        }
        final io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus __otherCasted = (io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus) __other;
        return Objects.equals(currentCPUUtilizationPercentage, __otherCasted.currentCPUUtilizationPercentage) &&
            Objects.equals(currentReplicas, __otherCasted.currentReplicas) &&
            Objects.equals(desiredReplicas, __otherCasted.desiredReplicas) &&
            Objects.equals(lastScaleTime, __otherCasted.lastScaleTime) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration);
    }

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus currentCPUUtilizationPercentage(final Integer currentCPUUtilizationPercentage) {
        this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
        return this;
    }

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus currentReplicas(final int currentReplicas) {
        this.currentReplicas = currentReplicas;
        return this;
    }

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus desiredReplicas(final int desiredReplicas) {
        this.desiredReplicas = desiredReplicas;
        return this;
    }

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus lastScaleTime(final String lastScaleTime) {
        this.lastScaleTime = lastScaleTime;
        return this;
    }

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    @Override
    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (currentCPUUtilizationPercentage != null ? "\"currentCPUUtilizationPercentage\":" + currentCPUUtilizationPercentage : ""),
                    "\"currentReplicas\":" + currentReplicas,
                    "\"desiredReplicas\":" + desiredReplicas,
                    (lastScaleTime != null ? "\"lastScaleTime\":\"" +  JsonStrings.escapeJson(lastScaleTime) + "\"" : ""),
                    (observedGeneration != null ? "\"observedGeneration\":" + observedGeneration : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
