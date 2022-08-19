/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_16_10.v1;

import io.yupiik.kubernetes.bindings.v1_16_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_10.Validable;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeStatus implements Validable<NodeStatus>, Exportable {
    private List<NodeAddress> addresses;
    private JsonObject allocatable;
    private JsonObject capacity;
    private List<NodeCondition> conditions;
    private NodeConfigStatus config;
    private NodeDaemonEndpoints daemonEndpoints;
    private List<ContainerImage> images;
    private NodeSystemInfo nodeInfo;
    private String phase;
    private List<AttachedVolume> volumesAttached;
    private List<String> volumesInUse;

    public NodeStatus() {
        // no-op
    }

    public NodeStatus(final List<NodeAddress> addresses,
                      final JsonObject allocatable,
                      final JsonObject capacity,
                      final List<NodeCondition> conditions,
                      final NodeConfigStatus config,
                      final NodeDaemonEndpoints daemonEndpoints,
                      final List<ContainerImage> images,
                      final NodeSystemInfo nodeInfo,
                      final String phase,
                      final List<AttachedVolume> volumesAttached,
                      final List<String> volumesInUse) {
        this.addresses = addresses;
        this.allocatable = allocatable;
        this.capacity = capacity;
        this.conditions = conditions;
        this.config = config;
        this.daemonEndpoints = daemonEndpoints;
        this.images = images;
        this.nodeInfo = nodeInfo;
        this.phase = phase;
        this.volumesAttached = volumesAttached;
        this.volumesInUse = volumesInUse;
    }

    public List<NodeAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<NodeAddress> addresses) {
        this.addresses = addresses;
    }

    public JsonObject getAllocatable() {
        return allocatable;
    }

    public void setAllocatable(final JsonObject allocatable) {
        this.allocatable = allocatable;
    }

    public JsonObject getCapacity() {
        return capacity;
    }

    public void setCapacity(final JsonObject capacity) {
        this.capacity = capacity;
    }

    public List<NodeCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<NodeCondition> conditions) {
        this.conditions = conditions;
    }

    public NodeConfigStatus getConfig() {
        return config;
    }

    public void setConfig(final NodeConfigStatus config) {
        this.config = config;
    }

    public NodeDaemonEndpoints getDaemonEndpoints() {
        return daemonEndpoints;
    }

    public void setDaemonEndpoints(final NodeDaemonEndpoints daemonEndpoints) {
        this.daemonEndpoints = daemonEndpoints;
    }

    public List<ContainerImage> getImages() {
        return images;
    }

    public void setImages(final List<ContainerImage> images) {
        this.images = images;
    }

    public NodeSystemInfo getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(final NodeSystemInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
    }

    public List<AttachedVolume> getVolumesAttached() {
        return volumesAttached;
    }

    public void setVolumesAttached(final List<AttachedVolume> volumesAttached) {
        this.volumesAttached = volumesAttached;
    }

    public List<String> getVolumesInUse() {
        return volumesInUse;
    }

    public void setVolumesInUse(final List<String> volumesInUse) {
        this.volumesInUse = volumesInUse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                addresses,
                allocatable,
                capacity,
                conditions,
                config,
                daemonEndpoints,
                images,
                nodeInfo,
                phase,
                volumesAttached,
                volumesInUse);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeStatus)) {
            return false;
        }
        final NodeStatus __otherCasted = (NodeStatus) __other;
        return Objects.equals(addresses, __otherCasted.addresses) &&
            Objects.equals(allocatable, __otherCasted.allocatable) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(config, __otherCasted.config) &&
            Objects.equals(daemonEndpoints, __otherCasted.daemonEndpoints) &&
            Objects.equals(images, __otherCasted.images) &&
            Objects.equals(nodeInfo, __otherCasted.nodeInfo) &&
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(volumesAttached, __otherCasted.volumesAttached) &&
            Objects.equals(volumesInUse, __otherCasted.volumesInUse);
    }

    public NodeStatus addresses(final List<NodeAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public NodeStatus allocatable(final JsonObject allocatable) {
        this.allocatable = allocatable;
        return this;
    }

    public NodeStatus capacity(final JsonObject capacity) {
        this.capacity = capacity;
        return this;
    }

    public NodeStatus conditions(final List<NodeCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public NodeStatus config(final NodeConfigStatus config) {
        this.config = config;
        return this;
    }

    public NodeStatus daemonEndpoints(final NodeDaemonEndpoints daemonEndpoints) {
        this.daemonEndpoints = daemonEndpoints;
        return this;
    }

    public NodeStatus images(final List<ContainerImage> images) {
        this.images = images;
        return this;
    }

    public NodeStatus nodeInfo(final NodeSystemInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    public NodeStatus phase(final String phase) {
        this.phase = phase;
        return this;
    }

    public NodeStatus volumesAttached(final List<AttachedVolume> volumesAttached) {
        this.volumesAttached = volumesAttached;
        return this;
    }

    public NodeStatus volumesInUse(final List<String> volumesInUse) {
        this.volumesInUse = volumesInUse;
        return this;
    }

    @Override
    public NodeStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (addresses != null ? "\"addresses\":" + addresses.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (allocatable != null ? "\"allocatable\":" + allocatable : ""),
                    (capacity != null ? "\"capacity\":" + capacity : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (config != null ? "\"config\":" + config.asJson() : ""),
                    (daemonEndpoints != null ? "\"daemonEndpoints\":" + daemonEndpoints.asJson() : ""),
                    (images != null ? "\"images\":" + images.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (nodeInfo != null ? "\"nodeInfo\":" + nodeInfo.asJson() : ""),
                    (phase != null ? "\"phase\":\"" +  JsonStrings.escapeJson(phase) + "\"" : ""),
                    (volumesAttached != null ? "\"volumesAttached\":" + volumesAttached.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (volumesInUse != null ? "\"volumesInUse\":" + volumesInUse.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
