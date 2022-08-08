package io.yupiik.kubernetes.bindings.v1_14_2;

import java.util.List;
import java.util.Objects;

public class StorageClassMetadataInitializers {
    private List<StorageClassMetadataInitializersPending> pending;
    private StorageClassMetadataInitializersResult result;

    public StorageClassMetadataInitializers() {
        // no-op
    }

    public StorageClassMetadataInitializers(final List<StorageClassMetadataInitializersPending> pending,
                                            final StorageClassMetadataInitializersResult result) {
        // no-op
    }

    public List<StorageClassMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<StorageClassMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public StorageClassMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final StorageClassMetadataInitializersResult result) {
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
        if (!(__other instanceof StorageClassMetadataInitializers)) {
            return false;
        }
        final StorageClassMetadataInitializers __otherCasted = (StorageClassMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
