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
package io.yupiik.kubernetes.bindings.v1_30_8.v1;

import io.yupiik.kubernetes.bindings.v1_30_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_8.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class FlowSchema implements Validable<FlowSchema>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private FlowSchemaSpec spec;
    private FlowSchemaStatus status;

    public FlowSchema() {
        // no-op
    }

    public FlowSchema(final String apiVersion,
                      final String kind,
                      final ObjectMeta metadata,
                      final FlowSchemaSpec spec,
                      final FlowSchemaStatus status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
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

    public FlowSchemaSpec getSpec() {
        return spec;
    }

    public void setSpec(final FlowSchemaSpec spec) {
        this.spec = spec;
    }

    public FlowSchemaStatus getStatus() {
        return status;
    }

    public void setStatus(final FlowSchemaStatus status) {
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
        if (!(__other instanceof FlowSchema)) {
            return false;
        }
        final FlowSchema __otherCasted = (FlowSchema) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public FlowSchema apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public FlowSchema kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public FlowSchema metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public FlowSchema spec(final FlowSchemaSpec spec) {
        this.spec = spec;
        return this;
    }

    public FlowSchema status(final FlowSchemaStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public FlowSchema validate() {
        if (kind == null) {
            kind = "FlowSchema";
        }
        if (apiVersion == null) {
            apiVersion = "flowcontrol.apiserver.k8s.io/v1";
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
