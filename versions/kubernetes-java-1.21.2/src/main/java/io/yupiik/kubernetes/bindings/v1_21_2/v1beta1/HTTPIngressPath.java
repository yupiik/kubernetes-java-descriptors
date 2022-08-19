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
package io.yupiik.kubernetes.bindings.v1_21_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_2.Validable;
import io.yupiik.kubernetes.bindings.v1_21_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HTTPIngressPath implements Validable<HTTPIngressPath>, Exportable {
    private IngressBackend backend;
    private String path;
    private String pathType;

    public HTTPIngressPath() {
        // no-op
    }

    public HTTPIngressPath(final IngressBackend backend,
                           final String path,
                           final String pathType) {
        this.backend = backend;
        this.path = path;
        this.pathType = pathType;
    }

    public IngressBackend getBackend() {
        return backend;
    }

    public void setBackend(final IngressBackend backend) {
        this.backend = backend;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getPathType() {
        return pathType;
    }

    public void setPathType(final String pathType) {
        this.pathType = pathType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                backend,
                path,
                pathType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HTTPIngressPath)) {
            return false;
        }
        final HTTPIngressPath __otherCasted = (HTTPIngressPath) __other;
        return Objects.equals(backend, __otherCasted.backend) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(pathType, __otherCasted.pathType);
    }

    public HTTPIngressPath backend(final IngressBackend backend) {
        this.backend = backend;
        return this;
    }

    public HTTPIngressPath path(final String path) {
        this.path = path;
        return this;
    }

    public HTTPIngressPath pathType(final String pathType) {
        this.pathType = pathType;
        return this;
    }

    @Override
    public HTTPIngressPath validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (backend == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "backend", "backend",
                "Missing 'backend' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (backend != null ? "\"backend\":" + backend.asJson() : ""),
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""),
                    (pathType != null ? "\"pathType\":\"" +  JsonStrings.escapeJson(pathType) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
