package io.yupiik.kubernetes.bindings.v1_15_11.v1beta1;

import java.util.List;
import java.util.Objects;

public class ClusterRoleBindingListItemsMetadataInitializers {
    private List<ClusterRoleBindingListItemsMetadataInitializersPending> pending;
    private ClusterRoleBindingListItemsMetadataInitializersResult result;

    public ClusterRoleBindingListItemsMetadataInitializers() {
        // no-op
    }

    public ClusterRoleBindingListItemsMetadataInitializers(final List<ClusterRoleBindingListItemsMetadataInitializersPending> pending,
                                                           final ClusterRoleBindingListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<ClusterRoleBindingListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ClusterRoleBindingListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ClusterRoleBindingListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ClusterRoleBindingListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof ClusterRoleBindingListItemsMetadataInitializers)) {
            return false;
        }
        final ClusterRoleBindingListItemsMetadataInitializers __otherCasted = (ClusterRoleBindingListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
