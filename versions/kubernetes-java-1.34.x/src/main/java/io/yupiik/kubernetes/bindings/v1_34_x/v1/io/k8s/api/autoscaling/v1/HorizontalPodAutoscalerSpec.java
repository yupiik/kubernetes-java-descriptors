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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import io.yupiik.kubernetes.bindings.v1_34_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec implements Validable<io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec>, Exportable {
    private int maxReplicas;
    private Integer minReplicas;
    private CrossVersionObjectReference scaleTargetRef;
    private Integer targetCPUUtilizationPercentage;

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec() {
        // no-op
    }

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec(final int maxReplicas,
                                                                 final Integer minReplicas,
                                                                 final CrossVersionObjectReference scaleTargetRef,
                                                                 final Integer targetCPUUtilizationPercentage) {
        this.maxReplicas = maxReplicas;
        this.minReplicas = minReplicas;
        this.scaleTargetRef = scaleTargetRef;
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }

    public int getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(final int maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public Integer getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(final Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    public CrossVersionObjectReference getScaleTargetRef() {
        return scaleTargetRef;
    }

    public void setScaleTargetRef(final CrossVersionObjectReference scaleTargetRef) {
        this.scaleTargetRef = scaleTargetRef;
    }

    public Integer getTargetCPUUtilizationPercentage() {
        return targetCPUUtilizationPercentage;
    }

    public void setTargetCPUUtilizationPercentage(final Integer targetCPUUtilizationPercentage) {
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxReplicas,
                minReplicas,
                scaleTargetRef,
                targetCPUUtilizationPercentage);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec)) {
            return false;
        }
        final io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec __otherCasted = (io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec) __other;
        return Objects.equals(maxReplicas, __otherCasted.maxReplicas) &&
            Objects.equals(minReplicas, __otherCasted.minReplicas) &&
            Objects.equals(scaleTargetRef, __otherCasted.scaleTargetRef) &&
            Objects.equals(targetCPUUtilizationPercentage, __otherCasted.targetCPUUtilizationPercentage);
    }

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec maxReplicas(final int maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec minReplicas(final Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec scaleTargetRef(final CrossVersionObjectReference scaleTargetRef) {
        this.scaleTargetRef = scaleTargetRef;
        return this;
    }

    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec targetCPUUtilizationPercentage(final Integer targetCPUUtilizationPercentage) {
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
        return this;
    }

    @Override
    public io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (scaleTargetRef == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "scaleTargetRef", "scaleTargetRef",
                "Missing 'scaleTargetRef' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"maxReplicas\":" + maxReplicas,
                    (minReplicas != null ? "\"minReplicas\":" + minReplicas : ""),
                    (scaleTargetRef != null ? "\"scaleTargetRef\":" + scaleTargetRef.asJson() : ""),
                    (targetCPUUtilizationPercentage != null ? "\"targetCPUUtilizationPercentage\":" + targetCPUUtilizationPercentage : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
