package io.yupiik.kubernetes.bindings.v1_15_12.v1;

import java.util.List;
import java.util.Objects;

public class SecretListItemsMetadataInitializers {
    private List<SecretListItemsMetadataInitializersPending> pending;
    private SecretListItemsMetadataInitializersResult result;

    public SecretListItemsMetadataInitializers() {
        // no-op
    }

    public SecretListItemsMetadataInitializers(final List<SecretListItemsMetadataInitializersPending> pending,
                                               final SecretListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<SecretListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<SecretListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public SecretListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final SecretListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof SecretListItemsMetadataInitializers)) {
            return false;
        }
        final SecretListItemsMetadataInitializers __otherCasted = (SecretListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
