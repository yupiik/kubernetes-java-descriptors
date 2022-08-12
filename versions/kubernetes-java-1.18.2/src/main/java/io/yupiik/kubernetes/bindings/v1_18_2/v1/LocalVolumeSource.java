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
package io.yupiik.kubernetes.bindings.v1_18_2.v1;

import io.yupiik.kubernetes.bindings.v1_18_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_2.Validable;
import io.yupiik.kubernetes.bindings.v1_18_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LocalVolumeSource implements Validable<LocalVolumeSource>, Exportable {
    private String fsType;
    private String path;

    public LocalVolumeSource() {
        // no-op
    }

    public LocalVolumeSource(final String fsType,
                             final String path) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                path);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LocalVolumeSource)) {
            return false;
        }
        final LocalVolumeSource __otherCasted = (LocalVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(path, __otherCasted.path);
    }

    public LocalVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public LocalVolumeSource path(final String path) {
        this.path = path;
        return this;
    }

    @Override
    public LocalVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (path == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "path", "path",
                "Missing 'path' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
