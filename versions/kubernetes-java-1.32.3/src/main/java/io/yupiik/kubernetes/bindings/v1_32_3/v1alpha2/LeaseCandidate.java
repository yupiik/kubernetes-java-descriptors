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
package io.yupiik.kubernetes.bindings.v1_32_3.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_32_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LeaseCandidate implements Validable<LeaseCandidate>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private LeaseCandidateSpec spec;

    public LeaseCandidate() {
        // no-op
    }

    public LeaseCandidate(final String apiVersion,
                          final String kind,
                          final ObjectMeta metadata,
                          final LeaseCandidateSpec spec) {
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

    public LeaseCandidateSpec getSpec() {
        return spec;
    }

    public void setSpec(final LeaseCandidateSpec spec) {
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
        if (!(__other instanceof LeaseCandidate)) {
            return false;
        }
        final LeaseCandidate __otherCasted = (LeaseCandidate) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public LeaseCandidate apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public LeaseCandidate kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public LeaseCandidate metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public LeaseCandidate spec(final LeaseCandidateSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public LeaseCandidate validate() {
        if (kind == null) {
            kind = "LeaseCandidate";
        }
        if (apiVersion == null) {
            apiVersion = "coordination.k8s.io/v1alpha2";
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
