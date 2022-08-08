package io.yupiik.kubernetes.bindings.v1_7_15.v2alpha1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ScheduledJobMetadataInitializers {
    private List<JsonValue> pending;
    private ScheduledJobMetadataInitializersResult result;

    public ScheduledJobMetadataInitializers() {
        // no-op
    }

    public ScheduledJobMetadataInitializers(final List<JsonValue> pending,
                                            final ScheduledJobMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ScheduledJobMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ScheduledJobMetadataInitializersResult result) {
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
        if (!(__other instanceof ScheduledJobMetadataInitializers)) {
            return false;
        }
        final ScheduledJobMetadataInitializers __otherCasted = (ScheduledJobMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
