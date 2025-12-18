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
package io.yupiik.kubernetes.bindings.v1_28_x.v1;

import io.yupiik.kubernetes.bindings.v1_28_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration implements Validable<io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private List<ValidatingWebhook> webhooks;

    public io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration() {
        // no-op
    }

    public io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration(final String apiVersion,
                                                                              final String kind,
                                                                              final ObjectMeta metadata,
                                                                              final List<ValidatingWebhook> webhooks) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.webhooks = webhooks;
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

    public List<ValidatingWebhook> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(final List<ValidatingWebhook> webhooks) {
        this.webhooks = webhooks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                webhooks);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration)) {
            return false;
        }
        final io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration __otherCasted = (io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(webhooks, __otherCasted.webhooks);
    }

    public io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration webhooks(final List<ValidatingWebhook> webhooks) {
        this.webhooks = webhooks;
        return this;
    }

    @Override
    public io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration validate() {
        if (kind == null) {
            kind = "ValidatingWebhookConfiguration";
        }
        if (apiVersion == null) {
            apiVersion = "admissionregistration.k8s.io/v1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (webhooks != null ? "\"webhooks\":" + webhooks.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
