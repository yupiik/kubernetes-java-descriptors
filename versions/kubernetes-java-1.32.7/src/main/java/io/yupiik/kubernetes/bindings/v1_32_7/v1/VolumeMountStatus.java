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
package io.yupiik.kubernetes.bindings.v1_32_7.v1;

import io.yupiik.kubernetes.bindings.v1_32_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_7.Validable;
import io.yupiik.kubernetes.bindings.v1_32_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeMountStatus implements Validable<VolumeMountStatus>, Exportable {
    private String mountPath;
    private String name;
    private Boolean readOnly;
    private String recursiveReadOnly;

    public VolumeMountStatus() {
        // no-op
    }

    public VolumeMountStatus(final String mountPath,
                             final String name,
                             final Boolean readOnly,
                             final String recursiveReadOnly) {
        this.mountPath = mountPath;
        this.name = name;
        this.readOnly = readOnly;
        this.recursiveReadOnly = recursiveReadOnly;
    }

    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(final String mountPath) {
        this.mountPath = mountPath;
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

    public String getRecursiveReadOnly() {
        return recursiveReadOnly;
    }

    public void setRecursiveReadOnly(final String recursiveReadOnly) {
        this.recursiveReadOnly = recursiveReadOnly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                mountPath,
                name,
                readOnly,
                recursiveReadOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeMountStatus)) {
            return false;
        }
        final VolumeMountStatus __otherCasted = (VolumeMountStatus) __other;
        return Objects.equals(mountPath, __otherCasted.mountPath) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(recursiveReadOnly, __otherCasted.recursiveReadOnly);
    }

    public VolumeMountStatus mountPath(final String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    public VolumeMountStatus name(final String name) {
        this.name = name;
        return this;
    }

    public VolumeMountStatus readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public VolumeMountStatus recursiveReadOnly(final String recursiveReadOnly) {
        this.recursiveReadOnly = recursiveReadOnly;
        return this;
    }

    @Override
    public VolumeMountStatus validate() {
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
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (recursiveReadOnly != null ? "\"recursiveReadOnly\":\"" +  JsonStrings.escapeJson(recursiveReadOnly) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
