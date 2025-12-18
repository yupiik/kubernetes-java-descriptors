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
package io.yupiik.kubernetes.bindings.v1_34_x.v2;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import io.yupiik.kubernetes.bindings.v1_34_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.autoscaling.v2.MetricTarget implements Validable<io.k8s.api.autoscaling.v2.MetricTarget>, Exportable {
    private Integer averageUtilization;
    private String averageValue;
    private String type;
    private String value;

    public io.k8s.api.autoscaling.v2.MetricTarget() {
        // no-op
    }

    public io.k8s.api.autoscaling.v2.MetricTarget(final Integer averageUtilization,
                                                  final String averageValue,
                                                  final String type,
                                                  final String value) {
        this.averageUtilization = averageUtilization;
        this.averageValue = averageValue;
        this.type = type;
        this.value = value;
    }

    public Integer getAverageUtilization() {
        return averageUtilization;
    }

    public void setAverageUtilization(final Integer averageUtilization) {
        this.averageUtilization = averageUtilization;
    }

    public String getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(final String averageValue) {
        this.averageValue = averageValue;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                averageUtilization,
                averageValue,
                type,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.autoscaling.v2.MetricTarget)) {
            return false;
        }
        final io.k8s.api.autoscaling.v2.MetricTarget __otherCasted = (io.k8s.api.autoscaling.v2.MetricTarget) __other;
        return Objects.equals(averageUtilization, __otherCasted.averageUtilization) &&
            Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(value, __otherCasted.value);
    }

    public io.k8s.api.autoscaling.v2.MetricTarget averageUtilization(final Integer averageUtilization) {
        this.averageUtilization = averageUtilization;
        return this;
    }

    public io.k8s.api.autoscaling.v2.MetricTarget averageValue(final String averageValue) {
        this.averageValue = averageValue;
        return this;
    }

    public io.k8s.api.autoscaling.v2.MetricTarget type(final String type) {
        this.type = type;
        return this;
    }

    public io.k8s.api.autoscaling.v2.MetricTarget value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public io.k8s.api.autoscaling.v2.MetricTarget validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (averageUtilization != null ? "\"averageUtilization\":" + averageUtilization : ""),
                    (averageValue != null ? "\"averageValue\":\"" +  JsonStrings.escapeJson(averageValue) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""),
                    (value != null ? "\"value\":\"" +  JsonStrings.escapeJson(value) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
