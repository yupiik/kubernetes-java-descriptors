package io.yupiik.kubernetes.bindings.v1_11_6.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class IngressMetadataInitializers {
    private List<JsonValue> pending;
    private IngressMetadataInitializersResult result;

    public IngressMetadataInitializers() {
        // no-op
    }

    public IngressMetadataInitializers(final List<JsonValue> pending,
                                       final IngressMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public IngressMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final IngressMetadataInitializersResult result) {
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
        if (!(__other instanceof IngressMetadataInitializers)) {
            return false;
        }
        final IngressMetadataInitializers __otherCasted = (IngressMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
