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
package io.yupiik.kubernetes.bindings.v1_31_x.v2;

import io.yupiik.kubernetes.bindings.v1_31_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.autoscaling.v2.MetricValueStatus implements Validable<io.k8s.api.autoscaling.v2.MetricValueStatus>, Exportable {
    private Integer averageUtilization;
    private String averageValue;
    private String value;

    public io.k8s.api.autoscaling.v2.MetricValueStatus() {
        // no-op
    }

    public io.k8s.api.autoscaling.v2.MetricValueStatus(final Integer averageUtilization,
                                                       final String averageValue,
                                                       final String value) {
        this.averageUtilization = averageUtilization;
        this.averageValue = averageValue;
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
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.autoscaling.v2.MetricValueStatus)) {
            return false;
        }
        final io.k8s.api.autoscaling.v2.MetricValueStatus __otherCasted = (io.k8s.api.autoscaling.v2.MetricValueStatus) __other;
        return Objects.equals(averageUtilization, __otherCasted.averageUtilization) &&
            Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(value, __otherCasted.value);
    }

    public io.k8s.api.autoscaling.v2.MetricValueStatus averageUtilization(final Integer averageUtilization) {
        this.averageUtilization = averageUtilization;
        return this;
    }

    public io.k8s.api.autoscaling.v2.MetricValueStatus averageValue(final String averageValue) {
        this.averageValue = averageValue;
        return this;
    }

    public io.k8s.api.autoscaling.v2.MetricValueStatus value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public io.k8s.api.autoscaling.v2.MetricValueStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (averageUtilization != null ? "\"averageUtilization\":" + averageUtilization : ""),
                    (averageValue != null ? "\"averageValue\":\"" +  JsonStrings.escapeJson(averageValue) + "\"" : ""),
                    (value != null ? "\"value\":\"" +  JsonStrings.escapeJson(value) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
