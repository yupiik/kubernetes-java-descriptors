package io.yupiik.kubernetes.bindings.v1_8_14.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class SecretMetadataInitializers {
    private List<JsonValue> pending;
    private SecretMetadataInitializersResult result;

    public SecretMetadataInitializers() {
        // no-op
    }

    public SecretMetadataInitializers(final List<JsonValue> pending,
                                      final SecretMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public SecretMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final SecretMetadataInitializersResult result) {
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
        if (!(__other instanceof SecretMetadataInitializers)) {
            return false;
        }
        final SecretMetadataInitializers __otherCasted = (SecretMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
