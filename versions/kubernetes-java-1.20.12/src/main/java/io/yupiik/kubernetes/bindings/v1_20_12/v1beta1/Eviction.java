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
package io.yupiik.kubernetes.bindings.v1_20_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_12.Validable;
import io.yupiik.kubernetes.bindings.v1_20_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Eviction implements Validable<Eviction>, Exportable {
    private String apiVersion;
    private DeleteOptions deleteOptions;
    private String kind;
    private ObjectMeta metadata;

    public Eviction() {
        // no-op
    }

    public Eviction(final String apiVersion,
                    final DeleteOptions deleteOptions,
                    final String kind,
                    final ObjectMeta metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public DeleteOptions getDeleteOptions() {
        return deleteOptions;
    }

    public void setDeleteOptions(final DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                deleteOptions,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Eviction)) {
            return false;
        }
        final Eviction __otherCasted = (Eviction) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(deleteOptions, __otherCasted.deleteOptions) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public Eviction apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Eviction deleteOptions(final DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
        return this;
    }

    public Eviction kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Eviction metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public Eviction validate() {
        if (kind == null) {
            kind = "Eviction";
        }
        if (apiVersion == null) {
            apiVersion = "policy/v1beta1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (deleteOptions != null ? "\"deleteOptions\":" + deleteOptions.asJson() : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
