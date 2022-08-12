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
package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Conditions implements Validable<Conditions>, Exportable {
    private List<Condition> conditions;
    private ConditionOperator operator;

    public Conditions() {
        // no-op
    }

    public Conditions(final List<Condition> conditions,
                      final ConditionOperator operator) {
        // no-op
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<Condition> conditions) {
        this.conditions = conditions;
    }

    public ConditionOperator getOperator() {
        return operator;
    }

    public void setOperator(final ConditionOperator operator) {
        this.operator = operator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions,
                operator);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Conditions)) {
            return false;
        }
        final Conditions __otherCasted = (Conditions) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(operator, __otherCasted.operator);
    }

    public Conditions conditions(final List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public Conditions operator(final ConditionOperator operator) {
        this.operator = operator;
        return this;
    }

    @Override
    public Conditions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (operator != null ? "\"operator\":" + operator.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
