package io.yupiik.kubernetes.bindings.v1_15_9.v1beta1;

import java.util.Objects;

public class RuntimeClassListItems {
    private String apiVersion;
    private String handler;
    private String kind;
    private RuntimeClassListItemsMetadata metadata;

    public RuntimeClassListItems() {
        // no-op
    }

    public RuntimeClassListItems(final String apiVersion,
                                 final String handler,
                                 final String kind,
                                 final RuntimeClassListItemsMetadata metadata) {
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

    public RuntimeClassListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final RuntimeClassListItemsMetadata metadata) {
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
        if (!(__other instanceof RuntimeClassListItems)) {
            return false;
        }
        final RuntimeClassListItems __otherCasted = (RuntimeClassListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(handler, __otherCasted.handler) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
