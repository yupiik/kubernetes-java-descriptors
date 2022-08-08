package io.yupiik.kubernetes.bindings.v1_10_0.v1;

import io.yupiik.kubernetes.bindings.v1_10_0.Validable;
import io.yupiik.kubernetes.bindings.v1_10_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NodeConfigSource implements Validable<NodeConfigSource> {
    private String apiVersion;
    private ObjectReference configMapRef;
    private String kind;

    public NodeConfigSource() {
        // no-op
    }

    public NodeConfigSource(final String apiVersion,
                            final ObjectReference configMapRef,
                            final String kind) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ObjectReference getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ObjectReference configMapRef) {
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

    public NodeConfigSource apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public NodeConfigSource configMapRef(final ObjectReference configMapRef) {
        this.configMapRef = configMapRef;
        return this;
    }

    public NodeConfigSource kind(final String kind) {
        this.kind = kind;
        return this;
    }

    @Override
    public NodeConfigSource validate() {
        return this;
    }
}
