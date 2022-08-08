package io.yupiik.kubernetes.bindings.v1_12_6.v1alpha1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PriorityClassMetadataInitializers {
    private List<JsonValue> pending;
    private PriorityClassMetadataInitializersResult result;

    public PriorityClassMetadataInitializers() {
        // no-op
    }

    public PriorityClassMetadataInitializers(final List<JsonValue> pending,
                                             final PriorityClassMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public PriorityClassMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PriorityClassMetadataInitializersResult result) {
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
        if (!(__other instanceof PriorityClassMetadataInitializers)) {
            return false;
        }
        final PriorityClassMetadataInitializers __otherCasted = (PriorityClassMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
