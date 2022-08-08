package io.yupiik.kubernetes.bindings.v1_11_10.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class EndpointsMetadataInitializers {
    private List<JsonValue> pending;
    private EndpointsMetadataInitializersResult result;

    public EndpointsMetadataInitializers() {
        // no-op
    }

    public EndpointsMetadataInitializers(final List<JsonValue> pending,
                                         final EndpointsMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public EndpointsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final EndpointsMetadataInitializersResult result) {
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
        if (!(__other instanceof EndpointsMetadataInitializers)) {
            return false;
        }
        final EndpointsMetadataInitializers __otherCasted = (EndpointsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
