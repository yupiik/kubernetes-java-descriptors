package io.yupiik.kubernetes.bindings.v1_26_9.v1;

import io.yupiik.kubernetes.bindings.v1_26_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_9.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeConfigSource implements Validable<NodeConfigSource>, Exportable {
    private ConfigMapNodeConfigSource configMap;

    public NodeConfigSource() {
        // no-op
    }

    public NodeConfigSource(final ConfigMapNodeConfigSource configMap) {
        this.configMap = configMap;
    }

    public ConfigMapNodeConfigSource getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ConfigMapNodeConfigSource configMap) {
        this.configMap = configMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeConfigSource)) {
            return false;
        }
        final NodeConfigSource __otherCasted = (NodeConfigSource) __other;
        return Objects.equals(configMap, __otherCasted.configMap);
    }

    public NodeConfigSource configMap(final ConfigMapNodeConfigSource configMap) {
        this.configMap = configMap;
        return this;
    }

    @Override
    public NodeConfigSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (configMap != null ? "\"configMap\":" + configMap.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
