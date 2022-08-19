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
package io.yupiik.kubernetes.bindings.v1_20_2.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_20_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_2.Validable;
import io.yupiik.kubernetes.bindings.v1_20_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HostPathVolumeSource implements Validable<HostPathVolumeSource>, Exportable {
    private String path;
    private String type;

    public HostPathVolumeSource() {
        // no-op
    }

    public HostPathVolumeSource(final String path,
                                final String type) {
        this.path = path;
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
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
                path,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HostPathVolumeSource)) {
            return false;
        }
        final HostPathVolumeSource __otherCasted = (HostPathVolumeSource) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(type, __otherCasted.type);
    }

    public HostPathVolumeSource path(final String path) {
        this.path = path;
        return this;
    }

    public HostPathVolumeSource type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public HostPathVolumeSource validate() {
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
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
