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
package io.yupiik.kubernetes.bindings.v1_14_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_14_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_14_1.Validable;
import io.yupiik.kubernetes.bindings.v1_14_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class MutatingWebhookConfiguration implements Validable<MutatingWebhookConfiguration>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private List<Webhook> webhooks;

    public MutatingWebhookConfiguration() {
        // no-op
    }

    public MutatingWebhookConfiguration(final String apiVersion,
                                        final String kind,
                                        final ObjectMeta metadata,
                                        final List<Webhook> webhooks) {
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

    public List<Webhook> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(final List<Webhook> webhooks) {
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
        if (!(__other instanceof MutatingWebhookConfiguration)) {
            return false;
        }
        final MutatingWebhookConfiguration __otherCasted = (MutatingWebhookConfiguration) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(webhooks, __otherCasted.webhooks);
    }

    public MutatingWebhookConfiguration apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public MutatingWebhookConfiguration kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public MutatingWebhookConfiguration metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public MutatingWebhookConfiguration webhooks(final List<Webhook> webhooks) {
        this.webhooks = webhooks;
        return this;
    }

    @Override
    public MutatingWebhookConfiguration validate() {
        if (kind == null) {
            kind = "MutatingWebhookConfiguration";
        }
        if (apiVersion == null) {
            apiVersion = "admissionregistration.k8s.io/v1beta1";
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
