package io.yupiik.kubernetes.bindings.v1_9_5;

import java.util.Objects;

public class NodeSpecConfigSource {
    private String apiVersion;
    private NodeSpecConfigSourceConfigMapRef configMapRef;
    private String kind;

    public NodeSpecConfigSource() {
        // no-op
    }

    public NodeSpecConfigSource(final String apiVersion,
                                final NodeSpecConfigSourceConfigMapRef configMapRef,
                                final String kind) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public NodeSpecConfigSourceConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final NodeSpecConfigSourceConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                configMapRef,
                kind);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeSpecConfigSource)) {
            return false;
        }
        final NodeSpecConfigSource __otherCasted = (NodeSpecConfigSource) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(kind, __otherCasted.kind);
    }
}
