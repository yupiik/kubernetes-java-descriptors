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
package io.yupiik.kubernetes.bindings.v1_33_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceCIDR implements Validable<ServiceCIDR>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ServiceCIDRSpec spec;
    private ServiceCIDRStatus status;

    public ServiceCIDR() {
        // no-op
    }

    public ServiceCIDR(final String apiVersion,
                       final String kind,
                       final ObjectMeta metadata,
                       final ServiceCIDRSpec spec,
                       final ServiceCIDRStatus status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
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

    public ServiceCIDRSpec getSpec() {
        return spec;
    }

    public void setSpec(final ServiceCIDRSpec spec) {
        this.spec = spec;
    }

    public ServiceCIDRStatus getStatus() {
        return status;
    }

    public void setStatus(final ServiceCIDRStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceCIDR)) {
            return false;
        }
        final ServiceCIDR __otherCasted = (ServiceCIDR) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public ServiceCIDR apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ServiceCIDR kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ServiceCIDR metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ServiceCIDR spec(final ServiceCIDRSpec spec) {
        this.spec = spec;
        return this;
    }

    public ServiceCIDR status(final ServiceCIDRStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public ServiceCIDR validate() {
        if (kind == null) {
            kind = "ServiceCIDR";
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
                    (spec != null ? "\"spec\":" + spec.asJson() : ""),
                    (status != null ? "\"status\":" + status.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
