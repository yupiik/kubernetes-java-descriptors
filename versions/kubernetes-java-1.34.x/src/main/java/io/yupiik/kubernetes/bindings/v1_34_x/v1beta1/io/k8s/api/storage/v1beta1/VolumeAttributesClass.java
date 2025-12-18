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
package io.yupiik.kubernetes.bindings.v1_34_x.v1beta1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import io.yupiik.kubernetes.bindings.v1_34_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.storage.v1beta1.VolumeAttributesClass implements Validable<io.k8s.api.storage.v1beta1.VolumeAttributesClass>, Exportable {
    private String apiVersion;
    private String driverName;
    private String kind;
    private ObjectMeta metadata;
    private Map<String, String> parameters;

    public io.k8s.api.storage.v1beta1.VolumeAttributesClass() {
        // no-op
    }

    public io.k8s.api.storage.v1beta1.VolumeAttributesClass(final String apiVersion,
                                                            final String driverName,
                                                            final String kind,
                                                            final ObjectMeta metadata,
                                                            final Map<String, String> parameters) {
        this.apiVersion = apiVersion;
        this.driverName = driverName;
        this.kind = kind;
        this.metadata = metadata;
        this.parameters = parameters;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(final String driverName) {
        this.driverName = driverName;
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

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(final Map<String, String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                driverName,
                kind,
                metadata,
                parameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.storage.v1beta1.VolumeAttributesClass)) {
            return false;
        }
        final io.k8s.api.storage.v1beta1.VolumeAttributesClass __otherCasted = (io.k8s.api.storage.v1beta1.VolumeAttributesClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(driverName, __otherCasted.driverName) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(parameters, __otherCasted.parameters);
    }

    public io.k8s.api.storage.v1beta1.VolumeAttributesClass apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public io.k8s.api.storage.v1beta1.VolumeAttributesClass driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    public io.k8s.api.storage.v1beta1.VolumeAttributesClass kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public io.k8s.api.storage.v1beta1.VolumeAttributesClass metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public io.k8s.api.storage.v1beta1.VolumeAttributesClass parameters(final Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public io.k8s.api.storage.v1beta1.VolumeAttributesClass validate() {
        if (kind == null) {
            kind = "VolumeAttributesClass";
        }
        if (apiVersion == null) {
            apiVersion = "storage.k8s.io/v1beta1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (driverName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driverName", "driverName",
                "Missing 'driverName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (driverName != null ? "\"driverName\":\"" +  JsonStrings.escapeJson(driverName) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (parameters != null ? "\"parameters\":" + parameters.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
