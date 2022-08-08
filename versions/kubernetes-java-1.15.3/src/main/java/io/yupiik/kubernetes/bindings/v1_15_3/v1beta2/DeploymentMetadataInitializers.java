package io.yupiik.kubernetes.bindings.v1_15_3.v1beta2;

import java.util.List;
import java.util.Objects;

public class DeploymentMetadataInitializers {
    private List<DeploymentMetadataInitializersPending> pending;
    private DeploymentMetadataInitializersResult result;

    public DeploymentMetadataInitializers() {
        // no-op
    }

    public DeploymentMetadataInitializers(final List<DeploymentMetadataInitializersPending> pending,
                                          final DeploymentMetadataInitializersResult result) {
        // no-op
    }

    public List<DeploymentMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<DeploymentMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public DeploymentMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final DeploymentMetadataInitializersResult result) {
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
        if (!(__other instanceof DeploymentMetadataInitializers)) {
            return false;
        }
        final DeploymentMetadataInitializers __otherCasted = (DeploymentMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
