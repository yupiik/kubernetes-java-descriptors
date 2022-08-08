package io.yupiik.kubernetes.bindings.v1_14_8.v1beta1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateMetadataInitializers {
    private List<DeploymentSpecTemplateMetadataInitializersPending> pending;
    private DeploymentSpecTemplateMetadataInitializersResult result;

    public DeploymentSpecTemplateMetadataInitializers() {
        // no-op
    }

    public DeploymentSpecTemplateMetadataInitializers(final List<DeploymentSpecTemplateMetadataInitializersPending> pending,
                                                      final DeploymentSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<DeploymentSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<DeploymentSpecTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public DeploymentSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final DeploymentSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof DeploymentSpecTemplateMetadataInitializers)) {
            return false;
        }
        final DeploymentSpecTemplateMetadataInitializers __otherCasted = (DeploymentSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
