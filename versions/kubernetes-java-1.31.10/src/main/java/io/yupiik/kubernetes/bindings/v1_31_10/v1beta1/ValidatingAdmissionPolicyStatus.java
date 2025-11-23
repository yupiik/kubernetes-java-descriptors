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
package io.yupiik.kubernetes.bindings.v1_31_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_31_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_10.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ValidatingAdmissionPolicyStatus implements Validable<ValidatingAdmissionPolicyStatus>, Exportable {
    private List<Condition> conditions;
    private Integer observedGeneration;
    private TypeChecking typeChecking;

    public ValidatingAdmissionPolicyStatus() {
        // no-op
    }

    public ValidatingAdmissionPolicyStatus(final List<Condition> conditions,
                                           final Integer observedGeneration,
                                           final TypeChecking typeChecking) {
        this.conditions = conditions;
        this.observedGeneration = observedGeneration;
        this.typeChecking = typeChecking;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<Condition> conditions) {
        this.conditions = conditions;
    }

    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    public TypeChecking getTypeChecking() {
        return typeChecking;
    }

    public void setTypeChecking(final TypeChecking typeChecking) {
        this.typeChecking = typeChecking;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions,
                observedGeneration,
                typeChecking);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ValidatingAdmissionPolicyStatus)) {
            return false;
        }
        final ValidatingAdmissionPolicyStatus __otherCasted = (ValidatingAdmissionPolicyStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(typeChecking, __otherCasted.typeChecking);
    }

    public ValidatingAdmissionPolicyStatus conditions(final List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ValidatingAdmissionPolicyStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public ValidatingAdmissionPolicyStatus typeChecking(final TypeChecking typeChecking) {
        this.typeChecking = typeChecking;
        return this;
    }

    @Override
    public ValidatingAdmissionPolicyStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (observedGeneration != null ? "\"observedGeneration\":" + observedGeneration : ""),
                    (typeChecking != null ? "\"typeChecking\":" + typeChecking.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
