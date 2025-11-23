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
package io.yupiik.kubernetes.bindings.v1_27_7.v1;

import io.yupiik.kubernetes.bindings.v1_27_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_7.Validable;
import io.yupiik.kubernetes.bindings.v1_27_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerResizePolicy implements Validable<ContainerResizePolicy>, Exportable {
    private String resourceName;
    private String restartPolicy;

    public ContainerResizePolicy() {
        // no-op
    }

    public ContainerResizePolicy(final String resourceName,
                                 final String restartPolicy) {
        this.resourceName = resourceName;
        this.restartPolicy = restartPolicy;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(final String resourceName) {
        this.resourceName = resourceName;
    }

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(final String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resourceName,
                restartPolicy);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerResizePolicy)) {
            return false;
        }
        final ContainerResizePolicy __otherCasted = (ContainerResizePolicy) __other;
        return Objects.equals(resourceName, __otherCasted.resourceName) &&
            Objects.equals(restartPolicy, __otherCasted.restartPolicy);
    }

    public ContainerResizePolicy resourceName(final String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    public ContainerResizePolicy restartPolicy(final String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    @Override
    public ContainerResizePolicy validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (resourceName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resourceName", "resourceName",
                "Missing 'resourceName' attribute.", true));
        }
        if (restartPolicy == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "restartPolicy", "restartPolicy",
                "Missing 'restartPolicy' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (resourceName != null ? "\"resourceName\":\"" +  JsonStrings.escapeJson(resourceName) + "\"" : ""),
                    (restartPolicy != null ? "\"restartPolicy\":\"" +  JsonStrings.escapeJson(restartPolicy) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
