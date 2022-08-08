package io.yupiik.kubernetes.bindings.v1_12_0;

import java.util.Objects;

public class NodeStatusConfigAssigned {
    private NodeStatusConfigAssignedConfigMap configMap;

    public NodeStatusConfigAssigned() {
        // no-op
    }

    public NodeStatusConfigAssigned(final NodeStatusConfigAssignedConfigMap configMap) {
        // no-op
    }

    public NodeStatusConfigAssignedConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final NodeStatusConfigAssignedConfigMap configMap) {
        this.configMap = configMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeStatusConfigAssigned)) {
            return false;
        }
        final NodeStatusConfigAssigned __otherCasted = (NodeStatusConfigAssigned) __other;
        return Objects.equals(configMap, __otherCasted.configMap);
    }
}
