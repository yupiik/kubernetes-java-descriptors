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
package io.yupiik.kubernetes.bindings.v1_27_13.v1;

import io.yupiik.kubernetes.bindings.v1_27_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_13.Validable;
import io.yupiik.kubernetes.bindings.v1_27_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodFailurePolicyRule implements Validable<PodFailurePolicyRule>, Exportable {
    private String action;
    private PodFailurePolicyOnExitCodesRequirement onExitCodes;
    private List<PodFailurePolicyOnPodConditionsPattern> onPodConditions;

    public PodFailurePolicyRule() {
        // no-op
    }

    public PodFailurePolicyRule(final String action,
                                final PodFailurePolicyOnExitCodesRequirement onExitCodes,
                                final List<PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
        this.action = action;
        this.onExitCodes = onExitCodes;
        this.onPodConditions = onPodConditions;
    }

    public String getAction() {
        return action;
    }

    public void setAction(final String action) {
        this.action = action;
    }

    public PodFailurePolicyOnExitCodesRequirement getOnExitCodes() {
        return onExitCodes;
    }

    public void setOnExitCodes(final PodFailurePolicyOnExitCodesRequirement onExitCodes) {
        this.onExitCodes = onExitCodes;
    }

    public List<PodFailurePolicyOnPodConditionsPattern> getOnPodConditions() {
        return onPodConditions;
    }

    public void setOnPodConditions(final List<PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
        this.onPodConditions = onPodConditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                onExitCodes,
                onPodConditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodFailurePolicyRule)) {
            return false;
        }
        final PodFailurePolicyRule __otherCasted = (PodFailurePolicyRule) __other;
        return Objects.equals(action, __otherCasted.action) &&
            Objects.equals(onExitCodes, __otherCasted.onExitCodes) &&
            Objects.equals(onPodConditions, __otherCasted.onPodConditions);
    }

    public PodFailurePolicyRule action(final String action) {
        this.action = action;
        return this;
    }

    public PodFailurePolicyRule onExitCodes(final PodFailurePolicyOnExitCodesRequirement onExitCodes) {
        this.onExitCodes = onExitCodes;
        return this;
    }

    public PodFailurePolicyRule onPodConditions(final List<PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
        this.onPodConditions = onPodConditions;
        return this;
    }

    @Override
    public PodFailurePolicyRule validate() {
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
                    (onExitCodes != null ? "\"onExitCodes\":" + onExitCodes.asJson() : ""),
                    (onPodConditions != null ? "\"onPodConditions\":" + onPodConditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
