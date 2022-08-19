/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_11_5.v1;

import io.yupiik.kubernetes.bindings.v1_11_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_11_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_11_5.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HorizontalPodAutoscalerStatus implements Validable<HorizontalPodAutoscalerStatus>, Exportable {
    private Integer currentCPUUtilizationPercentage;
    private int currentReplicas;
    private int desiredReplicas;
    private String lastScaleTime;
    private Integer observedGeneration;

    public HorizontalPodAutoscalerStatus() {
        // no-op
    }

    public HorizontalPodAutoscalerStatus(final Integer currentCPUUtilizationPercentage,
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
        if (!(__other instanceof HorizontalPodAutoscalerStatus)) {
            return false;
        }
        final HorizontalPodAutoscalerStatus __otherCasted = (HorizontalPodAutoscalerStatus) __other;
        return Objects.equals(currentCPUUtilizationPercentage, __otherCasted.currentCPUUtilizationPercentage) &&
            Objects.equals(currentReplicas, __otherCasted.currentReplicas) &&
            Objects.equals(desiredReplicas, __otherCasted.desiredReplicas) &&
            Objects.equals(lastScaleTime, __otherCasted.lastScaleTime) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration);
    }

    public HorizontalPodAutoscalerStatus currentCPUUtilizationPercentage(final Integer currentCPUUtilizationPercentage) {
        this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
        return this;
    }

    public HorizontalPodAutoscalerStatus currentReplicas(final int currentReplicas) {
        this.currentReplicas = currentReplicas;
        return this;
    }

    public HorizontalPodAutoscalerStatus desiredReplicas(final int desiredReplicas) {
        this.desiredReplicas = desiredReplicas;
        return this;
    }

    public HorizontalPodAutoscalerStatus lastScaleTime(final String lastScaleTime) {
        this.lastScaleTime = lastScaleTime;
        return this;
    }

    public HorizontalPodAutoscalerStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    @Override
    public HorizontalPodAutoscalerStatus validate() {
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
