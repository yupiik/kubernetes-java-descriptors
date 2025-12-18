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
package io.yupiik.kubernetes.bindings.v1_29_x.v1;

import io.yupiik.kubernetes.bindings.v1_29_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_x.Validable;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.ConfigMap implements Validable<io.k8s.api.core.v1.ConfigMap>, Exportable {
    private String apiVersion;
    private Map<String, String> binaryData;
    private Map<String, String> data;
    private Boolean immutable;
    private String kind;
    private ObjectMeta metadata;

    public io.k8s.api.core.v1.ConfigMap() {
        // no-op
    }

    public io.k8s.api.core.v1.ConfigMap(final String apiVersion,
                                        final Map<String, String> binaryData,
                                        final Map<String, String> data,
                                        final Boolean immutable,
                                        final String kind,
                                        final ObjectMeta metadata) {
        this.apiVersion = apiVersion;
        this.binaryData = binaryData;
        this.data = data;
        this.immutable = immutable;
        this.kind = kind;
        this.metadata = metadata;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Map<String, String> getBinaryData() {
        return binaryData;
    }

    public void setBinaryData(final Map<String, String> binaryData) {
        this.binaryData = binaryData;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(final Map<String, String> data) {
        this.data = data;
    }

    public Boolean getImmutable() {
        return immutable;
    }

    public void setImmutable(final Boolean immutable) {
        this.immutable = immutable;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                binaryData,
                data,
                immutable,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.ConfigMap)) {
            return false;
        }
        final io.k8s.api.core.v1.ConfigMap __otherCasted = (io.k8s.api.core.v1.ConfigMap) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(binaryData, __otherCasted.binaryData) &&
            Objects.equals(data, __otherCasted.data) &&
            Objects.equals(immutable, __otherCasted.immutable) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public io.k8s.api.core.v1.ConfigMap apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public io.k8s.api.core.v1.ConfigMap binaryData(final Map<String, String> binaryData) {
        this.binaryData = binaryData;
        return this;
    }

    public io.k8s.api.core.v1.ConfigMap data(final Map<String, String> data) {
        this.data = data;
        return this;
    }

    public io.k8s.api.core.v1.ConfigMap immutable(final Boolean immutable) {
        this.immutable = immutable;
        return this;
    }

    public io.k8s.api.core.v1.ConfigMap kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public io.k8s.api.core.v1.ConfigMap metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.ConfigMap validate() {
        if (kind == null) {
            kind = "ConfigMap";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (binaryData != null ? "\"binaryData\":" + binaryData.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (data != null ? "\"data\":" + data.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (immutable != null ? "\"immutable\":" + immutable : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
