package io.yupiik.kubernetes.bindings.v1_23_6;

import java.util.Objects;

public class NodeStatusConfigActive {
    private NodeStatusConfigActiveConfigMap configMap;

    public NodeStatusConfigActive() {
        // no-op
    }

    public NodeStatusConfigActive(final NodeStatusConfigActiveConfigMap configMap) {
        // no-op
    }

    public NodeStatusConfigActiveConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final NodeStatusConfigActiveConfigMap configMap) {
        this.configMap = configMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeStatusConfigActive)) {
            return false;
        }
        final NodeStatusConfigActive __otherCasted = (NodeStatusConfigActive) __other;
        return Objects.equals(configMap, __otherCasted.configMap);
    }
}
