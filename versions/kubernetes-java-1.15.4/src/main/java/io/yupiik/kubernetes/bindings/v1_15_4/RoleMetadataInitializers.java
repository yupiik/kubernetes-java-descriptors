package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.List;
import java.util.Objects;

public class RoleMetadataInitializers {
    private List<RoleMetadataInitializersPending> pending;
    private RoleMetadataInitializersResult result;

    public RoleMetadataInitializers() {
        // no-op
    }

    public RoleMetadataInitializers(final List<RoleMetadataInitializersPending> pending,
                                    final RoleMetadataInitializersResult result) {
        // no-op
    }

    public List<RoleMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<RoleMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public RoleMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final RoleMetadataInitializersResult result) {
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
        if (!(__other instanceof RoleMetadataInitializers)) {
            return false;
        }
        final RoleMetadataInitializers __otherCasted = (RoleMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
