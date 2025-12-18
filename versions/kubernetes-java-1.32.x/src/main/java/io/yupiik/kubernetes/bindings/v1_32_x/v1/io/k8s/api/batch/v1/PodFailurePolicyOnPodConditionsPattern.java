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
package io.yupiik.kubernetes.bindings.v1_32_x.v1;

import io.yupiik.kubernetes.bindings.v1_32_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import io.yupiik.kubernetes.bindings.v1_32_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.batch.v1.PodFailurePolicyOnPodConditionsPattern implements Validable<io.k8s.api.batch.v1.PodFailurePolicyOnPodConditionsPattern>, Exportable {
    private String status;
    private String type;

    public io.k8s.api.batch.v1.PodFailurePolicyOnPodConditionsPattern() {
        // no-op
    }

    public io.k8s.api.batch.v1.PodFailurePolicyOnPodConditionsPattern(final String status,
                                                                      final String type) {
        this.status = status;
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                status,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.batch.v1.PodFailurePolicyOnPodConditionsPattern)) {
            return false;
        }
        final io.k8s.api.batch.v1.PodFailurePolicyOnPodConditionsPattern __otherCasted = (io.k8s.api.batch.v1.PodFailurePolicyOnPodConditionsPattern) __other;
        return Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }

    public io.k8s.api.batch.v1.PodFailurePolicyOnPodConditionsPattern status(final String status) {
        this.status = status;
        return this;
    }

    public io.k8s.api.batch.v1.PodFailurePolicyOnPodConditionsPattern type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public io.k8s.api.batch.v1.PodFailurePolicyOnPodConditionsPattern validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (status == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "status", "status",
                "Missing 'status' attribute.", true));
        }
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (status != null ? "\"status\":\"" +  JsonStrings.escapeJson(status) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
