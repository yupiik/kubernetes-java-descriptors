package io.yupiik.kubernetes.bindings.v1_14_0.v1beta1;

import java.util.List;
import java.util.Objects;

public class RoleListItemsMetadataInitializers {
    private List<RoleListItemsMetadataInitializersPending> pending;
    private RoleListItemsMetadataInitializersResult result;

    public RoleListItemsMetadataInitializers() {
        // no-op
    }

    public RoleListItemsMetadataInitializers(final List<RoleListItemsMetadataInitializersPending> pending,
                                             final RoleListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<RoleListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<RoleListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public RoleListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final RoleListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof RoleListItemsMetadataInitializers)) {
            return false;
        }
        final RoleListItemsMetadataInitializers __otherCasted = (RoleListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
