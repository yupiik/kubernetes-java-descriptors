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
package io.yupiik.kubernetes.bindings.v1_28_3.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_28_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_3.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaimSchedulingStatus implements Validable<ResourceClaimSchedulingStatus>, Exportable {
    private String name;
    private List<String> unsuitableNodes;

    public ResourceClaimSchedulingStatus() {
        // no-op
    }

    public ResourceClaimSchedulingStatus(final String name,
                                         final List<String> unsuitableNodes) {
        this.name = name;
        this.unsuitableNodes = unsuitableNodes;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<String> getUnsuitableNodes() {
        return unsuitableNodes;
    }

    public void setUnsuitableNodes(final List<String> unsuitableNodes) {
        this.unsuitableNodes = unsuitableNodes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                unsuitableNodes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceClaimSchedulingStatus)) {
            return false;
        }
        final ResourceClaimSchedulingStatus __otherCasted = (ResourceClaimSchedulingStatus) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(unsuitableNodes, __otherCasted.unsuitableNodes);
    }

    public ResourceClaimSchedulingStatus name(final String name) {
        this.name = name;
        return this;
    }

    public ResourceClaimSchedulingStatus unsuitableNodes(final List<String> unsuitableNodes) {
        this.unsuitableNodes = unsuitableNodes;
        return this;
    }

    @Override
    public ResourceClaimSchedulingStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (unsuitableNodes != null ? "\"unsuitableNodes\":" + unsuitableNodes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
