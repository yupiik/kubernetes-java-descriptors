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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.ServiceAccount implements Validable<io.k8s.api.core.v1.ServiceAccount>, Exportable {
    private String apiVersion;
    private Boolean automountServiceAccountToken;
    private List<LocalObjectReference> imagePullSecrets;
    private String kind;
    private ObjectMeta metadata;
    private List<ObjectReference> secrets;

    public io.k8s.api.core.v1.ServiceAccount() {
        // no-op
    }

    public io.k8s.api.core.v1.ServiceAccount(final String apiVersion,
                                             final Boolean automountServiceAccountToken,
                                             final List<LocalObjectReference> imagePullSecrets,
                                             final String kind,
                                             final ObjectMeta metadata,
                                             final List<ObjectReference> secrets) {
        this.apiVersion = apiVersion;
        this.automountServiceAccountToken = automountServiceAccountToken;
        this.imagePullSecrets = imagePullSecrets;
        this.kind = kind;
        this.metadata = metadata;
        this.secrets = secrets;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    public void setAutomountServiceAccountToken(final Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    public List<LocalObjectReference> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(final List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
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

    public List<ObjectReference> getSecrets() {
        return secrets;
    }

    public void setSecrets(final List<ObjectReference> secrets) {
        this.secrets = secrets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                automountServiceAccountToken,
                imagePullSecrets,
                kind,
                metadata,
                secrets);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.ServiceAccount)) {
            return false;
        }
        final io.k8s.api.core.v1.ServiceAccount __otherCasted = (io.k8s.api.core.v1.ServiceAccount) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(automountServiceAccountToken, __otherCasted.automountServiceAccountToken) &&
            Objects.equals(imagePullSecrets, __otherCasted.imagePullSecrets) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(secrets, __otherCasted.secrets);
    }

    public io.k8s.api.core.v1.ServiceAccount apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public io.k8s.api.core.v1.ServiceAccount automountServiceAccountToken(final Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
        return this;
    }

    public io.k8s.api.core.v1.ServiceAccount imagePullSecrets(final List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }

    public io.k8s.api.core.v1.ServiceAccount kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public io.k8s.api.core.v1.ServiceAccount metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public io.k8s.api.core.v1.ServiceAccount secrets(final List<ObjectReference> secrets) {
        this.secrets = secrets;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.ServiceAccount validate() {
        if (kind == null) {
            kind = "ServiceAccount";
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
                    (automountServiceAccountToken != null ? "\"automountServiceAccountToken\":" + automountServiceAccountToken : ""),
                    (imagePullSecrets != null ? "\"imagePullSecrets\":" + imagePullSecrets.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (secrets != null ? "\"secrets\":" + secrets.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
