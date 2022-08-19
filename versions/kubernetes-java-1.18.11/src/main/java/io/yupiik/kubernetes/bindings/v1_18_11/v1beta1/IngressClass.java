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
package io.yupiik.kubernetes.bindings.v1_18_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_18_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_11.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressClass implements Validable<IngressClass>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private IngressClassSpec spec;

    public IngressClass() {
        // no-op
    }

    public IngressClass(final String apiVersion,
                        final String kind,
                        final ObjectMeta metadata,
                        final IngressClassSpec spec) {
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

    public IngressClassSpec getSpec() {
        return spec;
    }

    public void setSpec(final IngressClassSpec spec) {
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
        if (!(__other instanceof IngressClass)) {
            return false;
        }
        final IngressClass __otherCasted = (IngressClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public IngressClass apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public IngressClass kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public IngressClass metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public IngressClass spec(final IngressClassSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public IngressClass validate() {
        if (kind == null) {
            kind = "IngressClass";
        }
        if (apiVersion == null) {
            apiVersion = "networking.k8s.io/v1beta1";
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
