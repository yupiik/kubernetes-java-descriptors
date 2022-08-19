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
package io.yupiik.kubernetes.bindings.v1_8_15.v2beta1;

import io.yupiik.kubernetes.bindings.v1_8_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_15.Validable;
import io.yupiik.kubernetes.bindings.v1_8_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodsMetricSource implements Validable<PodsMetricSource>, Exportable {
    private String metricName;
    private String targetAverageValue;

    public PodsMetricSource() {
        // no-op
    }

    public PodsMetricSource(final String metricName,
                            final String targetAverageValue) {
        this.metricName = metricName;
        this.targetAverageValue = targetAverageValue;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    public String getTargetAverageValue() {
        return targetAverageValue;
    }

    public void setTargetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metricName,
                targetAverageValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodsMetricSource)) {
            return false;
        }
        final PodsMetricSource __otherCasted = (PodsMetricSource) __other;
        return Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(targetAverageValue, __otherCasted.targetAverageValue);
    }

    public PodsMetricSource metricName(final String metricName) {
        this.metricName = metricName;
        return this;
    }

    public PodsMetricSource targetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
        return this;
    }

    @Override
    public PodsMetricSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (metricName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metricName", "metricName",
                "Missing 'metricName' attribute.", true));
        }
        if (targetAverageValue == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "targetAverageValue", "targetAverageValue",
                "Missing 'targetAverageValue' attribute.", true));
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
                    (targetAverageValue != null ? "\"targetAverageValue\":\"" +  JsonStrings.escapeJson(targetAverageValue) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
