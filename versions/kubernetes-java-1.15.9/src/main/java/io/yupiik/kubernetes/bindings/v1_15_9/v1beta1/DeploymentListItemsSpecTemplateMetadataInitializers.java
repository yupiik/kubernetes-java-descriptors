package io.yupiik.kubernetes.bindings.v1_15_9.v1beta1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateMetadataInitializers {
    private List<DeploymentListItemsSpecTemplateMetadataInitializersPending> pending;
    private DeploymentListItemsSpecTemplateMetadataInitializersResult result;

    public DeploymentListItemsSpecTemplateMetadataInitializers() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateMetadataInitializers(final List<DeploymentListItemsSpecTemplateMetadataInitializersPending> pending,
                                                               final DeploymentListItemsSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<DeploymentListItemsSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<DeploymentListItemsSpecTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public DeploymentListItemsSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final DeploymentListItemsSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateMetadataInitializers)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateMetadataInitializers __otherCasted = (DeploymentListItemsSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
