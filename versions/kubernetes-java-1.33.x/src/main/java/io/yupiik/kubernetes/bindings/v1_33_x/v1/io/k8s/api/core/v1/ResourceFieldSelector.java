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
import io.yupiik.kubernetes.bindings.v1_33_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.ResourceFieldSelector implements Validable<io.k8s.api.core.v1.ResourceFieldSelector>, Exportable {
    private String containerName;
    private String divisor;
    private String resource;

    public io.k8s.api.core.v1.ResourceFieldSelector() {
        // no-op
    }

    public io.k8s.api.core.v1.ResourceFieldSelector(final String containerName,
                                                    final String divisor,
                                                    final String resource) {
        this.containerName = containerName;
        this.divisor = divisor;
        this.resource = resource;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(final String containerName) {
        this.containerName = containerName;
    }

    public String getDivisor() {
        return divisor;
    }

    public void setDivisor(final String divisor) {
        this.divisor = divisor;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(final String resource) {
        this.resource = resource;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                containerName,
                divisor,
                resource);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.ResourceFieldSelector)) {
            return false;
        }
        final io.k8s.api.core.v1.ResourceFieldSelector __otherCasted = (io.k8s.api.core.v1.ResourceFieldSelector) __other;
        return Objects.equals(containerName, __otherCasted.containerName) &&
            Objects.equals(divisor, __otherCasted.divisor) &&
            Objects.equals(resource, __otherCasted.resource);
    }

    public io.k8s.api.core.v1.ResourceFieldSelector containerName(final String containerName) {
        this.containerName = containerName;
        return this;
    }

    public io.k8s.api.core.v1.ResourceFieldSelector divisor(final String divisor) {
        this.divisor = divisor;
        return this;
    }

    public io.k8s.api.core.v1.ResourceFieldSelector resource(final String resource) {
        this.resource = resource;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.ResourceFieldSelector validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (resource == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resource", "resource",
                "Missing 'resource' attribute.", true));
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
                    (divisor != null ? "\"divisor\":\"" +  JsonStrings.escapeJson(divisor) + "\"" : ""),
                    (resource != null ? "\"resource\":\"" +  JsonStrings.escapeJson(resource) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
