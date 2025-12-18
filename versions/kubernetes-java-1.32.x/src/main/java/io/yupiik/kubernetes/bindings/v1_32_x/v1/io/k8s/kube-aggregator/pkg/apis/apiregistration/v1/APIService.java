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
package io.yupiik.kubernetes.bindings.v1_32_x.v1;

import io.yupiik.kubernetes.bindings.v1_32_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService implements Validable<io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private APIServiceSpec spec;
    private APIServiceStatus status;

    public io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService() {
        // no-op
    }

    public io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService(final String apiVersion,
                                                                         final String kind,
                                                                         final ObjectMeta metadata,
                                                                         final APIServiceSpec spec,
                                                                         final APIServiceStatus status) {
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

    public APIServiceSpec getSpec() {
        return spec;
    }

    public void setSpec(final APIServiceSpec spec) {
        this.spec = spec;
    }

    public APIServiceStatus getStatus() {
        return status;
    }

    public void setStatus(final APIServiceStatus status) {
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
        if (!(__other instanceof io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService)) {
            return false;
        }
        final io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService __otherCasted = (io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService spec(final APIServiceSpec spec) {
        this.spec = spec;
        return this;
    }

    public io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService status(final APIServiceStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public io.k8s.kube-aggregator.pkg.apis.apiregistration.v1.APIService validate() {
        if (kind == null) {
            kind = "APIService";
        }
        if (apiVersion == null) {
            apiVersion = "apiregistration.k8s.io/v1";
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
