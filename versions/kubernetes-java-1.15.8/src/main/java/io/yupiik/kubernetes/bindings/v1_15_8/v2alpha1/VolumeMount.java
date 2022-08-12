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
package io.yupiik.kubernetes.bindings.v1_15_8.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_15_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_8.Validable;
import io.yupiik.kubernetes.bindings.v1_15_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeMount implements Validable<VolumeMount>, Exportable {
    private String mountPath;
    private String mountPropagation;
    private String name;
    private Boolean readOnly;
    private String subPath;
    private String subPathExpr;

    public VolumeMount() {
        // no-op
    }

    public VolumeMount(final String mountPath,
                       final String mountPropagation,
                       final String name,
                       final Boolean readOnly,
                       final String subPath,
                       final String subPathExpr) {
        // no-op
    }

    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(final String mountPath) {
        this.mountPath = mountPath;
    }

    public String getMountPropagation() {
        return mountPropagation;
    }

    public void setMountPropagation(final String mountPropagation) {
        this.mountPropagation = mountPropagation;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getSubPath() {
        return subPath;
    }

    public void setSubPath(final String subPath) {
        this.subPath = subPath;
    }

    public String getSubPathExpr() {
        return subPathExpr;
    }

    public void setSubPathExpr(final String subPathExpr) {
        this.subPathExpr = subPathExpr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                mountPath,
                mountPropagation,
                name,
                readOnly,
                subPath,
                subPathExpr);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeMount)) {
            return false;
        }
        final VolumeMount __otherCasted = (VolumeMount) __other;
        return Objects.equals(mountPath, __otherCasted.mountPath) &&
            Objects.equals(mountPropagation, __otherCasted.mountPropagation) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(subPath, __otherCasted.subPath) &&
            Objects.equals(subPathExpr, __otherCasted.subPathExpr);
    }

    public VolumeMount mountPath(final String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    public VolumeMount mountPropagation(final String mountPropagation) {
        this.mountPropagation = mountPropagation;
        return this;
    }

    public VolumeMount name(final String name) {
        this.name = name;
        return this;
    }

    public VolumeMount readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public VolumeMount subPath(final String subPath) {
        this.subPath = subPath;
        return this;
    }

    public VolumeMount subPathExpr(final String subPathExpr) {
        this.subPathExpr = subPathExpr;
        return this;
    }

    @Override
    public VolumeMount validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (mountPath == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "mountPath", "mountPath",
                "Missing 'mountPath' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (mountPath != null ? "\"mountPath\":\"" +  JsonStrings.escapeJson(mountPath) + "\"" : ""),
                    (mountPropagation != null ? "\"mountPropagation\":\"" +  JsonStrings.escapeJson(mountPropagation) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (subPath != null ? "\"subPath\":\"" +  JsonStrings.escapeJson(subPath) + "\"" : ""),
                    (subPathExpr != null ? "\"subPathExpr\":\"" +  JsonStrings.escapeJson(subPathExpr) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
