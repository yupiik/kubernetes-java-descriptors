package io.yupiik.kubernetes.bindings.v1_15_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class ClusterRoleBindingMetadataInitializers {
    private List<ClusterRoleBindingMetadataInitializersPending> pending;
    private ClusterRoleBindingMetadataInitializersResult result;

    public ClusterRoleBindingMetadataInitializers() {
        // no-op
    }

    public ClusterRoleBindingMetadataInitializers(final List<ClusterRoleBindingMetadataInitializersPending> pending,
                                                  final ClusterRoleBindingMetadataInitializersResult result) {
        // no-op
    }

    public List<ClusterRoleBindingMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ClusterRoleBindingMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ClusterRoleBindingMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ClusterRoleBindingMetadataInitializersResult result) {
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
        if (!(__other instanceof ClusterRoleBindingMetadataInitializers)) {
            return false;
        }
        final ClusterRoleBindingMetadataInitializers __otherCasted = (ClusterRoleBindingMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
