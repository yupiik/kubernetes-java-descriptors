package io.yupiik.kubernetes.bindings.v1_15_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_9.Validable;
import io.yupiik.kubernetes.bindings.v1_15_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CSINodeDriver implements Validable<CSINodeDriver> {
    private String name;
    private String nodeID;
    private List<String> topologyKeys;

    public CSINodeDriver() {
        // no-op
    }

    public CSINodeDriver(final String name,
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
        if (!(__other instanceof CSINodeDriver)) {
            return false;
        }
        final CSINodeDriver __otherCasted = (CSINodeDriver) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nodeID, __otherCasted.nodeID) &&
            Objects.equals(topologyKeys, __otherCasted.topologyKeys);
    }

    public CSINodeDriver name(final String name) {
        this.name = name;
        return this;
    }

    public CSINodeDriver nodeID(final String nodeID) {
        this.nodeID = nodeID;
        return this;
    }

    public CSINodeDriver topologyKeys(final List<String> topologyKeys) {
        this.topologyKeys = topologyKeys;
        return this;
    }

    @Override
    public CSINodeDriver validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (nodeID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "nodeID", "nodeID",
                "Missing 'nodeID' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
