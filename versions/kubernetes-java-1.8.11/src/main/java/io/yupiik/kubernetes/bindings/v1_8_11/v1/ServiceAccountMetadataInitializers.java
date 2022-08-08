package io.yupiik.kubernetes.bindings.v1_8_11.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ServiceAccountMetadataInitializers {
    private List<JsonValue> pending;
    private ServiceAccountMetadataInitializersResult result;

    public ServiceAccountMetadataInitializers() {
        // no-op
    }

    public ServiceAccountMetadataInitializers(final List<JsonValue> pending,
                                              final ServiceAccountMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ServiceAccountMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ServiceAccountMetadataInitializersResult result) {
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
        if (!(__other instanceof ServiceAccountMetadataInitializers)) {
            return false;
        }
        final ServiceAccountMetadataInitializers __otherCasted = (ServiceAccountMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
