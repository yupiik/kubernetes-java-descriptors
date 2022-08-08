package io.yupiik.kubernetes.bindings.v1_17_17;

import java.util.Objects;

public class RuntimeClass {
    private String apiVersion;
    private String handler;
    private String kind;
    private RuntimeClassMetadata metadata;
    private RuntimeClassOverhead overhead;
    private RuntimeClassScheduling scheduling;

    public RuntimeClass() {
        // no-op
    }

    public RuntimeClass(final String apiVersion,
                        final String handler,
                        final String kind,
                        final RuntimeClassMetadata metadata,
                        final RuntimeClassOverhead overhead,
                        final RuntimeClassScheduling scheduling) {
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

    public RuntimeClassOverhead getOverhead() {
        return overhead;
    }

    public void setOverhead(final RuntimeClassOverhead overhead) {
        this.overhead = overhead;
    }

    public RuntimeClassScheduling getScheduling() {
        return scheduling;
    }

    public void setScheduling(final RuntimeClassScheduling scheduling) {
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
        if (!(__other instanceof RuntimeClass)) {
            return false;
        }
        final RuntimeClass __otherCasted = (RuntimeClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(handler, __otherCasted.handler) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(overhead, __otherCasted.overhead) &&
            Objects.equals(scheduling, __otherCasted.scheduling);
    }
}
