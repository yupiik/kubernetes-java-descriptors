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
package io.yupiik.kubernetes.bindings.v1_30_8.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_8.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClassParameters implements Validable<ResourceClassParameters>, Exportable {
    private String apiVersion;
    private List<ResourceFilter> filters;
    private ResourceClassParametersReference generatedFrom;
    private String kind;
    private ObjectMeta metadata;
    private List<VendorParameters> vendorParameters;

    public ResourceClassParameters() {
        // no-op
    }

    public ResourceClassParameters(final String apiVersion,
                                   final List<ResourceFilter> filters,
                                   final ResourceClassParametersReference generatedFrom,
                                   final String kind,
                                   final ObjectMeta metadata,
                                   final List<VendorParameters> vendorParameters) {
        this.apiVersion = apiVersion;
        this.filters = filters;
        this.generatedFrom = generatedFrom;
        this.kind = kind;
        this.metadata = metadata;
        this.vendorParameters = vendorParameters;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ResourceFilter> getFilters() {
        return filters;
    }

    public void setFilters(final List<ResourceFilter> filters) {
        this.filters = filters;
    }

    public ResourceClassParametersReference getGeneratedFrom() {
        return generatedFrom;
    }

    public void setGeneratedFrom(final ResourceClassParametersReference generatedFrom) {
        this.generatedFrom = generatedFrom;
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

    public List<VendorParameters> getVendorParameters() {
        return vendorParameters;
    }

    public void setVendorParameters(final List<VendorParameters> vendorParameters) {
        this.vendorParameters = vendorParameters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                filters,
                generatedFrom,
                kind,
                metadata,
                vendorParameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceClassParameters)) {
            return false;
        }
        final ResourceClassParameters __otherCasted = (ResourceClassParameters) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(filters, __otherCasted.filters) &&
            Objects.equals(generatedFrom, __otherCasted.generatedFrom) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(vendorParameters, __otherCasted.vendorParameters);
    }

    public ResourceClassParameters apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ResourceClassParameters filters(final List<ResourceFilter> filters) {
        this.filters = filters;
        return this;
    }

    public ResourceClassParameters generatedFrom(final ResourceClassParametersReference generatedFrom) {
        this.generatedFrom = generatedFrom;
        return this;
    }

    public ResourceClassParameters kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ResourceClassParameters metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ResourceClassParameters vendorParameters(final List<VendorParameters> vendorParameters) {
        this.vendorParameters = vendorParameters;
        return this;
    }

    @Override
    public ResourceClassParameters validate() {
        if (kind == null) {
            kind = "ResourceClassParameters";
        }
        if (apiVersion == null) {
            apiVersion = "resource.k8s.io/v1alpha2";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (filters != null ? "\"filters\":" + filters.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (generatedFrom != null ? "\"generatedFrom\":" + generatedFrom.asJson() : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (vendorParameters != null ? "\"vendorParameters\":" + vendorParameters.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
