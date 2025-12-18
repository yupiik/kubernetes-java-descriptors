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
package io.yupiik.kubernetes.bindings.v1_33_x.v2;

import io.yupiik.kubernetes.bindings.v1_33_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import io.yupiik.kubernetes.bindings.v1_33_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.autoscaling.v2.ExternalMetricStatus implements Validable<io.k8s.api.autoscaling.v2.ExternalMetricStatus>, Exportable {
    private MetricValueStatus current;
    private MetricIdentifier metric;

    public io.k8s.api.autoscaling.v2.ExternalMetricStatus() {
        // no-op
    }

    public io.k8s.api.autoscaling.v2.ExternalMetricStatus(final MetricValueStatus current,
                                                          final MetricIdentifier metric) {
        this.current = current;
        this.metric = metric;
    }

    public MetricValueStatus getCurrent() {
        return current;
    }

    public void setCurrent(final MetricValueStatus current) {
        this.current = current;
    }

    public MetricIdentifier getMetric() {
        return metric;
    }

    public void setMetric(final MetricIdentifier metric) {
        this.metric = metric;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                current,
                metric);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.autoscaling.v2.ExternalMetricStatus)) {
            return false;
        }
        final io.k8s.api.autoscaling.v2.ExternalMetricStatus __otherCasted = (io.k8s.api.autoscaling.v2.ExternalMetricStatus) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(metric, __otherCasted.metric);
    }

    public io.k8s.api.autoscaling.v2.ExternalMetricStatus current(final MetricValueStatus current) {
        this.current = current;
        return this;
    }

    public io.k8s.api.autoscaling.v2.ExternalMetricStatus metric(final MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

    @Override
    public io.k8s.api.autoscaling.v2.ExternalMetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (current == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "current", "current",
                "Missing 'current' attribute.", true));
        }
        if (metric == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metric", "metric",
                "Missing 'metric' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (current != null ? "\"current\":" + current.asJson() : ""),
                    (metric != null ? "\"metric\":" + metric.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
