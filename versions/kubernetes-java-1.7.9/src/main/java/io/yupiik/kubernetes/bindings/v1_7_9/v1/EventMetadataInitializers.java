package io.yupiik.kubernetes.bindings.v1_7_9.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class EventMetadataInitializers {
    private List<JsonValue> pending;
    private EventMetadataInitializersResult result;

    public EventMetadataInitializers() {
        // no-op
    }

    public EventMetadataInitializers(final List<JsonValue> pending,
                                     final EventMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public EventMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final EventMetadataInitializersResult result) {
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
        if (!(__other instanceof EventMetadataInitializers)) {
            return false;
        }
        final EventMetadataInitializers __otherCasted = (EventMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
