package io.yupiik.kubernetes.bindings.v1_26_14.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_26_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_14.Validable;
import io.yupiik.kubernetes.bindings.v1_26_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ValidatingAdmissionPolicySpec implements Validable<ValidatingAdmissionPolicySpec>, Exportable {
    private String failurePolicy;
    private MatchResources matchConstraints;
    private ParamKind paramKind;
    private List<Validation> validations;

    public ValidatingAdmissionPolicySpec() {
        // no-op
    }

    public ValidatingAdmissionPolicySpec(final String failurePolicy,
                                         final MatchResources matchConstraints,
                                         final ParamKind paramKind,
                                         final List<Validation> validations) {
        this.failurePolicy = failurePolicy;
        this.matchConstraints = matchConstraints;
        this.paramKind = paramKind;
        this.validations = validations;
    }

    public String getFailurePolicy() {
        return failurePolicy;
    }

    public void setFailurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
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
                failurePolicy,
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
        return Objects.equals(failurePolicy, __otherCasted.failurePolicy) &&
            Objects.equals(matchConstraints, __otherCasted.matchConstraints) &&
            Objects.equals(paramKind, __otherCasted.paramKind) &&
            Objects.equals(validations, __otherCasted.validations);
    }

    public ValidatingAdmissionPolicySpec failurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
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
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (validations == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "validations", "validations",
                "Missing 'validations' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (failurePolicy != null ? "\"failurePolicy\":\"" +  JsonStrings.escapeJson(failurePolicy) + "\"" : ""),
                    (matchConstraints != null ? "\"matchConstraints\":" + matchConstraints.asJson() : ""),
                    (paramKind != null ? "\"paramKind\":" + paramKind.asJson() : ""),
                    (validations != null ? "\"validations\":" + validations.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
