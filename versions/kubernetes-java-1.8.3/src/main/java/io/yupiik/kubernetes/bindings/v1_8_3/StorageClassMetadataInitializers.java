package io.yupiik.kubernetes.bindings.v1_8_3;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class StorageClassMetadataInitializers {
    private List<JsonValue> pending;
    private StorageClassMetadataInitializersResult result;

    public StorageClassMetadataInitializers() {
        // no-op
    }

    public StorageClassMetadataInitializers(final List<JsonValue> pending,
                                            final StorageClassMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
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
