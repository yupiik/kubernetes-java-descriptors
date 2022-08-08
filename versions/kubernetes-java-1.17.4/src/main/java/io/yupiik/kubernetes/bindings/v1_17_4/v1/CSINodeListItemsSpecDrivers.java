package io.yupiik.kubernetes.bindings.v1_17_4.v1;

import java.util.List;
import java.util.Objects;

public class CSINodeListItemsSpecDrivers {
    private CSINodeListItemsSpecDriversAllocatable allocatable;
    private String name;
    private String nodeID;
    private List<String> topologyKeys;

    public CSINodeListItemsSpecDrivers() {
        // no-op
    }

    public CSINodeListItemsSpecDrivers(final CSINodeListItemsSpecDriversAllocatable allocatable,
                                       final String name,
                                       final String nodeID,
                                       final List<String> topologyKeys) {
        // no-op
    }

    public CSINodeListItemsSpecDriversAllocatable getAllocatable() {
        return allocatable;
    }

    public void setAllocatable(final CSINodeListItemsSpecDriversAllocatable allocatable) {
        this.allocatable = allocatable;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(final String nodeID) {
        this.nodeID = nodeID;
    }

    public List<String> getTopologyKeys() {
        return topologyKeys;
    }

    public void setTopologyKeys(final List<String> topologyKeys) {
        this.topologyKeys = topologyKeys;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allocatable,
                name,
                nodeID,
                topologyKeys);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSINodeListItemsSpecDrivers)) {
            return false;
        }
        final CSINodeListItemsSpecDrivers __otherCasted = (CSINodeListItemsSpecDrivers) __other;
        return Objects.equals(allocatable, __otherCasted.allocatable) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nodeID, __otherCasted.nodeID) &&
            Objects.equals(topologyKeys, __otherCasted.topologyKeys);
    }
}
