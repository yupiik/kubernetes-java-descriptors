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
package io.yupiik.kubernetes.bindings.v1_31_x.v1beta1;

import io.yupiik.kubernetes.bindings.v1_31_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec implements Validable<io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec>, Exportable {
    private List<AuditAnnotation> auditAnnotations;
    private String failurePolicy;
    private List<MatchCondition> matchConditions;
    private MatchResources matchConstraints;
    private ParamKind paramKind;
    private List<Validation> validations;
    private List<Variable> variables;

    public io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec() {
        // no-op
    }

    public io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec(final List<AuditAnnotation> auditAnnotations,
                                                                                  final String failurePolicy,
                                                                                  final List<MatchCondition> matchConditions,
                                                                                  final MatchResources matchConstraints,
                                                                                  final ParamKind paramKind,
                                                                                  final List<Validation> validations,
                                                                                  final List<Variable> variables) {
        this.auditAnnotations = auditAnnotations;
        this.failurePolicy = failurePolicy;
        this.matchConditions = matchConditions;
        this.matchConstraints = matchConstraints;
        this.paramKind = paramKind;
        this.validations = validations;
        this.variables = variables;
    }

    public List<AuditAnnotation> getAuditAnnotations() {
        return auditAnnotations;
    }

    public void setAuditAnnotations(final List<AuditAnnotation> auditAnnotations) {
        this.auditAnnotations = auditAnnotations;
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

    public ParamKind getParamKind() {
        return paramKind;
    }

    public void setParamKind(final ParamKind paramKind) {
        this.paramKind = paramKind;
    }

    public List<Validation> getValidations() {
        return validations;
    }

    public void setValidations(final List<Validation> validations) {
        this.validations = validations;
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
                auditAnnotations,
                failurePolicy,
                matchConditions,
                matchConstraints,
                paramKind,
                validations,
                variables);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec)) {
            return false;
        }
        final io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec __otherCasted = (io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec) __other;
        return Objects.equals(auditAnnotations, __otherCasted.auditAnnotations) &&
            Objects.equals(failurePolicy, __otherCasted.failurePolicy) &&
            Objects.equals(matchConditions, __otherCasted.matchConditions) &&
            Objects.equals(matchConstraints, __otherCasted.matchConstraints) &&
            Objects.equals(paramKind, __otherCasted.paramKind) &&
            Objects.equals(validations, __otherCasted.validations) &&
            Objects.equals(variables, __otherCasted.variables);
    }

    public io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec auditAnnotations(final List<AuditAnnotation> auditAnnotations) {
        this.auditAnnotations = auditAnnotations;
        return this;
    }

    public io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec failurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
        return this;
    }

    public io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec matchConditions(final List<MatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    public io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec matchConstraints(final MatchResources matchConstraints) {
        this.matchConstraints = matchConstraints;
        return this;
    }

    public io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec paramKind(final ParamKind paramKind) {
        this.paramKind = paramKind;
        return this;
    }

    public io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec validations(final List<Validation> validations) {
        this.validations = validations;
        return this;
    }

    public io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec variables(final List<Variable> variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public io.k8s.api.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (auditAnnotations != null ? "\"auditAnnotations\":" + auditAnnotations.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (failurePolicy != null ? "\"failurePolicy\":\"" +  JsonStrings.escapeJson(failurePolicy) + "\"" : ""),
                    (matchConditions != null ? "\"matchConditions\":" + matchConditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (matchConstraints != null ? "\"matchConstraints\":" + matchConstraints.asJson() : ""),
                    (paramKind != null ? "\"paramKind\":" + paramKind.asJson() : ""),
                    (validations != null ? "\"validations\":" + validations.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (variables != null ? "\"variables\":" + variables.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
