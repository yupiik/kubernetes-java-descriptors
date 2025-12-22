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
package io.yupiik.kubernetes.bindings.v1_35_x.v1beta1;

import io.yupiik.kubernetes.bindings.v1_35_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_35_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_35_x.Validable;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class BasicDevice implements Validable<BasicDevice>, Exportable {
    private Boolean allNodes;
    private Boolean allowMultipleAllocations;
    private JsonObject attributes;
    private List<String> bindingConditions;
    private List<String> bindingFailureConditions;
    private Boolean bindsToNode;
    private JsonObject capacity;
    private List<DeviceCounterConsumption> consumesCounters;
    private String nodeName;
    private NodeSelector nodeSelector;
    private List<DeviceTaint> taints;

    public BasicDevice() {
        // no-op
    }

    public BasicDevice(final Boolean allNodes,
                       final Boolean allowMultipleAllocations,
                       final JsonObject attributes,
                       final List<String> bindingConditions,
                       final List<String> bindingFailureConditions,
                       final Boolean bindsToNode,
                       final JsonObject capacity,
                       final List<DeviceCounterConsumption> consumesCounters,
                       final String nodeName,
                       final NodeSelector nodeSelector,
                       final List<DeviceTaint> taints) {
        this.allNodes = allNodes;
        this.allowMultipleAllocations = allowMultipleAllocations;
        this.attributes = attributes;
        this.bindingConditions = bindingConditions;
        this.bindingFailureConditions = bindingFailureConditions;
        this.bindsToNode = bindsToNode;
        this.capacity = capacity;
        this.consumesCounters = consumesCounters;
        this.nodeName = nodeName;
        this.nodeSelector = nodeSelector;
        this.taints = taints;
    }

    public Boolean getAllNodes() {
        return allNodes;
    }

    public void setAllNodes(final Boolean allNodes) {
        this.allNodes = allNodes;
    }

    public Boolean getAllowMultipleAllocations() {
        return allowMultipleAllocations;
    }

    public void setAllowMultipleAllocations(final Boolean allowMultipleAllocations) {
        this.allowMultipleAllocations = allowMultipleAllocations;
    }

    public JsonObject getAttributes() {
        return attributes;
    }

    public void setAttributes(final JsonObject attributes) {
        this.attributes = attributes;
    }

    public List<String> getBindingConditions() {
        return bindingConditions;
    }

    public void setBindingConditions(final List<String> bindingConditions) {
        this.bindingConditions = bindingConditions;
    }

    public List<String> getBindingFailureConditions() {
        return bindingFailureConditions;
    }

    public void setBindingFailureConditions(final List<String> bindingFailureConditions) {
        this.bindingFailureConditions = bindingFailureConditions;
    }

    public Boolean getBindsToNode() {
        return bindsToNode;
    }

    public void setBindsToNode(final Boolean bindsToNode) {
        this.bindsToNode = bindsToNode;
    }

    public JsonObject getCapacity() {
        return capacity;
    }

    public void setCapacity(final JsonObject capacity) {
        this.capacity = capacity;
    }

    public List<DeviceCounterConsumption> getConsumesCounters() {
        return consumesCounters;
    }

    public void setConsumesCounters(final List<DeviceCounterConsumption> consumesCounters) {
        this.consumesCounters = consumesCounters;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public NodeSelector getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public List<DeviceTaint> getTaints() {
        return taints;
    }

    public void setTaints(final List<DeviceTaint> taints) {
        this.taints = taints;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allNodes,
                allowMultipleAllocations,
                attributes,
                bindingConditions,
                bindingFailureConditions,
                bindsToNode,
                capacity,
                consumesCounters,
                nodeName,
                nodeSelector,
                taints);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof BasicDevice)) {
            return false;
        }
        final BasicDevice __otherCasted = (BasicDevice) __other;
        return Objects.equals(allNodes, __otherCasted.allNodes) &&
            Objects.equals(allowMultipleAllocations, __otherCasted.allowMultipleAllocations) &&
            Objects.equals(attributes, __otherCasted.attributes) &&
            Objects.equals(bindingConditions, __otherCasted.bindingConditions) &&
            Objects.equals(bindingFailureConditions, __otherCasted.bindingFailureConditions) &&
            Objects.equals(bindsToNode, __otherCasted.bindsToNode) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(consumesCounters, __otherCasted.consumesCounters) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(taints, __otherCasted.taints);
    }

    public BasicDevice allNodes(final Boolean allNodes) {
        this.allNodes = allNodes;
        return this;
    }

    public BasicDevice allowMultipleAllocations(final Boolean allowMultipleAllocations) {
        this.allowMultipleAllocations = allowMultipleAllocations;
        return this;
    }

    public BasicDevice attributes(final JsonObject attributes) {
        this.attributes = attributes;
        return this;
    }

    public BasicDevice bindingConditions(final List<String> bindingConditions) {
        this.bindingConditions = bindingConditions;
        return this;
    }

    public BasicDevice bindingFailureConditions(final List<String> bindingFailureConditions) {
        this.bindingFailureConditions = bindingFailureConditions;
        return this;
    }

    public BasicDevice bindsToNode(final Boolean bindsToNode) {
        this.bindsToNode = bindsToNode;
        return this;
    }

    public BasicDevice capacity(final JsonObject capacity) {
        this.capacity = capacity;
        return this;
    }

    public BasicDevice consumesCounters(final List<DeviceCounterConsumption> consumesCounters) {
        this.consumesCounters = consumesCounters;
        return this;
    }

    public BasicDevice nodeName(final String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public BasicDevice nodeSelector(final NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public BasicDevice taints(final List<DeviceTaint> taints) {
        this.taints = taints;
        return this;
    }

    @Override
    public BasicDevice validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (allNodes != null ? "\"allNodes\":" + allNodes : ""),
                    (allowMultipleAllocations != null ? "\"allowMultipleAllocations\":" + allowMultipleAllocations : ""),
                    (attributes != null ? "\"attributes\":" + attributes : ""),
                    (bindingConditions != null ? "\"bindingConditions\":" + bindingConditions.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (bindingFailureConditions != null ? "\"bindingFailureConditions\":" + bindingFailureConditions.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (bindsToNode != null ? "\"bindsToNode\":" + bindsToNode : ""),
                    (capacity != null ? "\"capacity\":" + capacity : ""),
                    (consumesCounters != null ? "\"consumesCounters\":" + consumesCounters.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (nodeName != null ? "\"nodeName\":\"" +  JsonStrings.escapeJson(nodeName) + "\"" : ""),
                    (nodeSelector != null ? "\"nodeSelector\":" + nodeSelector.asJson() : ""),
                    (taints != null ? "\"taints\":" + taints.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
