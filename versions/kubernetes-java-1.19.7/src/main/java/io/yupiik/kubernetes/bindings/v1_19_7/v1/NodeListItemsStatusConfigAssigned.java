package io.yupiik.kubernetes.bindings.v1_19_7.v1;

import java.util.Objects;

public class NodeListItemsStatusConfigAssigned {
    private NodeListItemsStatusConfigAssignedConfigMap configMap;

    public NodeListItemsStatusConfigAssigned() {
        // no-op
    }

    public NodeListItemsStatusConfigAssigned(final NodeListItemsStatusConfigAssignedConfigMap configMap) {
        // no-op
    }

    public NodeListItemsStatusConfigAssignedConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final NodeListItemsStatusConfigAssignedConfigMap configMap) {
        this.configMap = configMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeListItemsStatusConfigAssigned)) {
            return false;
        }
        final NodeListItemsStatusConfigAssigned __otherCasted = (NodeListItemsStatusConfigAssigned) __other;
        return Objects.equals(configMap, __otherCasted.configMap);
    }
}
