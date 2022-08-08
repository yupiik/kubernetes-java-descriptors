package io.yupiik.kubernetes.bindings.v1_13_11;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ServiceMetadataInitializers {
    private List<JsonValue> pending;
    private ServiceMetadataInitializersResult result;

    public ServiceMetadataInitializers() {
        // no-op
    }

    public ServiceMetadataInitializers(final List<JsonValue> pending,
                                       final ServiceMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ServiceMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ServiceMetadataInitializersResult result) {
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
        if (!(__other instanceof ServiceMetadataInitializers)) {
            return false;
        }
        final ServiceMetadataInitializers __otherCasted = (ServiceMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
