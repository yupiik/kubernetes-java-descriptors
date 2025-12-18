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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import io.yupiik.kubernetes.bindings.v1_34_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.PodExtendedResourceClaimStatus implements Validable<io.k8s.api.core.v1.PodExtendedResourceClaimStatus>, Exportable {
    private List<ContainerExtendedResourceRequest> requestMappings;
    private String resourceClaimName;

    public io.k8s.api.core.v1.PodExtendedResourceClaimStatus() {
        // no-op
    }

    public io.k8s.api.core.v1.PodExtendedResourceClaimStatus(final List<ContainerExtendedResourceRequest> requestMappings,
                                                             final String resourceClaimName) {
        this.requestMappings = requestMappings;
        this.resourceClaimName = resourceClaimName;
    }

    public List<ContainerExtendedResourceRequest> getRequestMappings() {
        return requestMappings;
    }

    public void setRequestMappings(final List<ContainerExtendedResourceRequest> requestMappings) {
        this.requestMappings = requestMappings;
    }

    public String getResourceClaimName() {
        return resourceClaimName;
    }

    public void setResourceClaimName(final String resourceClaimName) {
        this.resourceClaimName = resourceClaimName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                requestMappings,
                resourceClaimName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.PodExtendedResourceClaimStatus)) {
            return false;
        }
        final io.k8s.api.core.v1.PodExtendedResourceClaimStatus __otherCasted = (io.k8s.api.core.v1.PodExtendedResourceClaimStatus) __other;
        return Objects.equals(requestMappings, __otherCasted.requestMappings) &&
            Objects.equals(resourceClaimName, __otherCasted.resourceClaimName);
    }

    public io.k8s.api.core.v1.PodExtendedResourceClaimStatus requestMappings(final List<ContainerExtendedResourceRequest> requestMappings) {
        this.requestMappings = requestMappings;
        return this;
    }

    public io.k8s.api.core.v1.PodExtendedResourceClaimStatus resourceClaimName(final String resourceClaimName) {
        this.resourceClaimName = resourceClaimName;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.PodExtendedResourceClaimStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (requestMappings == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "requestMappings", "requestMappings",
                "Missing 'requestMappings' attribute.", true));
        }
        if (resourceClaimName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resourceClaimName", "resourceClaimName",
                "Missing 'resourceClaimName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (requestMappings != null ? "\"requestMappings\":" + requestMappings.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (resourceClaimName != null ? "\"resourceClaimName\":\"" +  JsonStrings.escapeJson(resourceClaimName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
