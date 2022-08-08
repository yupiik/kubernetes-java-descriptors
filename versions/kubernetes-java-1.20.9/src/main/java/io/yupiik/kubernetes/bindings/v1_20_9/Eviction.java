package io.yupiik.kubernetes.bindings.v1_20_9;

import java.util.Objects;

public class Eviction {
    private String apiVersion;
    private EvictionDeleteOptions deleteOptions;
    private String kind;
    private EvictionMetadata metadata;

    public Eviction() {
        // no-op
    }

    public Eviction(final String apiVersion,
                    final EvictionDeleteOptions deleteOptions,
                    final String kind,
                    final EvictionMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public EvictionDeleteOptions getDeleteOptions() {
        return deleteOptions;
    }

    public void setDeleteOptions(final EvictionDeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public EvictionMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final EvictionMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                deleteOptions,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Eviction)) {
            return false;
        }
        final Eviction __otherCasted = (Eviction) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(deleteOptions, __otherCasted.deleteOptions) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
