package io.yupiik.kubernetes.bindings.v1_14_9.v1beta1;

import java.util.List;
import java.util.Objects;

public class RuntimeClassListItemsMetadataInitializers {
    private List<RuntimeClassListItemsMetadataInitializersPending> pending;
    private RuntimeClassListItemsMetadataInitializersResult result;

    public RuntimeClassListItemsMetadataInitializers() {
        // no-op
    }

    public RuntimeClassListItemsMetadataInitializers(final List<RuntimeClassListItemsMetadataInitializersPending> pending,
                                                     final RuntimeClassListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<RuntimeClassListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<RuntimeClassListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public RuntimeClassListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final RuntimeClassListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof RuntimeClassListItemsMetadataInitializers)) {
            return false;
        }
        final RuntimeClassListItemsMetadataInitializers __otherCasted = (RuntimeClassListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
