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
package io.yupiik.kubernetes.bindings.v1_7_7.v1;

import io.yupiik.kubernetes.bindings.v1_7_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_7.Validable;
import io.yupiik.kubernetes.bindings.v1_7_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StorageClass implements Validable<StorageClass>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private Map<String, String> parameters;
    private String provisioner;

    public StorageClass() {
        // no-op
    }

    public StorageClass(final String apiVersion,
                        final String kind,
                        final ObjectMeta metadata,
                        final Map<String, String> parameters,
                        final String provisioner) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
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

    public String getProvisioner() {
        return provisioner;
    }

    public void setProvisioner(final String provisioner) {
        this.provisioner = provisioner;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                parameters,
                provisioner);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageClass)) {
            return false;
        }
        final StorageClass __otherCasted = (StorageClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(parameters, __otherCasted.parameters) &&
            Objects.equals(provisioner, __otherCasted.provisioner);
    }

    public StorageClass apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public StorageClass kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public StorageClass metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public StorageClass parameters(final Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public StorageClass provisioner(final String provisioner) {
        this.provisioner = provisioner;
        return this;
    }

    @Override
    public StorageClass validate() {
        if (kind == null) {
            kind = "StorageClass";
        }
        if (apiVersion == null) {
            apiVersion = "storage.k8s.io/v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (provisioner == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "provisioner", "provisioner",
                "Missing 'provisioner' attribute.", true));
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
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (parameters != null ? "\"parameters\":" + parameters.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (provisioner != null ? "\"provisioner\":\"" +  JsonStrings.escapeJson(provisioner) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
