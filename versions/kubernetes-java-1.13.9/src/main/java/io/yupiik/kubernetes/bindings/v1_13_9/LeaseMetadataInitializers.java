package io.yupiik.kubernetes.bindings.v1_13_9;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class LeaseMetadataInitializers {
    private List<JsonValue> pending;
    private LeaseMetadataInitializersResult result;

    public LeaseMetadataInitializers() {
        // no-op
    }

    public LeaseMetadataInitializers(final List<JsonValue> pending,
                                     final LeaseMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public LeaseMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final LeaseMetadataInitializersResult result) {
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
        if (!(__other instanceof LeaseMetadataInitializers)) {
            return false;
        }
        final LeaseMetadataInitializers __otherCasted = (LeaseMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
