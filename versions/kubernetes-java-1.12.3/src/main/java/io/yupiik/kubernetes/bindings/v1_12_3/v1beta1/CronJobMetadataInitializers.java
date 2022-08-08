package io.yupiik.kubernetes.bindings.v1_12_3.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class CronJobMetadataInitializers {
    private List<JsonValue> pending;
    private CronJobMetadataInitializersResult result;

    public CronJobMetadataInitializers() {
        // no-op
    }

    public CronJobMetadataInitializers(final List<JsonValue> pending,
                                       final CronJobMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public CronJobMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CronJobMetadataInitializersResult result) {
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
        if (!(__other instanceof CronJobMetadataInitializers)) {
            return false;
        }
        final CronJobMetadataInitializers __otherCasted = (CronJobMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
