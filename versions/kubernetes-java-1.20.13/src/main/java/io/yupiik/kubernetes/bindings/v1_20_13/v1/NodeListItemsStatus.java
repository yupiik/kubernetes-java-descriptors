package io.yupiik.kubernetes.bindings.v1_20_13.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NodeListItemsStatus {
    private List<NodeListItemsStatusAddresses> addresses;
    private Map<String, String> allocatable;
    private Map<String, String> capacity;
    private List<NodeListItemsStatusConditions> conditions;
    private NodeListItemsStatusConfig config;
    private NodeListItemsStatusDaemonEndpoints daemonEndpoints;
    private List<NodeListItemsStatusImages> images;
    private NodeListItemsStatusNodeInfo nodeInfo;
    private String phase;
    private List<NodeListItemsStatusVolumesAttached> volumesAttached;
    private List<String> volumesInUse;

    public NodeListItemsStatus() {
        // no-op
    }

    public NodeListItemsStatus(final List<NodeListItemsStatusAddresses> addresses,
                               final Map<String, String> allocatable,
                               final Map<String, String> capacity,
                               final List<NodeListItemsStatusConditions> conditions,
                               final NodeListItemsStatusConfig config,
                               final NodeListItemsStatusDaemonEndpoints daemonEndpoints,
                               final List<NodeListItemsStatusImages> images,
                               final NodeListItemsStatusNodeInfo nodeInfo,
                               final String phase,
                               final List<NodeListItemsStatusVolumesAttached> volumesAttached,
                               final List<String> volumesInUse) {
        // no-op
    }

    public List<NodeListItemsStatusAddresses> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<NodeListItemsStatusAddresses> addresses) {
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

    public List<NodeListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<NodeListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public NodeListItemsStatusConfig getConfig() {
        return config;
    }

    public void setConfig(final NodeListItemsStatusConfig config) {
        this.config = config;
    }

    public NodeListItemsStatusDaemonEndpoints getDaemonEndpoints() {
        return daemonEndpoints;
    }

    public void setDaemonEndpoints(final NodeListItemsStatusDaemonEndpoints daemonEndpoints) {
        this.daemonEndpoints = daemonEndpoints;
    }

    public List<NodeListItemsStatusImages> getImages() {
        return images;
    }

    public void setImages(final List<NodeListItemsStatusImages> images) {
        this.images = images;
    }

    public NodeListItemsStatusNodeInfo getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(final NodeListItemsStatusNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
    }

    public List<NodeListItemsStatusVolumesAttached> getVolumesAttached() {
        return volumesAttached;
    }

    public void setVolumesAttached(final List<NodeListItemsStatusVolumesAttached> volumesAttached) {
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
        if (!(__other instanceof NodeListItemsStatus)) {
            return false;
        }
        final NodeListItemsStatus __otherCasted = (NodeListItemsStatus) __other;
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
