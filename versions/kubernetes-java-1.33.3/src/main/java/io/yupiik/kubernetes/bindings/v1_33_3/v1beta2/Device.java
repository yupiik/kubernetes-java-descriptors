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
package io.yupiik.kubernetes.bindings.v1_33_3.v1beta2;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import io.yupiik.kubernetes.bindings.v1_33_3.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Device implements Validable<Device>, Exportable {
    private Boolean allNodes;
    private JsonObject attributes;
    private JsonObject capacity;
    private List<DeviceCounterConsumption> consumesCounters;
    private String name;
    private String nodeName;
    private NodeSelector nodeSelector;
    private List<DeviceTaint> taints;

    public Device() {
        // no-op
    }

    public Device(final Boolean allNodes,
                  final JsonObject attributes,
                  final JsonObject capacity,
                  final List<DeviceCounterConsumption> consumesCounters,
                  final String name,
                  final String nodeName,
                  final NodeSelector nodeSelector,
                  final List<DeviceTaint> taints) {
        this.allNodes = allNodes;
        this.attributes = attributes;
        this.capacity = capacity;
        this.consumesCounters = consumesCounters;
        this.name = name;
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

    public JsonObject getAttributes() {
        return attributes;
    }

    public void setAttributes(final JsonObject attributes) {
        this.attributes = attributes;
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

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
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
                attributes,
                capacity,
                consumesCounters,
                name,
                nodeName,
                nodeSelector,
                taints);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Device)) {
            return false;
        }
        final Device __otherCasted = (Device) __other;
        return Objects.equals(allNodes, __otherCasted.allNodes) &&
            Objects.equals(attributes, __otherCasted.attributes) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(consumesCounters, __otherCasted.consumesCounters) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(taints, __otherCasted.taints);
    }

    public Device allNodes(final Boolean allNodes) {
        this.allNodes = allNodes;
        return this;
    }

    public Device attributes(final JsonObject attributes) {
        this.attributes = attributes;
        return this;
    }

    public Device capacity(final JsonObject capacity) {
        this.capacity = capacity;
        return this;
    }

    public Device consumesCounters(final List<DeviceCounterConsumption> consumesCounters) {
        this.consumesCounters = consumesCounters;
        return this;
    }

    public Device name(final String name) {
        this.name = name;
        return this;
    }

    public Device nodeName(final String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public Device nodeSelector(final NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public Device taints(final List<DeviceTaint> taints) {
        this.taints = taints;
        return this;
    }

    @Override
    public Device validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (allNodes != null ? "\"allNodes\":" + allNodes : ""),
                    (attributes != null ? "\"attributes\":" + attributes : ""),
                    (capacity != null ? "\"capacity\":" + capacity : ""),
                    (consumesCounters != null ? "\"consumesCounters\":" + consumesCounters.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (nodeName != null ? "\"nodeName\":\"" +  JsonStrings.escapeJson(nodeName) + "\"" : ""),
                    (nodeSelector != null ? "\"nodeSelector\":" + nodeSelector.asJson() : ""),
                    (taints != null ? "\"taints\":" + taints.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
