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
package io.yupiik.kubernetes.bindings.v1_30_0.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_0.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AllocationResult implements Validable<AllocationResult>, Exportable {
    private NodeSelector availableOnNodes;
    private List<ResourceHandle> resourceHandles;
    private Boolean shareable;

    public AllocationResult() {
        // no-op
    }

    public AllocationResult(final NodeSelector availableOnNodes,
                            final List<ResourceHandle> resourceHandles,
                            final Boolean shareable) {
        this.availableOnNodes = availableOnNodes;
        this.resourceHandles = resourceHandles;
        this.shareable = shareable;
    }

    public NodeSelector getAvailableOnNodes() {
        return availableOnNodes;
    }

    public void setAvailableOnNodes(final NodeSelector availableOnNodes) {
        this.availableOnNodes = availableOnNodes;
    }

    public List<ResourceHandle> getResourceHandles() {
        return resourceHandles;
    }

    public void setResourceHandles(final List<ResourceHandle> resourceHandles) {
        this.resourceHandles = resourceHandles;
    }

    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(final Boolean shareable) {
        this.shareable = shareable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                availableOnNodes,
                resourceHandles,
                shareable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AllocationResult)) {
            return false;
        }
        final AllocationResult __otherCasted = (AllocationResult) __other;
        return Objects.equals(availableOnNodes, __otherCasted.availableOnNodes) &&
            Objects.equals(resourceHandles, __otherCasted.resourceHandles) &&
            Objects.equals(shareable, __otherCasted.shareable);
    }

    public AllocationResult availableOnNodes(final NodeSelector availableOnNodes) {
        this.availableOnNodes = availableOnNodes;
        return this;
    }

    public AllocationResult resourceHandles(final List<ResourceHandle> resourceHandles) {
        this.resourceHandles = resourceHandles;
        return this;
    }

    public AllocationResult shareable(final Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    @Override
    public AllocationResult validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (availableOnNodes != null ? "\"availableOnNodes\":" + availableOnNodes.asJson() : ""),
                    (resourceHandles != null ? "\"resourceHandles\":" + resourceHandles.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (shareable != null ? "\"shareable\":" + shareable : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
