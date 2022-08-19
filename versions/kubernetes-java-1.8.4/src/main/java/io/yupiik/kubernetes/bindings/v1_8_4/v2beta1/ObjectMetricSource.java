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
package io.yupiik.kubernetes.bindings.v1_8_4.v2beta1;

import io.yupiik.kubernetes.bindings.v1_8_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_4.Validable;
import io.yupiik.kubernetes.bindings.v1_8_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ObjectMetricSource implements Validable<ObjectMetricSource>, Exportable {
    private String metricName;
    private CrossVersionObjectReference target;
    private String targetValue;

    public ObjectMetricSource() {
        // no-op
    }

    public ObjectMetricSource(final String metricName,
                              final CrossVersionObjectReference target,
                              final String targetValue) {
        this.metricName = metricName;
        this.target = target;
        this.targetValue = targetValue;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    public CrossVersionObjectReference getTarget() {
        return target;
    }

    public void setTarget(final CrossVersionObjectReference target) {
        this.target = target;
    }

    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(final String targetValue) {
        this.targetValue = targetValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metricName,
                target,
                targetValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ObjectMetricSource)) {
            return false;
        }
        final ObjectMetricSource __otherCasted = (ObjectMetricSource) __other;
        return Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(target, __otherCasted.target) &&
            Objects.equals(targetValue, __otherCasted.targetValue);
    }

    public ObjectMetricSource metricName(final String metricName) {
        this.metricName = metricName;
        return this;
    }

    public ObjectMetricSource target(final CrossVersionObjectReference target) {
        this.target = target;
        return this;
    }

    public ObjectMetricSource targetValue(final String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    @Override
    public ObjectMetricSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (metricName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metricName", "metricName",
                "Missing 'metricName' attribute.", true));
        }
        if (target == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "target", "target",
                "Missing 'target' attribute.", true));
        }
        if (targetValue == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "targetValue", "targetValue",
                "Missing 'targetValue' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (metricName != null ? "\"metricName\":\"" +  JsonStrings.escapeJson(metricName) + "\"" : ""),
                    (target != null ? "\"target\":" + target.asJson() : ""),
                    (targetValue != null ? "\"targetValue\":\"" +  JsonStrings.escapeJson(targetValue) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
