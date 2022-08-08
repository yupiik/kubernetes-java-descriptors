package io.yupiik.kubernetes.bindings.v1_17_1;

import java.util.Objects;

public class NodeListItemsStatusConfigActive {
    private NodeListItemsStatusConfigActiveConfigMap configMap;

    public NodeListItemsStatusConfigActive() {
        // no-op
    }

    public NodeListItemsStatusConfigActive(final NodeListItemsStatusConfigActiveConfigMap configMap) {
        // no-op
    }

    public NodeListItemsStatusConfigActiveConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final NodeListItemsStatusConfigActiveConfigMap configMap) {
        this.configMap = configMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeListItemsStatusConfigActive)) {
            return false;
        }
        final NodeListItemsStatusConfigActive __otherCasted = (NodeListItemsStatusConfigActive) __other;
        return Objects.equals(configMap, __otherCasted.configMap);
    }
}
