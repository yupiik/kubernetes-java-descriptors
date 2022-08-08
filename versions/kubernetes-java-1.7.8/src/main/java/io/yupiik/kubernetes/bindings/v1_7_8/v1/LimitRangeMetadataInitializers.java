package io.yupiik.kubernetes.bindings.v1_7_8.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class LimitRangeMetadataInitializers {
    private List<JsonValue> pending;
    private LimitRangeMetadataInitializersResult result;

    public LimitRangeMetadataInitializers() {
        // no-op
    }

    public LimitRangeMetadataInitializers(final List<JsonValue> pending,
                                          final LimitRangeMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public LimitRangeMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final LimitRangeMetadataInitializersResult result) {
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
        if (!(__other instanceof LimitRangeMetadataInitializers)) {
            return false;
        }
        final LimitRangeMetadataInitializers __otherCasted = (LimitRangeMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
