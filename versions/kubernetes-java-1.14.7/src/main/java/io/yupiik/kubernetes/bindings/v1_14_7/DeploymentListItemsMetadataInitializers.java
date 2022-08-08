package io.yupiik.kubernetes.bindings.v1_14_7;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsMetadataInitializers {
    private List<DeploymentListItemsMetadataInitializersPending> pending;
    private DeploymentListItemsMetadataInitializersResult result;

    public DeploymentListItemsMetadataInitializers() {
        // no-op
    }

    public DeploymentListItemsMetadataInitializers(final List<DeploymentListItemsMetadataInitializersPending> pending,
                                                   final DeploymentListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<DeploymentListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<DeploymentListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public DeploymentListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final DeploymentListItemsMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsMetadataInitializers)) {
            return false;
        }
        final DeploymentListItemsMetadataInitializers __otherCasted = (DeploymentListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
