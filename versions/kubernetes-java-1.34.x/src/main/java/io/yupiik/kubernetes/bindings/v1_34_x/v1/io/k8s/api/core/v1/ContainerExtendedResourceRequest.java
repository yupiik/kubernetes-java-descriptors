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

public class io.k8s.api.core.v1.ContainerExtendedResourceRequest implements Validable<io.k8s.api.core.v1.ContainerExtendedResourceRequest>, Exportable {
    private String containerName;
    private String requestName;
    private String resourceName;

    public io.k8s.api.core.v1.ContainerExtendedResourceRequest() {
        // no-op
    }

    public io.k8s.api.core.v1.ContainerExtendedResourceRequest(final String containerName,
                                                               final String requestName,
                                                               final String resourceName) {
        this.containerName = containerName;
        this.requestName = requestName;
        this.resourceName = resourceName;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(final String containerName) {
        this.containerName = containerName;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(final String requestName) {
        this.requestName = requestName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(final String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                containerName,
                requestName,
                resourceName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.ContainerExtendedResourceRequest)) {
            return false;
        }
        final io.k8s.api.core.v1.ContainerExtendedResourceRequest __otherCasted = (io.k8s.api.core.v1.ContainerExtendedResourceRequest) __other;
        return Objects.equals(containerName, __otherCasted.containerName) &&
            Objects.equals(requestName, __otherCasted.requestName) &&
            Objects.equals(resourceName, __otherCasted.resourceName);
    }

    public io.k8s.api.core.v1.ContainerExtendedResourceRequest containerName(final String containerName) {
        this.containerName = containerName;
        return this;
    }

    public io.k8s.api.core.v1.ContainerExtendedResourceRequest requestName(final String requestName) {
        this.requestName = requestName;
        return this;
    }

    public io.k8s.api.core.v1.ContainerExtendedResourceRequest resourceName(final String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.ContainerExtendedResourceRequest validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (containerName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "containerName", "containerName",
                "Missing 'containerName' attribute.", true));
        }
        if (requestName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "requestName", "requestName",
                "Missing 'requestName' attribute.", true));
        }
        if (resourceName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resourceName", "resourceName",
                "Missing 'resourceName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (containerName != null ? "\"containerName\":\"" +  JsonStrings.escapeJson(containerName) + "\"" : ""),
                    (requestName != null ? "\"requestName\":\"" +  JsonStrings.escapeJson(requestName) + "\"" : ""),
                    (resourceName != null ? "\"resourceName\":\"" +  JsonStrings.escapeJson(resourceName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
