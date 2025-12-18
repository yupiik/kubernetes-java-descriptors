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
package io.yupiik.kubernetes.bindings.v1_30_x.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_x.Validable;
import io.yupiik.kubernetes.bindings.v1_30_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.resource.v1alpha2.ResourceClaimSpec implements Validable<io.k8s.api.resource.v1alpha2.ResourceClaimSpec>, Exportable {
    private String allocationMode;
    private ResourceClaimParametersReference parametersRef;
    private String resourceClassName;

    public io.k8s.api.resource.v1alpha2.ResourceClaimSpec() {
        // no-op
    }

    public io.k8s.api.resource.v1alpha2.ResourceClaimSpec(final String allocationMode,
                                                          final ResourceClaimParametersReference parametersRef,
                                                          final String resourceClassName) {
        this.allocationMode = allocationMode;
        this.parametersRef = parametersRef;
        this.resourceClassName = resourceClassName;
    }

    public String getAllocationMode() {
        return allocationMode;
    }

    public void setAllocationMode(final String allocationMode) {
        this.allocationMode = allocationMode;
    }

    public ResourceClaimParametersReference getParametersRef() {
        return parametersRef;
    }

    public void setParametersRef(final ResourceClaimParametersReference parametersRef) {
        this.parametersRef = parametersRef;
    }

    public String getResourceClassName() {
        return resourceClassName;
    }

    public void setResourceClassName(final String resourceClassName) {
        this.resourceClassName = resourceClassName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allocationMode,
                parametersRef,
                resourceClassName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.resource.v1alpha2.ResourceClaimSpec)) {
            return false;
        }
        final io.k8s.api.resource.v1alpha2.ResourceClaimSpec __otherCasted = (io.k8s.api.resource.v1alpha2.ResourceClaimSpec) __other;
        return Objects.equals(allocationMode, __otherCasted.allocationMode) &&
            Objects.equals(parametersRef, __otherCasted.parametersRef) &&
            Objects.equals(resourceClassName, __otherCasted.resourceClassName);
    }

    public io.k8s.api.resource.v1alpha2.ResourceClaimSpec allocationMode(final String allocationMode) {
        this.allocationMode = allocationMode;
        return this;
    }

    public io.k8s.api.resource.v1alpha2.ResourceClaimSpec parametersRef(final ResourceClaimParametersReference parametersRef) {
        this.parametersRef = parametersRef;
        return this;
    }

    public io.k8s.api.resource.v1alpha2.ResourceClaimSpec resourceClassName(final String resourceClassName) {
        this.resourceClassName = resourceClassName;
        return this;
    }

    @Override
    public io.k8s.api.resource.v1alpha2.ResourceClaimSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (resourceClassName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resourceClassName", "resourceClassName",
                "Missing 'resourceClassName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (allocationMode != null ? "\"allocationMode\":\"" +  JsonStrings.escapeJson(allocationMode) + "\"" : ""),
                    (parametersRef != null ? "\"parametersRef\":" + parametersRef.asJson() : ""),
                    (resourceClassName != null ? "\"resourceClassName\":\"" +  JsonStrings.escapeJson(resourceClassName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
