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
package io.yupiik.kubernetes.bindings.v1_32_x.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_32_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec implements Validable<io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec>, Exportable {
    private String failurePolicy;
    private List<MatchCondition> matchConditions;
    private MatchResources matchConstraints;
    private List<Mutation> mutations;
    private ParamKind paramKind;
    private String reinvocationPolicy;
    private List<Variable> variables;

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec() {
        // no-op
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec(final String failurePolicy,
                                                                                 final List<MatchCondition> matchConditions,
                                                                                 final MatchResources matchConstraints,
                                                                                 final List<Mutation> mutations,
                                                                                 final ParamKind paramKind,
                                                                                 final String reinvocationPolicy,
                                                                                 final List<Variable> variables) {
        this.failurePolicy = failurePolicy;
        this.matchConditions = matchConditions;
        this.matchConstraints = matchConstraints;
        this.mutations = mutations;
        this.paramKind = paramKind;
        this.reinvocationPolicy = reinvocationPolicy;
        this.variables = variables;
    }

    public String getFailurePolicy() {
        return failurePolicy;
    }

    public void setFailurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
    }

    public List<MatchCondition> getMatchConditions() {
        return matchConditions;
    }

    public void setMatchConditions(final List<MatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
    }

    public MatchResources getMatchConstraints() {
        return matchConstraints;
    }

    public void setMatchConstraints(final MatchResources matchConstraints) {
        this.matchConstraints = matchConstraints;
    }

    public List<Mutation> getMutations() {
        return mutations;
    }

    public void setMutations(final List<Mutation> mutations) {
        this.mutations = mutations;
    }

    public ParamKind getParamKind() {
        return paramKind;
    }

    public void setParamKind(final ParamKind paramKind) {
        this.paramKind = paramKind;
    }

    public String getReinvocationPolicy() {
        return reinvocationPolicy;
    }

    public void setReinvocationPolicy(final String reinvocationPolicy) {
        this.reinvocationPolicy = reinvocationPolicy;
    }

    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariables(final List<Variable> variables) {
        this.variables = variables;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                failurePolicy,
                matchConditions,
                matchConstraints,
                mutations,
                paramKind,
                reinvocationPolicy,
                variables);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec)) {
            return false;
        }
        final io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec __otherCasted = (io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec) __other;
        return Objects.equals(failurePolicy, __otherCasted.failurePolicy) &&
            Objects.equals(matchConditions, __otherCasted.matchConditions) &&
            Objects.equals(matchConstraints, __otherCasted.matchConstraints) &&
            Objects.equals(mutations, __otherCasted.mutations) &&
            Objects.equals(paramKind, __otherCasted.paramKind) &&
            Objects.equals(reinvocationPolicy, __otherCasted.reinvocationPolicy) &&
            Objects.equals(variables, __otherCasted.variables);
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec failurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
        return this;
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec matchConditions(final List<MatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec matchConstraints(final MatchResources matchConstraints) {
        this.matchConstraints = matchConstraints;
        return this;
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec mutations(final List<Mutation> mutations) {
        this.mutations = mutations;
        return this;
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec paramKind(final ParamKind paramKind) {
        this.paramKind = paramKind;
        return this;
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec reinvocationPolicy(final String reinvocationPolicy) {
        this.reinvocationPolicy = reinvocationPolicy;
        return this;
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec variables(final List<Variable> variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicySpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (failurePolicy != null ? "\"failurePolicy\":\"" +  JsonStrings.escapeJson(failurePolicy) + "\"" : ""),
                    (matchConditions != null ? "\"matchConditions\":" + matchConditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (matchConstraints != null ? "\"matchConstraints\":" + matchConstraints.asJson() : ""),
                    (mutations != null ? "\"mutations\":" + mutations.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (paramKind != null ? "\"paramKind\":" + paramKind.asJson() : ""),
                    (reinvocationPolicy != null ? "\"reinvocationPolicy\":\"" +  JsonStrings.escapeJson(reinvocationPolicy) + "\"" : ""),
                    (variables != null ? "\"variables\":" + variables.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
