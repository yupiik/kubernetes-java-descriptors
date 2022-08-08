package io.yupiik.kubernetes.bindings.v1_14_4.v1beta1;

import java.util.List;
import java.util.Objects;

public class CSINodeSpecDrivers {
    private String name;
    private String nodeID;
    private List<String> topologyKeys;

    public CSINodeSpecDrivers() {
        // no-op
    }

    public CSINodeSpecDrivers(final String name,
                              final String nodeID,
                              final List<String> topologyKeys) {
        // no-op
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
                name,
                nodeID,
                topologyKeys);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSINodeSpecDrivers)) {
            return false;
        }
        final CSINodeSpecDrivers __otherCasted = (CSINodeSpecDrivers) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nodeID, __otherCasted.nodeID) &&
            Objects.equals(topologyKeys, __otherCasted.topologyKeys);
    }
}
