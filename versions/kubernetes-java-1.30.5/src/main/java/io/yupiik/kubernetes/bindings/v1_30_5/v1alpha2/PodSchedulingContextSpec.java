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
package io.yupiik.kubernetes.bindings.v1_30_5.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_5.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodSchedulingContextSpec implements Validable<PodSchedulingContextSpec>, Exportable {
    private List<String> potentialNodes;
    private String selectedNode;

    public PodSchedulingContextSpec() {
        // no-op
    }

    public PodSchedulingContextSpec(final List<String> potentialNodes,
                                    final String selectedNode) {
        this.potentialNodes = potentialNodes;
        this.selectedNode = selectedNode;
    }

    public List<String> getPotentialNodes() {
        return potentialNodes;
    }

    public void setPotentialNodes(final List<String> potentialNodes) {
        this.potentialNodes = potentialNodes;
    }

    public String getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(final String selectedNode) {
        this.selectedNode = selectedNode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                potentialNodes,
                selectedNode);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSchedulingContextSpec)) {
            return false;
        }
        final PodSchedulingContextSpec __otherCasted = (PodSchedulingContextSpec) __other;
        return Objects.equals(potentialNodes, __otherCasted.potentialNodes) &&
            Objects.equals(selectedNode, __otherCasted.selectedNode);
    }

    public PodSchedulingContextSpec potentialNodes(final List<String> potentialNodes) {
        this.potentialNodes = potentialNodes;
        return this;
    }

    public PodSchedulingContextSpec selectedNode(final String selectedNode) {
        this.selectedNode = selectedNode;
        return this;
    }

    @Override
    public PodSchedulingContextSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (potentialNodes != null ? "\"potentialNodes\":" + potentialNodes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (selectedNode != null ? "\"selectedNode\":\"" +  JsonStrings.escapeJson(selectedNode) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
