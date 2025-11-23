package io.yupiik.kubernetes.bindings.v1_33_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_33_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_1.Validable;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class BasicDevice implements Validable<BasicDevice>, Exportable {
    private Boolean allNodes;
    private JsonObject attributes;
    private JsonObject capacity;
    private List<DeviceCounterConsumption> consumesCounters;
    private String nodeName;
    private NodeSelector nodeSelector;
    private List<DeviceTaint> taints;

    public BasicDevice() {
        // no-op
    }

    public BasicDevice(final Boolean allNodes,
                       final JsonObject attributes,
                       final JsonObject capacity,
                       final List<DeviceCounterConsumption> consumesCounters,
                       final String nodeName,
                       final NodeSelector nodeSelector,
                       final List<DeviceTaint> taints) {
        this.allNodes = allNodes;
        this.attributes = attributes;
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
            Objects.equals(attributes, __otherCasted.attributes) &&
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

    public BasicDevice attributes(final JsonObject attributes) {
        this.attributes = attributes;
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
                    (attributes != null ? "\"attributes\":" + attributes : ""),
                    (capacity != null ? "\"capacity\":" + capacity : ""),
                    (consumesCounters != null ? "\"consumesCounters\":" + consumesCounters.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (nodeName != null ? "\"nodeName\":\"" +  JsonStrings.escapeJson(nodeName) + "\"" : ""),
                    (nodeSelector != null ? "\"nodeSelector\":" + nodeSelector.asJson() : ""),
                    (taints != null ? "\"taints\":" + taints.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
