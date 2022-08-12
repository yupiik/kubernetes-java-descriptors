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
package io.yupiik.kubernetes.bindings.v1_16_5.v1;

import io.yupiik.kubernetes.bindings.v1_16_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_5.Validable;
import io.yupiik.kubernetes.bindings.v1_16_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Secret implements Validable<Secret>, Exportable {
    private String apiVersion;
    private Map<String, String> data;
    private String kind;
    private ObjectMeta metadata;
    private Map<String, String> stringData;
    private String type;

    public Secret() {
        // no-op
    }

    public Secret(final String apiVersion,
                  final Map<String, String> data,
                  final String kind,
                  final ObjectMeta metadata,
                  final Map<String, String> stringData,
                  final String type) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(final Map<String, String> data) {
        this.data = data;
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

    public Map<String, String> getStringData() {
        return stringData;
    }

    public void setStringData(final Map<String, String> stringData) {
        this.stringData = stringData;
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
                apiVersion,
                data,
                kind,
                metadata,
                stringData,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Secret)) {
            return false;
        }
        final Secret __otherCasted = (Secret) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(data, __otherCasted.data) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(stringData, __otherCasted.stringData) &&
            Objects.equals(type, __otherCasted.type);
    }

    public Secret apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Secret data(final Map<String, String> data) {
        this.data = data;
        return this;
    }

    public Secret kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Secret metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Secret stringData(final Map<String, String> stringData) {
        this.stringData = stringData;
        return this;
    }

    public Secret type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public Secret validate() {
        if (kind == null) {
            kind = "Secret";
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
                    (data != null ? "\"data\":" + data.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (stringData != null ? "\"stringData\":" + stringData.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
