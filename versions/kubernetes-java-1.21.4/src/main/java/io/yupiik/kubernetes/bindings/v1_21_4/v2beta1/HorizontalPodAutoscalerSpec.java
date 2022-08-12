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
package io.yupiik.kubernetes.bindings.v1_21_4.v2beta1;

import io.yupiik.kubernetes.bindings.v1_21_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_4.Validable;
import io.yupiik.kubernetes.bindings.v1_21_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HorizontalPodAutoscalerSpec implements Validable<HorizontalPodAutoscalerSpec>, Exportable {
    private int maxReplicas;
    private List<MetricSpec> metrics;
    private Integer minReplicas;
    private CrossVersionObjectReference scaleTargetRef;

    public HorizontalPodAutoscalerSpec() {
        // no-op
    }

    public HorizontalPodAutoscalerSpec(final int maxReplicas,
                                       final List<MetricSpec> metrics,
                                       final Integer minReplicas,
                                       final CrossVersionObjectReference scaleTargetRef) {
        // no-op
    }

    public int getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(final int maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public List<MetricSpec> getMetrics() {
        return metrics;
    }

    public void setMetrics(final List<MetricSpec> metrics) {
        this.metrics = metrics;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                maxReplicas,
                metrics,
                minReplicas,
                scaleTargetRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpec)) {
            return false;
        }
        final HorizontalPodAutoscalerSpec __otherCasted = (HorizontalPodAutoscalerSpec) __other;
        return Objects.equals(maxReplicas, __otherCasted.maxReplicas) &&
            Objects.equals(metrics, __otherCasted.metrics) &&
            Objects.equals(minReplicas, __otherCasted.minReplicas) &&
            Objects.equals(scaleTargetRef, __otherCasted.scaleTargetRef);
    }

    public HorizontalPodAutoscalerSpec maxReplicas(final int maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    public HorizontalPodAutoscalerSpec metrics(final List<MetricSpec> metrics) {
        this.metrics = metrics;
        return this;
    }

    public HorizontalPodAutoscalerSpec minReplicas(final Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    public HorizontalPodAutoscalerSpec scaleTargetRef(final CrossVersionObjectReference scaleTargetRef) {
        this.scaleTargetRef = scaleTargetRef;
        return this;
    }

    @Override
    public HorizontalPodAutoscalerSpec validate() {
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
                    (metrics != null ? "\"metrics\":" + metrics.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (minReplicas != null ? "\"minReplicas\":" + minReplicas : ""),
                    (scaleTargetRef != null ? "\"scaleTargetRef\":" + scaleTargetRef.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
