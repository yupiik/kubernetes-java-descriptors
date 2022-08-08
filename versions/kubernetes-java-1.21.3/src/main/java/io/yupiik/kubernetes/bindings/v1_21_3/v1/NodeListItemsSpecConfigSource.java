package io.yupiik.kubernetes.bindings.v1_21_3.v1;

import java.util.Objects;

public class NodeListItemsSpecConfigSource {
    private NodeListItemsSpecConfigSourceConfigMap configMap;

    public NodeListItemsSpecConfigSource() {
        // no-op
    }

    public NodeListItemsSpecConfigSource(final NodeListItemsSpecConfigSourceConfigMap configMap) {
        // no-op
    }

    public NodeListItemsSpecConfigSourceConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final NodeListItemsSpecConfigSourceConfigMap configMap) {
        this.configMap = configMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeListItemsSpecConfigSource)) {
            return false;
        }
        final NodeListItemsSpecConfigSource __otherCasted = (NodeListItemsSpecConfigSource) __other;
        return Objects.equals(configMap, __otherCasted.configMap);
    }
}
