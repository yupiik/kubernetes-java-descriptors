package io.yupiik.kubernetes.bindings.v1_10_5.v1;

import java.util.Objects;

public class NodeConfigSource {
    private String apiVersion;
    private NodeConfigSourceConfigMapRef configMapRef;
    private String kind;

    public NodeConfigSource() {
        // no-op
    }

    public NodeConfigSource(final String apiVersion,
                            final NodeConfigSourceConfigMapRef configMapRef,
                            final String kind) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public NodeConfigSourceConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final NodeConfigSourceConfigMapRef configMapRef) {
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
        if (!(__other instanceof NodeConfigSource)) {
            return false;
        }
        final NodeConfigSource __otherCasted = (NodeConfigSource) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(kind, __otherCasted.kind);
    }
}
