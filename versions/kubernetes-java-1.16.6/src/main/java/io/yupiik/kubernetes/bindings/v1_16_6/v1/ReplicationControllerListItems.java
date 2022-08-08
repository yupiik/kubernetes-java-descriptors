package io.yupiik.kubernetes.bindings.v1_16_6.v1;

import java.util.Objects;

public class ReplicationControllerListItems {
    private String apiVersion;
    private String kind;
    private ReplicationControllerListItemsMetadata metadata;
    private ReplicationControllerListItemsSpec spec;
    private ReplicationControllerListItemsStatus status;

    public ReplicationControllerListItems() {
        // no-op
    }

    public ReplicationControllerListItems(final String apiVersion,
                                          final String kind,
                                          final ReplicationControllerListItemsMetadata metadata,
                                          final ReplicationControllerListItemsSpec spec,
                                          final ReplicationControllerListItemsStatus status) {
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

    public ReplicationControllerListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicationControllerListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public ReplicationControllerListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicationControllerListItemsSpec spec) {
        this.spec = spec;
    }

    public ReplicationControllerListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final ReplicationControllerListItemsStatus status) {
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
        if (!(__other instanceof ReplicationControllerListItems)) {
            return false;
        }
        final ReplicationControllerListItems __otherCasted = (ReplicationControllerListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
