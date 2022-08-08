package io.yupiik.kubernetes.bindings.v1_14_1.v1;

import java.util.List;
import java.util.Objects;

public class ClusterRoleMetadataInitializers {
    private List<ClusterRoleMetadataInitializersPending> pending;
    private ClusterRoleMetadataInitializersResult result;

    public ClusterRoleMetadataInitializers() {
        // no-op
    }

    public ClusterRoleMetadataInitializers(final List<ClusterRoleMetadataInitializersPending> pending,
                                           final ClusterRoleMetadataInitializersResult result) {
        // no-op
    }

    public List<ClusterRoleMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ClusterRoleMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ClusterRoleMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ClusterRoleMetadataInitializersResult result) {
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
        if (!(__other instanceof ClusterRoleMetadataInitializers)) {
            return false;
        }
        final ClusterRoleMetadataInitializers __otherCasted = (ClusterRoleMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
