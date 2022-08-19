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
package io.yupiik.kubernetes.bindings.v1_13_8.v1;

import io.yupiik.kubernetes.bindings.v1_13_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_13_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_13_8.Validable;
import io.yupiik.kubernetes.bindings.v1_13_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SubjectRulesReviewStatus implements Validable<SubjectRulesReviewStatus>, Exportable {
    private String evaluationError;
    private boolean incomplete;
    private List<NonResourceRule> nonResourceRules;
    private List<ResourceRule> resourceRules;

    public SubjectRulesReviewStatus() {
        // no-op
    }

    public SubjectRulesReviewStatus(final String evaluationError,
                                    final boolean incomplete,
                                    final List<NonResourceRule> nonResourceRules,
                                    final List<ResourceRule> resourceRules) {
        this.evaluationError = evaluationError;
        this.incomplete = incomplete;
        this.nonResourceRules = nonResourceRules;
        this.resourceRules = resourceRules;
    }

    public String getEvaluationError() {
        return evaluationError;
    }

    public void setEvaluationError(final String evaluationError) {
        this.evaluationError = evaluationError;
    }

    public boolean getIncomplete() {
        return incomplete;
    }

    public void setIncomplete(final boolean incomplete) {
        this.incomplete = incomplete;
    }

    public List<NonResourceRule> getNonResourceRules() {
        return nonResourceRules;
    }

    public void setNonResourceRules(final List<NonResourceRule> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
    }

    public List<ResourceRule> getResourceRules() {
        return resourceRules;
    }

    public void setResourceRules(final List<ResourceRule> resourceRules) {
        this.resourceRules = resourceRules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                evaluationError,
                incomplete,
                nonResourceRules,
                resourceRules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SubjectRulesReviewStatus)) {
            return false;
        }
        final SubjectRulesReviewStatus __otherCasted = (SubjectRulesReviewStatus) __other;
        return Objects.equals(evaluationError, __otherCasted.evaluationError) &&
            Objects.equals(incomplete, __otherCasted.incomplete) &&
            Objects.equals(nonResourceRules, __otherCasted.nonResourceRules) &&
            Objects.equals(resourceRules, __otherCasted.resourceRules);
    }

    public SubjectRulesReviewStatus evaluationError(final String evaluationError) {
        this.evaluationError = evaluationError;
        return this;
    }

    public SubjectRulesReviewStatus incomplete(final boolean incomplete) {
        this.incomplete = incomplete;
        return this;
    }

    public SubjectRulesReviewStatus nonResourceRules(final List<NonResourceRule> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
        return this;
    }

    public SubjectRulesReviewStatus resourceRules(final List<ResourceRule> resourceRules) {
        this.resourceRules = resourceRules;
        return this;
    }

    @Override
    public SubjectRulesReviewStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (nonResourceRules == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "nonResourceRules", "nonResourceRules",
                "Missing 'nonResourceRules' attribute.", true));
        }
        if (resourceRules == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resourceRules", "resourceRules",
                "Missing 'resourceRules' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (evaluationError != null ? "\"evaluationError\":\"" +  JsonStrings.escapeJson(evaluationError) + "\"" : ""),
                    "\"incomplete\":" + incomplete,
                    (nonResourceRules != null ? "\"nonResourceRules\":" + nonResourceRules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (resourceRules != null ? "\"resourceRules\":" + resourceRules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
