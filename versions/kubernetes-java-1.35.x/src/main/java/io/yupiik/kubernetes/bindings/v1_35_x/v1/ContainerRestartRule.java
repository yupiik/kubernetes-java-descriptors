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
package io.yupiik.kubernetes.bindings.v1_35_x.v1;

import io.yupiik.kubernetes.bindings.v1_35_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_35_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_35_x.Validable;
import io.yupiik.kubernetes.bindings.v1_35_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerRestartRule implements Validable<ContainerRestartRule>, Exportable {
    private String action;
    private ContainerRestartRuleOnExitCodes exitCodes;

    public ContainerRestartRule() {
        // no-op
    }

    public ContainerRestartRule(final String action,
                                final ContainerRestartRuleOnExitCodes exitCodes) {
        this.action = action;
        this.exitCodes = exitCodes;
    }

    public String getAction() {
        return action;
    }

    public void setAction(final String action) {
        this.action = action;
    }

    public ContainerRestartRuleOnExitCodes getExitCodes() {
        return exitCodes;
    }

    public void setExitCodes(final ContainerRestartRuleOnExitCodes exitCodes) {
        this.exitCodes = exitCodes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                exitCodes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerRestartRule)) {
            return false;
        }
        final ContainerRestartRule __otherCasted = (ContainerRestartRule) __other;
        return Objects.equals(action, __otherCasted.action) &&
            Objects.equals(exitCodes, __otherCasted.exitCodes);
    }

    public ContainerRestartRule action(final String action) {
        this.action = action;
        return this;
    }

    public ContainerRestartRule exitCodes(final ContainerRestartRuleOnExitCodes exitCodes) {
        this.exitCodes = exitCodes;
        return this;
    }

    @Override
    public ContainerRestartRule validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (action == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "action", "action",
                "Missing 'action' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (action != null ? "\"action\":\"" +  JsonStrings.escapeJson(action) + "\"" : ""),
                    (exitCodes != null ? "\"exitCodes\":" + exitCodes.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
