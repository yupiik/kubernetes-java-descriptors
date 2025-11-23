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
package io.yupiik.kubernetes.bindings.v1_31_7.v1;

import io.yupiik.kubernetes.bindings.v1_31_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_7.Validable;
import io.yupiik.kubernetes.bindings.v1_31_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodFailurePolicyOnExitCodesRequirement implements Validable<PodFailurePolicyOnExitCodesRequirement>, Exportable {
    private String containerName;
    private String operator;
    private List<Integer> values;

    public PodFailurePolicyOnExitCodesRequirement() {
        // no-op
    }

    public PodFailurePolicyOnExitCodesRequirement(final String containerName,
                                                  final String operator,
                                                  final List<Integer> values) {
        this.containerName = containerName;
        this.operator = operator;
        this.values = values;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(final String containerName) {
        this.containerName = containerName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(final String operator) {
        this.operator = operator;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(final List<Integer> values) {
        this.values = values;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                containerName,
                operator,
                values);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodFailurePolicyOnExitCodesRequirement)) {
            return false;
        }
        final PodFailurePolicyOnExitCodesRequirement __otherCasted = (PodFailurePolicyOnExitCodesRequirement) __other;
        return Objects.equals(containerName, __otherCasted.containerName) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(values, __otherCasted.values);
    }

    public PodFailurePolicyOnExitCodesRequirement containerName(final String containerName) {
        this.containerName = containerName;
        return this;
    }

    public PodFailurePolicyOnExitCodesRequirement operator(final String operator) {
        this.operator = operator;
        return this;
    }

    public PodFailurePolicyOnExitCodesRequirement values(final List<Integer> values) {
        this.values = values;
        return this;
    }

    @Override
    public PodFailurePolicyOnExitCodesRequirement validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (operator == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "operator", "operator",
                "Missing 'operator' attribute.", true));
        }
        if (values == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "values", "values",
                "Missing 'values' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (containerName != null ? "\"containerName\":\"" +  JsonStrings.escapeJson(containerName) + "\"" : ""),
                    (operator != null ? "\"operator\":\"" +  JsonStrings.escapeJson(operator) + "\"" : ""),
                    (values != null ? "\"values\":" + values.stream().map(__it -> __it == null ? "null" : String.valueOf(__it)).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
