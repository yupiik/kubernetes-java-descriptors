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
package io.yupiik.kubernetes.bindings.v1_14_9.v2beta2;

import io.yupiik.kubernetes.bindings.v1_14_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_9.Validable;
import io.yupiik.kubernetes.bindings.v1_14_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ObjectMetricSource implements Validable<ObjectMetricSource>, Exportable {
    private CrossVersionObjectReference describedObject;
    private MetricIdentifier metric;
    private MetricTarget target;

    public ObjectMetricSource() {
        // no-op
    }

    public ObjectMetricSource(final CrossVersionObjectReference describedObject,
                              final MetricIdentifier metric,
                              final MetricTarget target) {
        this.describedObject = describedObject;
        this.metric = metric;
        this.target = target;
    }

    public CrossVersionObjectReference getDescribedObject() {
        return describedObject;
    }

    public void setDescribedObject(final CrossVersionObjectReference describedObject) {
        this.describedObject = describedObject;
    }

    public MetricIdentifier getMetric() {
        return metric;
    }

    public void setMetric(final MetricIdentifier metric) {
        this.metric = metric;
    }

    public MetricTarget getTarget() {
        return target;
    }

    public void setTarget(final MetricTarget target) {
        this.target = target;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                describedObject,
                metric,
                target);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ObjectMetricSource)) {
            return false;
        }
        final ObjectMetricSource __otherCasted = (ObjectMetricSource) __other;
        return Objects.equals(describedObject, __otherCasted.describedObject) &&
            Objects.equals(metric, __otherCasted.metric) &&
            Objects.equals(target, __otherCasted.target);
    }

    public ObjectMetricSource describedObject(final CrossVersionObjectReference describedObject) {
        this.describedObject = describedObject;
        return this;
    }

    public ObjectMetricSource metric(final MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

    public ObjectMetricSource target(final MetricTarget target) {
        this.target = target;
        return this;
    }

    @Override
    public ObjectMetricSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (describedObject == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "describedObject", "describedObject",
                "Missing 'describedObject' attribute.", true));
        }
        if (metric == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metric", "metric",
                "Missing 'metric' attribute.", true));
        }
        if (target == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "target", "target",
                "Missing 'target' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (describedObject != null ? "\"describedObject\":" + describedObject.asJson() : ""),
                    (metric != null ? "\"metric\":" + metric.asJson() : ""),
                    (target != null ? "\"target\":" + target.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
