package io.yupiik.kubernetes.bindings.v1_8_13.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class NamespaceMetadataInitializers {
    private List<JsonValue> pending;
    private NamespaceMetadataInitializersResult result;

    public NamespaceMetadataInitializers() {
        // no-op
    }

    public NamespaceMetadataInitializers(final List<JsonValue> pending,
                                         final NamespaceMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public NamespaceMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final NamespaceMetadataInitializersResult result) {
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
        if (!(__other instanceof NamespaceMetadataInitializers)) {
            return false;
        }
        final NamespaceMetadataInitializers __otherCasted = (NamespaceMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
