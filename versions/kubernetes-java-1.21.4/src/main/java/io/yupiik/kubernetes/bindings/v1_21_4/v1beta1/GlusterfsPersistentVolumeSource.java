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
package io.yupiik.kubernetes.bindings.v1_21_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_4.Validable;
import io.yupiik.kubernetes.bindings.v1_21_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class GlusterfsPersistentVolumeSource implements Validable<GlusterfsPersistentVolumeSource>, Exportable {
    private String endpoints;
    private String endpointsNamespace;
    private String path;
    private Boolean readOnly;

    public GlusterfsPersistentVolumeSource() {
        // no-op
    }

    public GlusterfsPersistentVolumeSource(final String endpoints,
                                           final String endpointsNamespace,
                                           final String path,
                                           final Boolean readOnly) {
        this.endpoints = endpoints;
        this.endpointsNamespace = endpointsNamespace;
        this.path = path;
        this.readOnly = readOnly;
    }

    public String getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(final String endpoints) {
        this.endpoints = endpoints;
    }

    public String getEndpointsNamespace() {
        return endpointsNamespace;
    }

    public void setEndpointsNamespace(final String endpointsNamespace) {
        this.endpointsNamespace = endpointsNamespace;
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
                endpointsNamespace,
                path,
                readOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof GlusterfsPersistentVolumeSource)) {
            return false;
        }
        final GlusterfsPersistentVolumeSource __otherCasted = (GlusterfsPersistentVolumeSource) __other;
        return Objects.equals(endpoints, __otherCasted.endpoints) &&
            Objects.equals(endpointsNamespace, __otherCasted.endpointsNamespace) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }

    public GlusterfsPersistentVolumeSource endpoints(final String endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public GlusterfsPersistentVolumeSource endpointsNamespace(final String endpointsNamespace) {
        this.endpointsNamespace = endpointsNamespace;
        return this;
    }

    public GlusterfsPersistentVolumeSource path(final String path) {
        this.path = path;
        return this;
    }

    public GlusterfsPersistentVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    @Override
    public GlusterfsPersistentVolumeSource validate() {
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
                    (endpointsNamespace != null ? "\"endpointsNamespace\":\"" +  JsonStrings.escapeJson(endpointsNamespace) + "\"" : ""),
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
