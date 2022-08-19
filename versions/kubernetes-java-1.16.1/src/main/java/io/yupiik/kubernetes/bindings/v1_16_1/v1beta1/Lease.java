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
package io.yupiik.kubernetes.bindings.v1_16_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_16_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_1.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Lease implements Validable<Lease>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private LeaseSpec spec;

    public Lease() {
        // no-op
    }

    public Lease(final String apiVersion,
                 final String kind,
                 final ObjectMeta metadata,
                 final LeaseSpec spec) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
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

    public LeaseSpec getSpec() {
        return spec;
    }

    public void setSpec(final LeaseSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Lease)) {
            return false;
        }
        final Lease __otherCasted = (Lease) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public Lease apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Lease kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Lease metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Lease spec(final LeaseSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public Lease validate() {
        if (kind == null) {
            kind = "Lease";
        }
        if (apiVersion == null) {
            apiVersion = "coordination.k8s.io/v1beta1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
