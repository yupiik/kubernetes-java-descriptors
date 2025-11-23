package io.yupiik.kubernetes.bindings.v1_26_4.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_26_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_4.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ValidatingAdmissionPolicyBindingSpec implements Validable<ValidatingAdmissionPolicyBindingSpec>, Exportable {
    private MatchResources matchResources;
    private ParamRef paramRef;
    private String policyName;

    public ValidatingAdmissionPolicyBindingSpec() {
        // no-op
    }

    public ValidatingAdmissionPolicyBindingSpec(final MatchResources matchResources,
                                                final ParamRef paramRef,
                                                final String policyName) {
        this.matchResources = matchResources;
        this.paramRef = paramRef;
        this.policyName = policyName;
    }

    public MatchResources getMatchResources() {
        return matchResources;
    }

    public void setMatchResources(final MatchResources matchResources) {
        this.matchResources = matchResources;
    }

    public ParamRef getParamRef() {
        return paramRef;
    }

    public void setParamRef(final ParamRef paramRef) {
        this.paramRef = paramRef;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(final String policyName) {
        this.policyName = policyName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchResources,
                paramRef,
                policyName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ValidatingAdmissionPolicyBindingSpec)) {
            return false;
        }
        final ValidatingAdmissionPolicyBindingSpec __otherCasted = (ValidatingAdmissionPolicyBindingSpec) __other;
        return Objects.equals(matchResources, __otherCasted.matchResources) &&
            Objects.equals(paramRef, __otherCasted.paramRef) &&
            Objects.equals(policyName, __otherCasted.policyName);
    }

    public ValidatingAdmissionPolicyBindingSpec matchResources(final MatchResources matchResources) {
        this.matchResources = matchResources;
        return this;
    }

    public ValidatingAdmissionPolicyBindingSpec paramRef(final ParamRef paramRef) {
        this.paramRef = paramRef;
        return this;
    }

    public ValidatingAdmissionPolicyBindingSpec policyName(final String policyName) {
        this.policyName = policyName;
        return this;
    }

    @Override
    public ValidatingAdmissionPolicyBindingSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (matchResources != null ? "\"matchResources\":" + matchResources.asJson() : ""),
                    (paramRef != null ? "\"paramRef\":" + paramRef.asJson() : ""),
                    (policyName != null ? "\"policyName\":\"" +  JsonStrings.escapeJson(policyName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
