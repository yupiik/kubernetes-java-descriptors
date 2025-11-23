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
package io.yupiik.kubernetes.bindings.v1_29_9.v2;

import io.yupiik.kubernetes.bindings.v1_29_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_9.Validable;
import io.yupiik.kubernetes.bindings.v1_29_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HPAScalingPolicy implements Validable<HPAScalingPolicy>, Exportable {
    private int periodSeconds;
    private String type;
    private int value;

    public HPAScalingPolicy() {
        // no-op
    }

    public HPAScalingPolicy(final int periodSeconds,
                            final String type,
                            final int value) {
        this.periodSeconds = periodSeconds;
        this.type = type;
        this.value = value;
    }

    public int getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(final int periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                periodSeconds,
                type,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HPAScalingPolicy)) {
            return false;
        }
        final HPAScalingPolicy __otherCasted = (HPAScalingPolicy) __other;
        return Objects.equals(periodSeconds, __otherCasted.periodSeconds) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(value, __otherCasted.value);
    }

    public HPAScalingPolicy periodSeconds(final int periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    public HPAScalingPolicy type(final String type) {
        this.type = type;
        return this;
    }

    public HPAScalingPolicy value(final int value) {
        this.value = value;
        return this;
    }

    @Override
    public HPAScalingPolicy validate() {
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
                    "\"periodSeconds\":" + periodSeconds,
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""),
                    "\"value\":" + value)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
