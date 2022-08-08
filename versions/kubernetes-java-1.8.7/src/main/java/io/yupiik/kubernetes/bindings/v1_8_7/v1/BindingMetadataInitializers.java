package io.yupiik.kubernetes.bindings.v1_8_7.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class BindingMetadataInitializers {
    private List<JsonValue> pending;
    private BindingMetadataInitializersResult result;

    public BindingMetadataInitializers() {
        // no-op
    }

    public BindingMetadataInitializers(final List<JsonValue> pending,
                                       final BindingMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public BindingMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final BindingMetadataInitializersResult result) {
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
        if (!(__other instanceof BindingMetadataInitializers)) {
            return false;
        }
        final BindingMetadataInitializers __otherCasted = (BindingMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
