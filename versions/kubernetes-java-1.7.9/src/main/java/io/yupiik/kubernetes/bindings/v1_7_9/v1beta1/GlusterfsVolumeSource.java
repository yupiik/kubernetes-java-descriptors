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
package io.yupiik.kubernetes.bindings.v1_7_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_9.Validable;
import io.yupiik.kubernetes.bindings.v1_7_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class GlusterfsVolumeSource implements Validable<GlusterfsVolumeSource>, Exportable {
    private String endpoints;
    private String path;
    private Boolean readOnly;

    public GlusterfsVolumeSource() {
        // no-op
    }

    public GlusterfsVolumeSource(final String endpoints,
                                 final String path,
                                 final Boolean readOnly) {
        // no-op
    }

    public String getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(final String endpoints) {
        this.endpoints = endpoints;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                endpoints,
                path,
                readOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof GlusterfsVolumeSource)) {
            return false;
        }
        final GlusterfsVolumeSource __otherCasted = (GlusterfsVolumeSource) __other;
        return Objects.equals(endpoints, __otherCasted.endpoints) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }

    public GlusterfsVolumeSource endpoints(final String endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public GlusterfsVolumeSource path(final String path) {
        this.path = path;
        return this;
    }

    public GlusterfsVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    @Override
    public GlusterfsVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (endpoints == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "endpoints", "endpoints",
                "Missing 'endpoints' attribute.", true));
        }
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
                    (endpoints != null ? "\"endpoints\":\"" +  JsonStrings.escapeJson(endpoints) + "\"" : ""),
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
