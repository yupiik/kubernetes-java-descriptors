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
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AwaitConditions implements Validable<AwaitConditions>, Exportable {
    private String command;
    private List<AwaitCondition> conditions;
    private ConditionOperator operator;

    public AwaitConditions() {
        // no-op
    }

    public AwaitConditions(final String command,
                           final List<AwaitCondition> conditions,
                           final ConditionOperator operator) {
        // no-op
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(final String command) {
        this.command = command;
    }

    public List<AwaitCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<AwaitCondition> conditions) {
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
                command,
                conditions,
                operator);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AwaitConditions)) {
            return false;
        }
        final AwaitConditions __otherCasted = (AwaitConditions) __other;
        return Objects.equals(command, __otherCasted.command) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(operator, __otherCasted.operator);
    }

    public AwaitConditions command(final String command) {
        this.command = command;
        return this;
    }

    public AwaitConditions conditions(final List<AwaitCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public AwaitConditions operator(final ConditionOperator operator) {
        this.operator = operator;
        return this;
    }

    @Override
    public AwaitConditions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (command != null ? "\"command\":\"" +  JsonStrings.escapeJson(command) + "\"" : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (operator != null ? "\"operator\":" + operator.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
