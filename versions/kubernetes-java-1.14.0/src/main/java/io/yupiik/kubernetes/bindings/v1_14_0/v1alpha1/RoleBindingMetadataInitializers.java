package io.yupiik.kubernetes.bindings.v1_14_0.v1alpha1;

import java.util.List;
import java.util.Objects;

public class RoleBindingMetadataInitializers {
    private List<RoleBindingMetadataInitializersPending> pending;
    private RoleBindingMetadataInitializersResult result;

    public RoleBindingMetadataInitializers() {
        // no-op
    }

    public RoleBindingMetadataInitializers(final List<RoleBindingMetadataInitializersPending> pending,
                                           final RoleBindingMetadataInitializersResult result) {
        // no-op
    }

    public List<RoleBindingMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<RoleBindingMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public RoleBindingMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final RoleBindingMetadataInitializersResult result) {
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
        if (!(__other instanceof RoleBindingMetadataInitializers)) {
            return false;
        }
        final RoleBindingMetadataInitializers __otherCasted = (RoleBindingMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
