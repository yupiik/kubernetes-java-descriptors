package io.yupiik.kubernetes.bindings.v1_15_11;

import java.util.Objects;

public class NodeListItemsStatusConfigLastKnownGood {
    private NodeListItemsStatusConfigLastKnownGoodConfigMap configMap;

    public NodeListItemsStatusConfigLastKnownGood() {
        // no-op
    }

    public NodeListItemsStatusConfigLastKnownGood(final NodeListItemsStatusConfigLastKnownGoodConfigMap configMap) {
        // no-op
    }

    public NodeListItemsStatusConfigLastKnownGoodConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final NodeListItemsStatusConfigLastKnownGoodConfigMap configMap) {
        this.configMap = configMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeListItemsStatusConfigLastKnownGood)) {
            return false;
        }
        final NodeListItemsStatusConfigLastKnownGood __otherCasted = (NodeListItemsStatusConfigLastKnownGood) __other;
        return Objects.equals(configMap, __otherCasted.configMap);
    }
}
