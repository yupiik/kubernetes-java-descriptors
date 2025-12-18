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
package io.yupiik.kubernetes.bindings.v1_33_x.v1;

import io.yupiik.kubernetes.bindings.v1_33_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.ObjectReference implements Validable<io.k8s.api.core.v1.ObjectReference>, Exportable {
    private String apiVersion;
    private String fieldPath;
    private String kind;
    private String name;
    private String namespace;
    private String resourceVersion;
    private String uid;

    public io.k8s.api.core.v1.ObjectReference() {
        // no-op
    }

    public io.k8s.api.core.v1.ObjectReference(final String apiVersion,
                                              final String fieldPath,
                                              final String kind,
                                              final String name,
                                              final String namespace,
                                              final String resourceVersion,
                                              final String uid) {
        this.apiVersion = apiVersion;
        this.fieldPath = fieldPath;
        this.kind = kind;
        this.name = name;
        this.namespace = namespace;
        this.resourceVersion = resourceVersion;
        this.uid = uid;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(final String fieldPath) {
        this.fieldPath = fieldPath;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                fieldPath,
                kind,
                name,
                namespace,
                resourceVersion,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.ObjectReference)) {
            return false;
        }
        final io.k8s.api.core.v1.ObjectReference __otherCasted = (io.k8s.api.core.v1.ObjectReference) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(fieldPath, __otherCasted.fieldPath) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public io.k8s.api.core.v1.ObjectReference apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public io.k8s.api.core.v1.ObjectReference fieldPath(final String fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }

    public io.k8s.api.core.v1.ObjectReference kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public io.k8s.api.core.v1.ObjectReference name(final String name) {
        this.name = name;
        return this;
    }

    public io.k8s.api.core.v1.ObjectReference namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public io.k8s.api.core.v1.ObjectReference resourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public io.k8s.api.core.v1.ObjectReference uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.ObjectReference validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (fieldPath != null ? "\"fieldPath\":\"" +  JsonStrings.escapeJson(fieldPath) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""),
                    (resourceVersion != null ? "\"resourceVersion\":\"" +  JsonStrings.escapeJson(resourceVersion) + "\"" : ""),
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
