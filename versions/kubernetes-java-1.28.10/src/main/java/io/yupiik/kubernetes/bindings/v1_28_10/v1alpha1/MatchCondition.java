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
package io.yupiik.kubernetes.bindings.v1_28_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_28_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_10.Validable;
import io.yupiik.kubernetes.bindings.v1_28_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class MatchCondition implements Validable<MatchCondition>, Exportable {
    private String expression;
    private String name;

    public MatchCondition() {
        // no-op
    }

    public MatchCondition(final String expression,
                          final String name) {
        this.expression = expression;
        this.name = name;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(final String expression) {
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                expression,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof MatchCondition)) {
            return false;
        }
        final MatchCondition __otherCasted = (MatchCondition) __other;
        return Objects.equals(expression, __otherCasted.expression) &&
            Objects.equals(name, __otherCasted.name);
    }

    public MatchCondition expression(final String expression) {
        this.expression = expression;
        return this;
    }

    public MatchCondition name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public MatchCondition validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (expression == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "expression", "expression",
                "Missing 'expression' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (expression != null ? "\"expression\":\"" +  JsonStrings.escapeJson(expression) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
