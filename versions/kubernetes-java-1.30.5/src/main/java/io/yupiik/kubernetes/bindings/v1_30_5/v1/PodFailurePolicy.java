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
package io.yupiik.kubernetes.bindings.v1_30_5.v1;

import io.yupiik.kubernetes.bindings.v1_30_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_5.Validable;
import io.yupiik.kubernetes.bindings.v1_30_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodFailurePolicy implements Validable<PodFailurePolicy>, Exportable {
    private List<PodFailurePolicyRule> rules;

    public PodFailurePolicy() {
        // no-op
    }

    public PodFailurePolicy(final List<PodFailurePolicyRule> rules) {
        this.rules = rules;
    }

    public List<PodFailurePolicyRule> getRules() {
        return rules;
    }

    public void setRules(final List<PodFailurePolicyRule> rules) {
        this.rules = rules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodFailurePolicy)) {
            return false;
        }
        final PodFailurePolicy __otherCasted = (PodFailurePolicy) __other;
        return Objects.equals(rules, __otherCasted.rules);
    }

    public PodFailurePolicy rules(final List<PodFailurePolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public PodFailurePolicy validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (rules == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "rules", "rules",
                "Missing 'rules' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (rules != null ? "\"rules\":" + rules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
