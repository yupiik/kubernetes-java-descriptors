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
package io.yupiik.kubernetes.bindings.v1_18_12.v1;

import io.yupiik.kubernetes.bindings.v1_18_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_12.Validable;
import io.yupiik.kubernetes.bindings.v1_18_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Endpoints implements Validable<Endpoints>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private List<EndpointSubset> subsets;

    public Endpoints() {
        // no-op
    }

    public Endpoints(final String apiVersion,
                     final String kind,
                     final ObjectMeta metadata,
                     final List<EndpointSubset> subsets) {
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

    public List<EndpointSubset> getSubsets() {
        return subsets;
    }

    public void setSubsets(final List<EndpointSubset> subsets) {
        this.subsets = subsets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                subsets);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Endpoints)) {
            return false;
        }
        final Endpoints __otherCasted = (Endpoints) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(subsets, __otherCasted.subsets);
    }

    public Endpoints apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Endpoints kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Endpoints metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Endpoints subsets(final List<EndpointSubset> subsets) {
        this.subsets = subsets;
        return this;
    }

    @Override
    public Endpoints validate() {
        if (kind == null) {
            kind = "Endpoints";
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
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (subsets != null ? "\"subsets\":" + subsets.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
