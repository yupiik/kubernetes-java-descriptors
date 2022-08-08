package io.yupiik.kubernetes.bindings.v1_22_5.v1;

import java.util.Objects;

public class ReplicaSetListItems {
    private String apiVersion;
    private String kind;
    private ReplicaSetListItemsMetadata metadata;
    private ReplicaSetListItemsSpec spec;
    private ReplicaSetListItemsStatus status;

    public ReplicaSetListItems() {
        // no-op
    }

    public ReplicaSetListItems(final String apiVersion,
                               final String kind,
                               final ReplicaSetListItemsMetadata metadata,
                               final ReplicaSetListItemsSpec spec,
                               final ReplicaSetListItemsStatus status) {
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

    public ReplicaSetListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicaSetListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public ReplicaSetListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicaSetListItemsSpec spec) {
        this.spec = spec;
    }

    public ReplicaSetListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final ReplicaSetListItemsStatus status) {
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
        if (!(__other instanceof ReplicaSetListItems)) {
            return false;
        }
        final ReplicaSetListItems __otherCasted = (ReplicaSetListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
