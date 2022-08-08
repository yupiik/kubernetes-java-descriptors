package io.yupiik.kubernetes.bindings.v1_21_8;

import java.util.Objects;

public class DeploymentListItems {
    private String apiVersion;
    private String kind;
    private DeploymentListItemsMetadata metadata;
    private DeploymentListItemsSpec spec;
    private DeploymentListItemsStatus status;

    public DeploymentListItems() {
        // no-op
    }

    public DeploymentListItems(final String apiVersion,
                               final String kind,
                               final DeploymentListItemsMetadata metadata,
                               final DeploymentListItemsSpec spec,
                               final DeploymentListItemsStatus status) {
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

    public DeploymentListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DeploymentListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public DeploymentListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final DeploymentListItemsSpec spec) {
        this.spec = spec;
    }

    public DeploymentListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final DeploymentListItemsStatus status) {
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
        if (!(__other instanceof DeploymentListItems)) {
            return false;
        }
        final DeploymentListItems __otherCasted = (DeploymentListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
