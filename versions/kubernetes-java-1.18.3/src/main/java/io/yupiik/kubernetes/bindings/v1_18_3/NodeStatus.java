package io.yupiik.kubernetes.bindings.v1_18_3;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NodeStatus {
    private List<NodeStatusAddresses> addresses;
    private Map<String, String> allocatable;
    private Map<String, String> capacity;
    private List<NodeStatusConditions> conditions;
    private NodeStatusConfig config;
    private NodeStatusDaemonEndpoints daemonEndpoints;
    private List<NodeStatusImages> images;
    private NodeStatusNodeInfo nodeInfo;
    private String phase;
    private List<NodeStatusVolumesAttached> volumesAttached;
    private List<String> volumesInUse;

    public NodeStatus() {
        // no-op
    }

    public NodeStatus(final List<NodeStatusAddresses> addresses,
                      final Map<String, String> allocatable,
                      final Map<String, String> capacity,
                      final List<NodeStatusConditions> conditions,
                      final NodeStatusConfig config,
                      final NodeStatusDaemonEndpoints daemonEndpoints,
                      final List<NodeStatusImages> images,
                      final NodeStatusNodeInfo nodeInfo,
                      final String phase,
                      final List<NodeStatusVolumesAttached> volumesAttached,
                      final List<String> volumesInUse) {
        // no-op
    }

    public List<NodeStatusAddresses> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<NodeStatusAddresses> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getAllocatable() {
        return allocatable;
    }

    public void setAllocatable(final Map<String, String> allocatable) {
        this.allocatable = allocatable;
    }

    public Map<String, String> getCapacity() {
        return capacity;
    }

    public void setCapacity(final Map<String, String> capacity) {
        this.capacity = capacity;
    }

    public List<NodeStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<NodeStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public NodeStatusConfig getConfig() {
        return config;
    }

    public void setConfig(final NodeStatusConfig config) {
        this.config = config;
    }

    public NodeStatusDaemonEndpoints getDaemonEndpoints() {
        return daemonEndpoints;
    }

    public void setDaemonEndpoints(final NodeStatusDaemonEndpoints daemonEndpoints) {
        this.daemonEndpoints = daemonEndpoints;
    }

    public List<NodeStatusImages> getImages() {
        return images;
    }

    public void setImages(final List<NodeStatusImages> images) {
        this.images = images;
    }

    public NodeStatusNodeInfo getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(final NodeStatusNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
    }

    public List<NodeStatusVolumesAttached> getVolumesAttached() {
        return volumesAttached;
    }

    public void setVolumesAttached(final List<NodeStatusVolumesAttached> volumesAttached) {
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
}
