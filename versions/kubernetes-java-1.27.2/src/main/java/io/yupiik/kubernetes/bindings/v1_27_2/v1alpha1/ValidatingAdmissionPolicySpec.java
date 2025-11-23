package io.yupiik.kubernetes.bindings.v1_27_2.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_27_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_2.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ValidatingAdmissionPolicySpec implements Validable<ValidatingAdmissionPolicySpec>, Exportable {
    private List<AuditAnnotation> auditAnnotations;
    private String failurePolicy;
    private List<MatchCondition> matchConditions;
    private MatchResources matchConstraints;
    private ParamKind paramKind;
    private List<Validation> validations;

    public ValidatingAdmissionPolicySpec() {
        // no-op
    }

    public ValidatingAdmissionPolicySpec(final List<AuditAnnotation> auditAnnotations,
                                         final String failurePolicy,
                                         final List<MatchCondition> matchConditions,
                                         final MatchResources matchConstraints,
                                         final ParamKind paramKind,
                                         final List<Validation> validations) {
        this.auditAnnotations = auditAnnotations;
        this.failurePolicy = failurePolicy;
        this.matchConditions = matchConditions;
        this.matchConstraints = matchConstraints;
        this.paramKind = paramKind;
        this.validations = validations;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                auditAnnotations,
                failurePolicy,
                matchConditions,
                matchConstraints,
                paramKind,
                validations);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ValidatingAdmissionPolicySpec)) {
            return false;
        }
        final ValidatingAdmissionPolicySpec __otherCasted = (ValidatingAdmissionPolicySpec) __other;
        return Objects.equals(auditAnnotations, __otherCasted.auditAnnotations) &&
            Objects.equals(failurePolicy, __otherCasted.failurePolicy) &&
            Objects.equals(matchConditions, __otherCasted.matchConditions) &&
            Objects.equals(matchConstraints, __otherCasted.matchConstraints) &&
            Objects.equals(paramKind, __otherCasted.paramKind) &&
            Objects.equals(validations, __otherCasted.validations);
    }

    public ValidatingAdmissionPolicySpec auditAnnotations(final List<AuditAnnotation> auditAnnotations) {
        this.auditAnnotations = auditAnnotations;
        return this;
    }

    public ValidatingAdmissionPolicySpec failurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
        return this;
    }

    public ValidatingAdmissionPolicySpec matchConditions(final List<MatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    public ValidatingAdmissionPolicySpec matchConstraints(final MatchResources matchConstraints) {
        this.matchConstraints = matchConstraints;
        return this;
    }

    public ValidatingAdmissionPolicySpec paramKind(final ParamKind paramKind) {
        this.paramKind = paramKind;
        return this;
    }

    public ValidatingAdmissionPolicySpec validations(final List<Validation> validations) {
        this.validations = validations;
        return this;
    }

    @Override
    public ValidatingAdmissionPolicySpec validate() {
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
                    (validations != null ? "\"validations\":" + validations.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
