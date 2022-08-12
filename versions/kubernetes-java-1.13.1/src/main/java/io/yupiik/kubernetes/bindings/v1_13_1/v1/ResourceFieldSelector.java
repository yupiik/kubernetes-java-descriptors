/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_13_1.v1;

import io.yupiik.kubernetes.bindings.v1_13_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_13_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_13_1.Validable;
import io.yupiik.kubernetes.bindings.v1_13_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceFieldSelector implements Validable<ResourceFieldSelector>, Exportable {
    private String containerName;
    private String divisor;
    private String resource;

    public ResourceFieldSelector() {
        // no-op
    }

    public ResourceFieldSelector(final String containerName,
                                 final String divisor,
                                 final String resource) {
        // no-op
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
        if (!(__other instanceof ResourceFieldSelector)) {
            return false;
        }
        final ResourceFieldSelector __otherCasted = (ResourceFieldSelector) __other;
        return Objects.equals(containerName, __otherCasted.containerName) &&
            Objects.equals(divisor, __otherCasted.divisor) &&
            Objects.equals(resource, __otherCasted.resource);
    }

    public ResourceFieldSelector containerName(final String containerName) {
        this.containerName = containerName;
        return this;
    }

    public ResourceFieldSelector divisor(final String divisor) {
        this.divisor = divisor;
        return this;
    }

    public ResourceFieldSelector resource(final String resource) {
        this.resource = resource;
        return this;
    }

    @Override
    public ResourceFieldSelector validate() {
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
