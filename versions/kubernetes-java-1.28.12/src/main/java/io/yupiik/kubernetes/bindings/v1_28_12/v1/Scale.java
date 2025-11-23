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
package io.yupiik.kubernetes.bindings.v1_28_12.v1;

import io.yupiik.kubernetes.bindings.v1_28_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_12.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Scale implements Validable<Scale>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ScaleSpec spec;
    private ScaleStatus status;

    public Scale() {
        // no-op
    }

    public Scale(final String apiVersion,
                 final String kind,
                 final ObjectMeta metadata,
                 final ScaleSpec spec,
                 final ScaleStatus status) {
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

    public ScaleSpec getSpec() {
        return spec;
    }

    public void setSpec(final ScaleSpec spec) {
        this.spec = spec;
    }

    public ScaleStatus getStatus() {
        return status;
    }

    public void setStatus(final ScaleStatus status) {
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
        if (!(__other instanceof Scale)) {
            return false;
        }
        final Scale __otherCasted = (Scale) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public Scale apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Scale kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Scale metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Scale spec(final ScaleSpec spec) {
        this.spec = spec;
        return this;
    }

    public Scale status(final ScaleStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public Scale validate() {
        if (kind == null) {
            kind = "Scale";
        }
        if (apiVersion == null) {
            apiVersion = "autoscaling/v1";
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
