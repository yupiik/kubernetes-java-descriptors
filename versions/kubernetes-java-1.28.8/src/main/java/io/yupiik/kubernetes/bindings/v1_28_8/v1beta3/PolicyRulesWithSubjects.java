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
package io.yupiik.kubernetes.bindings.v1_28_8.v1beta3;

import io.yupiik.kubernetes.bindings.v1_28_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_8.Validable;
import io.yupiik.kubernetes.bindings.v1_28_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PolicyRulesWithSubjects implements Validable<PolicyRulesWithSubjects>, Exportable {
    private List<NonResourcePolicyRule> nonResourceRules;
    private List<ResourcePolicyRule> resourceRules;
    private List<Subject> subjects;

    public PolicyRulesWithSubjects() {
        // no-op
    }

    public PolicyRulesWithSubjects(final List<NonResourcePolicyRule> nonResourceRules,
                                   final List<ResourcePolicyRule> resourceRules,
                                   final List<Subject> subjects) {
        this.nonResourceRules = nonResourceRules;
        this.resourceRules = resourceRules;
        this.subjects = subjects;
    }

    public List<NonResourcePolicyRule> getNonResourceRules() {
        return nonResourceRules;
    }

    public void setNonResourceRules(final List<NonResourcePolicyRule> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
    }

    public List<ResourcePolicyRule> getResourceRules() {
        return resourceRules;
    }

    public void setResourceRules(final List<ResourcePolicyRule> resourceRules) {
        this.resourceRules = resourceRules;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nonResourceRules,
                resourceRules,
                subjects);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PolicyRulesWithSubjects)) {
            return false;
        }
        final PolicyRulesWithSubjects __otherCasted = (PolicyRulesWithSubjects) __other;
        return Objects.equals(nonResourceRules, __otherCasted.nonResourceRules) &&
            Objects.equals(resourceRules, __otherCasted.resourceRules) &&
            Objects.equals(subjects, __otherCasted.subjects);
    }

    public PolicyRulesWithSubjects nonResourceRules(final List<NonResourcePolicyRule> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
        return this;
    }

    public PolicyRulesWithSubjects resourceRules(final List<ResourcePolicyRule> resourceRules) {
        this.resourceRules = resourceRules;
        return this;
    }

    public PolicyRulesWithSubjects subjects(final List<Subject> subjects) {
        this.subjects = subjects;
        return this;
    }

    @Override
    public PolicyRulesWithSubjects validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (subjects == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "subjects", "subjects",
                "Missing 'subjects' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (nonResourceRules != null ? "\"nonResourceRules\":" + nonResourceRules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (resourceRules != null ? "\"resourceRules\":" + resourceRules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (subjects != null ? "\"subjects\":" + subjects.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
