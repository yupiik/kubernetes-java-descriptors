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
package io.yupiik.kubernetes.bindings.v1_22_0.v1;

import io.yupiik.kubernetes.bindings.v1_22_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_0.Validable;
import io.yupiik.kubernetes.bindings.v1_22_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodReadinessGate implements Validable<PodReadinessGate>, Exportable {
    private String conditionType;

    public PodReadinessGate() {
        // no-op
    }

    public PodReadinessGate(final String conditionType) {
        this.conditionType = conditionType;
    }

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(final String conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodReadinessGate)) {
            return false;
        }
        final PodReadinessGate __otherCasted = (PodReadinessGate) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }

    public PodReadinessGate conditionType(final String conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    @Override
    public PodReadinessGate validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (conditionType == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "conditionType", "conditionType",
                "Missing 'conditionType' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditionType != null ? "\"conditionType\":\"" +  JsonStrings.escapeJson(conditionType) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
