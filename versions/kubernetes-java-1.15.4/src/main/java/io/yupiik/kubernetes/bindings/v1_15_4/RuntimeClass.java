package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.Objects;

public class RuntimeClass {
    private String apiVersion;
    private String handler;
    private String kind;
    private RuntimeClassMetadata metadata;

    public RuntimeClass() {
        // no-op
    }

    public RuntimeClass(final String apiVersion,
                        final String handler,
                        final String kind,
                        final RuntimeClassMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(final String handler) {
        this.handler = handler;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public RuntimeClassMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final RuntimeClassMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                handler,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClass)) {
            return false;
        }
        final RuntimeClass __otherCasted = (RuntimeClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(handler, __otherCasted.handler) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
