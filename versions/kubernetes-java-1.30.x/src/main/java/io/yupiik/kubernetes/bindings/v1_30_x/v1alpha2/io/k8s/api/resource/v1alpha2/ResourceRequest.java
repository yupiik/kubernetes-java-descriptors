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
package io.yupiik.kubernetes.bindings.v1_30_x.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_x.Validable;
import jakarta.json.JsonObject;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.resource.v1alpha2.ResourceRequest implements Validable<io.k8s.api.resource.v1alpha2.ResourceRequest>, Exportable {
    private NamedResourcesRequest namedResources;
    private JsonObject vendorParameters;

    public io.k8s.api.resource.v1alpha2.ResourceRequest() {
        // no-op
    }

    public io.k8s.api.resource.v1alpha2.ResourceRequest(final NamedResourcesRequest namedResources,
                                                        final JsonObject vendorParameters) {
        this.namedResources = namedResources;
        this.vendorParameters = vendorParameters;
    }

    public NamedResourcesRequest getNamedResources() {
        return namedResources;
    }

    public void setNamedResources(final NamedResourcesRequest namedResources) {
        this.namedResources = namedResources;
    }

    public JsonObject getVendorParameters() {
        return vendorParameters;
    }

    public void setVendorParameters(final JsonObject vendorParameters) {
        this.vendorParameters = vendorParameters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                namedResources,
                vendorParameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.resource.v1alpha2.ResourceRequest)) {
            return false;
        }
        final io.k8s.api.resource.v1alpha2.ResourceRequest __otherCasted = (io.k8s.api.resource.v1alpha2.ResourceRequest) __other;
        return Objects.equals(namedResources, __otherCasted.namedResources) &&
            Objects.equals(vendorParameters, __otherCasted.vendorParameters);
    }

    public io.k8s.api.resource.v1alpha2.ResourceRequest namedResources(final NamedResourcesRequest namedResources) {
        this.namedResources = namedResources;
        return this;
    }

    public io.k8s.api.resource.v1alpha2.ResourceRequest vendorParameters(final JsonObject vendorParameters) {
        this.vendorParameters = vendorParameters;
        return this;
    }

    @Override
    public io.k8s.api.resource.v1alpha2.ResourceRequest validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (namedResources != null ? "\"namedResources\":" + namedResources.asJson() : ""),
                    (vendorParameters != null ? "\"vendorParameters\":" + vendorParameters : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
