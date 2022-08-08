package io.yupiik.kubernetes.bindings.v1_15_12.v1alpha1;

import java.util.List;
import java.util.Objects;

public class ClusterRoleListItemsMetadataInitializers {
    private List<ClusterRoleListItemsMetadataInitializersPending> pending;
    private ClusterRoleListItemsMetadataInitializersResult result;

    public ClusterRoleListItemsMetadataInitializers() {
        // no-op
    }

    public ClusterRoleListItemsMetadataInitializers(final List<ClusterRoleListItemsMetadataInitializersPending> pending,
                                                    final ClusterRoleListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<ClusterRoleListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ClusterRoleListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ClusterRoleListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ClusterRoleListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof ClusterRoleListItemsMetadataInitializers)) {
            return false;
        }
        final ClusterRoleListItemsMetadataInitializers __otherCasted = (ClusterRoleListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
