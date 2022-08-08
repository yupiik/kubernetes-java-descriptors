package io.yupiik.kubernetes.bindings.v1_20_5.v1beta1;

import java.util.Objects;

public class RuntimeClassListItems {
    private String apiVersion;
    private String handler;
    private String kind;
    private RuntimeClassListItemsMetadata metadata;
    private RuntimeClassListItemsOverhead overhead;
    private RuntimeClassListItemsScheduling scheduling;

    public RuntimeClassListItems() {
        // no-op
    }

    public RuntimeClassListItems(final String apiVersion,
                                 final String handler,
                                 final String kind,
                                 final RuntimeClassListItemsMetadata metadata,
                                 final RuntimeClassListItemsOverhead overhead,
                                 final RuntimeClassListItemsScheduling scheduling) {
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

    public RuntimeClassListItemsOverhead getOverhead() {
        return overhead;
    }

    public void setOverhead(final RuntimeClassListItemsOverhead overhead) {
        this.overhead = overhead;
    }

    public RuntimeClassListItemsScheduling getScheduling() {
        return scheduling;
    }

    public void setScheduling(final RuntimeClassListItemsScheduling scheduling) {
        this.scheduling = scheduling;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                handler,
                kind,
                metadata,
                overhead,
                scheduling);
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
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(overhead, __otherCasted.overhead) &&
            Objects.equals(scheduling, __otherCasted.scheduling);
    }
}
