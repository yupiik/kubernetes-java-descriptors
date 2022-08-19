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
package io.yupiik.kubernetes.bindings.v1_12_7.v2beta1;

import io.yupiik.kubernetes.bindings.v1_12_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_12_7.Validable;
import io.yupiik.kubernetes.bindings.v1_12_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ExternalMetricStatus implements Validable<ExternalMetricStatus>, Exportable {
    private String currentAverageValue;
    private String currentValue;
    private String metricName;
    private LabelSelector metricSelector;

    public ExternalMetricStatus() {
        // no-op
    }

    public ExternalMetricStatus(final String currentAverageValue,
                                final String currentValue,
                                final String metricName,
                                final LabelSelector metricSelector) {
        this.currentAverageValue = currentAverageValue;
        this.currentValue = currentValue;
        this.metricName = metricName;
        this.metricSelector = metricSelector;
    }

    public String getCurrentAverageValue() {
        return currentAverageValue;
    }

    public void setCurrentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(final String currentValue) {
        this.currentValue = currentValue;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    public LabelSelector getMetricSelector() {
        return metricSelector;
    }

    public void setMetricSelector(final LabelSelector metricSelector) {
        this.metricSelector = metricSelector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                currentAverageValue,
                currentValue,
                metricName,
                metricSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExternalMetricStatus)) {
            return false;
        }
        final ExternalMetricStatus __otherCasted = (ExternalMetricStatus) __other;
        return Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(currentValue, __otherCasted.currentValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(metricSelector, __otherCasted.metricSelector);
    }

    public ExternalMetricStatus currentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
        return this;
    }

    public ExternalMetricStatus currentValue(final String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    public ExternalMetricStatus metricName(final String metricName) {
        this.metricName = metricName;
        return this;
    }

    public ExternalMetricStatus metricSelector(final LabelSelector metricSelector) {
        this.metricSelector = metricSelector;
        return this;
    }

    @Override
    public ExternalMetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (currentValue == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "currentValue", "currentValue",
                "Missing 'currentValue' attribute.", true));
        }
        if (metricName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metricName", "metricName",
                "Missing 'metricName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (currentAverageValue != null ? "\"currentAverageValue\":\"" +  JsonStrings.escapeJson(currentAverageValue) + "\"" : ""),
                    (currentValue != null ? "\"currentValue\":\"" +  JsonStrings.escapeJson(currentValue) + "\"" : ""),
                    (metricName != null ? "\"metricName\":\"" +  JsonStrings.escapeJson(metricName) + "\"" : ""),
                    (metricSelector != null ? "\"metricSelector\":" + metricSelector.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
