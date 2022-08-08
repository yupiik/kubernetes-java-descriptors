package io.yupiik.kubernetes.bindings.v1_17_8.v1;

import java.util.Objects;

public class NodeSpecConfigSource {
    private NodeSpecConfigSourceConfigMap configMap;

    public NodeSpecConfigSource() {
        // no-op
    }

    public NodeSpecConfigSource(final NodeSpecConfigSourceConfigMap configMap) {
        // no-op
    }

    public NodeSpecConfigSourceConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final NodeSpecConfigSourceConfigMap configMap) {
        this.configMap = configMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeSpecConfigSource)) {
            return false;
        }
        final NodeSpecConfigSource __otherCasted = (NodeSpecConfigSource) __other;
        return Objects.equals(configMap, __otherCasted.configMap);
    }
}
