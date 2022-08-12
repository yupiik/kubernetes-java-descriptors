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
package io.yupiik.kubernetes.bindings.v1_21_13.v1;

import io.yupiik.kubernetes.bindings.v1_21_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_13.Validable;
import io.yupiik.kubernetes.bindings.v1_21_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceDefinition implements Validable<CustomResourceDefinition>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private CustomResourceDefinitionSpec spec;
    private CustomResourceDefinitionStatus status;

    public CustomResourceDefinition() {
        // no-op
    }

    public CustomResourceDefinition(final String apiVersion,
                                    final String kind,
                                    final ObjectMeta metadata,
                                    final CustomResourceDefinitionSpec spec,
                                    final CustomResourceDefinitionStatus status) {
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

    public CustomResourceDefinitionSpec getSpec() {
        return spec;
    }

    public void setSpec(final CustomResourceDefinitionSpec spec) {
        this.spec = spec;
    }

    public CustomResourceDefinitionStatus getStatus() {
        return status;
    }

    public void setStatus(final CustomResourceDefinitionStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinition)) {
            return false;
        }
        final CustomResourceDefinition __otherCasted = (CustomResourceDefinition) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public CustomResourceDefinition apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CustomResourceDefinition kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public CustomResourceDefinition metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public CustomResourceDefinition spec(final CustomResourceDefinitionSpec spec) {
        this.spec = spec;
        return this;
    }

    public CustomResourceDefinition status(final CustomResourceDefinitionStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public CustomResourceDefinition validate() {
        if (kind == null) {
            kind = "CustomResourceDefinition";
        }
        if (apiVersion == null) {
            apiVersion = "apiextensions.k8s.io/v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (spec == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "spec", "spec",
                "Missing 'spec' attribute.", true));
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
                    (spec != null ? "\"spec\":" + spec.asJson() : ""),
                    (status != null ? "\"status\":" + status.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
