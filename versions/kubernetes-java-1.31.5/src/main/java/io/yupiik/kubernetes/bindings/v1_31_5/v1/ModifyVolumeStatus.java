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
package io.yupiik.kubernetes.bindings.v1_31_5.v1;

import io.yupiik.kubernetes.bindings.v1_31_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_5.Validable;
import io.yupiik.kubernetes.bindings.v1_31_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ModifyVolumeStatus implements Validable<ModifyVolumeStatus>, Exportable {
    private String status;
    private String targetVolumeAttributesClassName;

    public ModifyVolumeStatus() {
        // no-op
    }

    public ModifyVolumeStatus(final String status,
                              final String targetVolumeAttributesClassName) {
        this.status = status;
        this.targetVolumeAttributesClassName = targetVolumeAttributesClassName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getTargetVolumeAttributesClassName() {
        return targetVolumeAttributesClassName;
    }

    public void setTargetVolumeAttributesClassName(final String targetVolumeAttributesClassName) {
        this.targetVolumeAttributesClassName = targetVolumeAttributesClassName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                status,
                targetVolumeAttributesClassName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ModifyVolumeStatus)) {
            return false;
        }
        final ModifyVolumeStatus __otherCasted = (ModifyVolumeStatus) __other;
        return Objects.equals(status, __otherCasted.status) &&
            Objects.equals(targetVolumeAttributesClassName, __otherCasted.targetVolumeAttributesClassName);
    }

    public ModifyVolumeStatus status(final String status) {
        this.status = status;
        return this;
    }

    public ModifyVolumeStatus targetVolumeAttributesClassName(final String targetVolumeAttributesClassName) {
        this.targetVolumeAttributesClassName = targetVolumeAttributesClassName;
        return this;
    }

    @Override
    public ModifyVolumeStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (status == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "status", "status",
                "Missing 'status' attribute.", true));
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
                    (targetVolumeAttributesClassName != null ? "\"targetVolumeAttributesClassName\":\"" +  JsonStrings.escapeJson(targetVolumeAttributesClassName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
