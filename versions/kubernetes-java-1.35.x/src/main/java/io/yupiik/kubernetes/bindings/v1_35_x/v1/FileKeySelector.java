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
package io.yupiik.kubernetes.bindings.v1_35_x.v1;

import io.yupiik.kubernetes.bindings.v1_35_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_35_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_35_x.Validable;
import io.yupiik.kubernetes.bindings.v1_35_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class FileKeySelector implements Validable<FileKeySelector>, Exportable {
    private String key;
    private Boolean optional;
    private String path;
    private String volumeName;

    public FileKeySelector() {
        // no-op
    }

    public FileKeySelector(final String key,
                           final Boolean optional,
                           final String path,
                           final String volumeName) {
        this.key = key;
        this.optional = optional;
        this.path = path;
        this.volumeName = volumeName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(final String volumeName) {
        this.volumeName = volumeName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                optional,
                path,
                volumeName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FileKeySelector)) {
            return false;
        }
        final FileKeySelector __otherCasted = (FileKeySelector) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(optional, __otherCasted.optional) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(volumeName, __otherCasted.volumeName);
    }

    public FileKeySelector key(final String key) {
        this.key = key;
        return this;
    }

    public FileKeySelector optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    public FileKeySelector path(final String path) {
        this.path = path;
        return this;
    }

    public FileKeySelector volumeName(final String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    @Override
    public FileKeySelector validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (key == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "key", "key",
                "Missing 'key' attribute.", true));
        }
        if (path == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "path", "path",
                "Missing 'path' attribute.", true));
        }
        if (volumeName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "volumeName", "volumeName",
                "Missing 'volumeName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (key != null ? "\"key\":\"" +  JsonStrings.escapeJson(key) + "\"" : ""),
                    (optional != null ? "\"optional\":" + optional : ""),
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""),
                    (volumeName != null ? "\"volumeName\":\"" +  JsonStrings.escapeJson(volumeName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }

    @Override
    public String toString() {
        return asJson();
    }
}
