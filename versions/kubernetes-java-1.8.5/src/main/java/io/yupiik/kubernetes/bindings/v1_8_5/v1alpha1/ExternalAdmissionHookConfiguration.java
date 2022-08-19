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
package io.yupiik.kubernetes.bindings.v1_8_5.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_8_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_5.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ExternalAdmissionHookConfiguration implements Validable<ExternalAdmissionHookConfiguration>, Exportable {
    private String apiVersion;
    private List<ExternalAdmissionHook> externalAdmissionHooks;
    private String kind;
    private ObjectMeta metadata;

    public ExternalAdmissionHookConfiguration() {
        // no-op
    }

    public ExternalAdmissionHookConfiguration(final String apiVersion,
                                              final List<ExternalAdmissionHook> externalAdmissionHooks,
                                              final String kind,
                                              final ObjectMeta metadata) {
        this.apiVersion = apiVersion;
        this.externalAdmissionHooks = externalAdmissionHooks;
        this.kind = kind;
        this.metadata = metadata;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ExternalAdmissionHook> getExternalAdmissionHooks() {
        return externalAdmissionHooks;
    }

    public void setExternalAdmissionHooks(final List<ExternalAdmissionHook> externalAdmissionHooks) {
        this.externalAdmissionHooks = externalAdmissionHooks;
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
                externalAdmissionHooks,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExternalAdmissionHookConfiguration)) {
            return false;
        }
        final ExternalAdmissionHookConfiguration __otherCasted = (ExternalAdmissionHookConfiguration) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(externalAdmissionHooks, __otherCasted.externalAdmissionHooks) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public ExternalAdmissionHookConfiguration apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ExternalAdmissionHookConfiguration externalAdmissionHooks(final List<ExternalAdmissionHook> externalAdmissionHooks) {
        this.externalAdmissionHooks = externalAdmissionHooks;
        return this;
    }

    public ExternalAdmissionHookConfiguration kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ExternalAdmissionHookConfiguration metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public ExternalAdmissionHookConfiguration validate() {
        if (kind == null) {
            kind = "ExternalAdmissionHookConfiguration";
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
                    (externalAdmissionHooks != null ? "\"externalAdmissionHooks\":" + externalAdmissionHooks.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
