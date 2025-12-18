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
package io.yupiik.kubernetes.bindings.v1_33_x.v1;

import io.yupiik.kubernetes.bindings.v1_33_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionStatus implements Validable<io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionStatus>, Exportable {
    private CustomResourceDefinitionNames acceptedNames;
    private List<CustomResourceDefinitionCondition> conditions;
    private List<String> storedVersions;

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionStatus() {
        // no-op
    }

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionStatus(final CustomResourceDefinitionNames acceptedNames,
                                                                                                   final List<CustomResourceDefinitionCondition> conditions,
                                                                                                   final List<String> storedVersions) {
        this.acceptedNames = acceptedNames;
        this.conditions = conditions;
        this.storedVersions = storedVersions;
    }

    public CustomResourceDefinitionNames getAcceptedNames() {
        return acceptedNames;
    }

    public void setAcceptedNames(final CustomResourceDefinitionNames acceptedNames) {
        this.acceptedNames = acceptedNames;
    }

    public List<CustomResourceDefinitionCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<CustomResourceDefinitionCondition> conditions) {
        this.conditions = conditions;
    }

    public List<String> getStoredVersions() {
        return storedVersions;
    }

    public void setStoredVersions(final List<String> storedVersions) {
        this.storedVersions = storedVersions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                acceptedNames,
                conditions,
                storedVersions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionStatus)) {
            return false;
        }
        final io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionStatus __otherCasted = (io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionStatus) __other;
        return Objects.equals(acceptedNames, __otherCasted.acceptedNames) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(storedVersions, __otherCasted.storedVersions);
    }

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionStatus acceptedNames(final CustomResourceDefinitionNames acceptedNames) {
        this.acceptedNames = acceptedNames;
        return this;
    }

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionStatus conditions(final List<CustomResourceDefinitionCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionStatus storedVersions(final List<String> storedVersions) {
        this.storedVersions = storedVersions;
        return this;
    }

    @Override
    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (acceptedNames != null ? "\"acceptedNames\":" + acceptedNames.asJson() : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (storedVersions != null ? "\"storedVersions\":" + storedVersions.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
