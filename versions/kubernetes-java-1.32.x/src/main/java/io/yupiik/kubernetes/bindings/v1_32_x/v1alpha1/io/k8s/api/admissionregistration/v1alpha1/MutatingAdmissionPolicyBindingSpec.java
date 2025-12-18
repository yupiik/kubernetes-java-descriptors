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
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicyBindingSpec implements Validable<io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicyBindingSpec>, Exportable {
    private MatchResources matchResources;
    private ParamRef paramRef;
    private String policyName;

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicyBindingSpec() {
        // no-op
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicyBindingSpec(final MatchResources matchResources,
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
        if (!(__other instanceof io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicyBindingSpec)) {
            return false;
        }
        final io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicyBindingSpec __otherCasted = (io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicyBindingSpec) __other;
        return Objects.equals(matchResources, __otherCasted.matchResources) &&
            Objects.equals(paramRef, __otherCasted.paramRef) &&
            Objects.equals(policyName, __otherCasted.policyName);
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicyBindingSpec matchResources(final MatchResources matchResources) {
        this.matchResources = matchResources;
        return this;
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicyBindingSpec paramRef(final ParamRef paramRef) {
        this.paramRef = paramRef;
        return this;
    }

    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicyBindingSpec policyName(final String policyName) {
        this.policyName = policyName;
        return this;
    }

    @Override
    public io.k8s.api.admissionregistration.v1alpha1.MutatingAdmissionPolicyBindingSpec validate() {
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
