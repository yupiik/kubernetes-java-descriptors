package io.yupiik.kubernetes.bindings.v1_17_7.v1;

import java.util.Objects;

public class DaemonSetListItems {
    private String apiVersion;
    private String kind;
    private DaemonSetListItemsMetadata metadata;
    private DaemonSetListItemsSpec spec;
    private DaemonSetListItemsStatus status;

    public DaemonSetListItems() {
        // no-op
    }

    public DaemonSetListItems(final String apiVersion,
                              final String kind,
                              final DaemonSetListItemsMetadata metadata,
                              final DaemonSetListItemsSpec spec,
                              final DaemonSetListItemsStatus status) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public DaemonSetListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DaemonSetListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public DaemonSetListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final DaemonSetListItemsSpec spec) {
        this.spec = spec;
    }

    public DaemonSetListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final DaemonSetListItemsStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItems)) {
            return false;
        }
        final DaemonSetListItems __otherCasted = (DaemonSetListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
