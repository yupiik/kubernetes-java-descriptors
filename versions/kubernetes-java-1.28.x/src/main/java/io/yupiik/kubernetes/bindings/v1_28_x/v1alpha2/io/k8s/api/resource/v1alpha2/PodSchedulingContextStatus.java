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
package io.yupiik.kubernetes.bindings.v1_28_x.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_28_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.resource.v1alpha2.PodSchedulingContextStatus implements Validable<io.k8s.api.resource.v1alpha2.PodSchedulingContextStatus>, Exportable {
    private List<ResourceClaimSchedulingStatus> resourceClaims;

    public io.k8s.api.resource.v1alpha2.PodSchedulingContextStatus() {
        // no-op
    }

    public io.k8s.api.resource.v1alpha2.PodSchedulingContextStatus(final List<ResourceClaimSchedulingStatus> resourceClaims) {
        this.resourceClaims = resourceClaims;
    }

    public List<ResourceClaimSchedulingStatus> getResourceClaims() {
        return resourceClaims;
    }

    public void setResourceClaims(final List<ResourceClaimSchedulingStatus> resourceClaims) {
        this.resourceClaims = resourceClaims;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resourceClaims);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.resource.v1alpha2.PodSchedulingContextStatus)) {
            return false;
        }
        final io.k8s.api.resource.v1alpha2.PodSchedulingContextStatus __otherCasted = (io.k8s.api.resource.v1alpha2.PodSchedulingContextStatus) __other;
        return Objects.equals(resourceClaims, __otherCasted.resourceClaims);
    }

    public io.k8s.api.resource.v1alpha2.PodSchedulingContextStatus resourceClaims(final List<ResourceClaimSchedulingStatus> resourceClaims) {
        this.resourceClaims = resourceClaims;
        return this;
    }

    @Override
    public io.k8s.api.resource.v1alpha2.PodSchedulingContextStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (resourceClaims != null ? "\"resourceClaims\":" + resourceClaims.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
