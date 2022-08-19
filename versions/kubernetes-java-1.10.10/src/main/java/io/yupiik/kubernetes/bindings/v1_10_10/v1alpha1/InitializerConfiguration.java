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
package io.yupiik.kubernetes.bindings.v1_10_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_10_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_10.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class InitializerConfiguration implements Validable<InitializerConfiguration>, Exportable {
    private String apiVersion;
    private List<Initializer> initializers;
    private String kind;
    private ObjectMeta metadata;

    public InitializerConfiguration() {
        // no-op
    }

    public InitializerConfiguration(final String apiVersion,
                                    final List<Initializer> initializers,
                                    final String kind,
                                    final ObjectMeta metadata) {
        this.apiVersion = apiVersion;
        this.initializers = initializers;
        this.kind = kind;
        this.metadata = metadata;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<Initializer> getInitializers() {
        return initializers;
    }

    public void setInitializers(final List<Initializer> initializers) {
        this.initializers = initializers;
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
                initializers,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof InitializerConfiguration)) {
            return false;
        }
        final InitializerConfiguration __otherCasted = (InitializerConfiguration) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(initializers, __otherCasted.initializers) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public InitializerConfiguration apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public InitializerConfiguration initializers(final List<Initializer> initializers) {
        this.initializers = initializers;
        return this;
    }

    public InitializerConfiguration kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public InitializerConfiguration metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public InitializerConfiguration validate() {
        if (kind == null) {
            kind = "InitializerConfiguration";
        }
        if (apiVersion == null) {
            apiVersion = "admissionregistration.k8s.io/v1alpha1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (initializers != null ? "\"initializers\":" + initializers.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
