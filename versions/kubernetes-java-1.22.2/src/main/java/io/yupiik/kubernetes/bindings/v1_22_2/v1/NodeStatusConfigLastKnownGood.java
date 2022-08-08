package io.yupiik.kubernetes.bindings.v1_22_2.v1;

import java.util.Objects;

public class NodeStatusConfigLastKnownGood {
    private NodeStatusConfigLastKnownGoodConfigMap configMap;

    public NodeStatusConfigLastKnownGood() {
        // no-op
    }

    public NodeStatusConfigLastKnownGood(final NodeStatusConfigLastKnownGoodConfigMap configMap) {
        // no-op
    }

    public NodeStatusConfigLastKnownGoodConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final NodeStatusConfigLastKnownGoodConfigMap configMap) {
        this.configMap = configMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeStatusConfigLastKnownGood)) {
            return false;
        }
        final NodeStatusConfigLastKnownGood __otherCasted = (NodeStatusConfigLastKnownGood) __other;
        return Objects.equals(configMap, __otherCasted.configMap);
    }
}
