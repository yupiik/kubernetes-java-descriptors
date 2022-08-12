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
package io.yupiik.kubernetes.bindings.v1_16_5.v1;

import io.yupiik.kubernetes.bindings.v1_16_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_5.Validable;
import io.yupiik.kubernetes.bindings.v1_16_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ScopedResourceSelectorRequirement implements Validable<ScopedResourceSelectorRequirement>, Exportable {
    private String operator;
    private String scopeName;
    private List<String> values;

    public ScopedResourceSelectorRequirement() {
        // no-op
    }

    public ScopedResourceSelectorRequirement(final String operator,
                                             final String scopeName,
                                             final List<String> values) {
        // no-op
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(final String operator) {
        this.operator = operator;
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(final String scopeName) {
        this.scopeName = scopeName;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(final List<String> values) {
        this.values = values;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                operator,
                scopeName,
                values);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ScopedResourceSelectorRequirement)) {
            return false;
        }
        final ScopedResourceSelectorRequirement __otherCasted = (ScopedResourceSelectorRequirement) __other;
        return Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(scopeName, __otherCasted.scopeName) &&
            Objects.equals(values, __otherCasted.values);
    }

    public ScopedResourceSelectorRequirement operator(final String operator) {
        this.operator = operator;
        return this;
    }

    public ScopedResourceSelectorRequirement scopeName(final String scopeName) {
        this.scopeName = scopeName;
        return this;
    }

    public ScopedResourceSelectorRequirement values(final List<String> values) {
        this.values = values;
        return this;
    }

    @Override
    public ScopedResourceSelectorRequirement validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (operator == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "operator", "operator",
                "Missing 'operator' attribute.", true));
        }
        if (scopeName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "scopeName", "scopeName",
                "Missing 'scopeName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (operator != null ? "\"operator\":\"" +  JsonStrings.escapeJson(operator) + "\"" : ""),
                    (scopeName != null ? "\"scopeName\":\"" +  JsonStrings.escapeJson(scopeName) + "\"" : ""),
                    (values != null ? "\"values\":" + values.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
