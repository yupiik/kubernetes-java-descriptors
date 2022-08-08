package io.yupiik.kubernetes.bindings.v1_15_9.v1;

import java.util.List;
import java.util.Objects;

public class RoleBindingListItemsMetadataInitializers {
    private List<RoleBindingListItemsMetadataInitializersPending> pending;
    private RoleBindingListItemsMetadataInitializersResult result;

    public RoleBindingListItemsMetadataInitializers() {
        // no-op
    }

    public RoleBindingListItemsMetadataInitializers(final List<RoleBindingListItemsMetadataInitializersPending> pending,
                                                    final RoleBindingListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<RoleBindingListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<RoleBindingListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public RoleBindingListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final RoleBindingListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof RoleBindingListItemsMetadataInitializers)) {
            return false;
        }
        final RoleBindingListItemsMetadataInitializers __otherCasted = (RoleBindingListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
