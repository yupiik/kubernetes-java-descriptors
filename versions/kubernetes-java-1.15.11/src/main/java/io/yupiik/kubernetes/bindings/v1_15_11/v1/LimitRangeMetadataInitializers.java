package io.yupiik.kubernetes.bindings.v1_15_11.v1;

import java.util.List;
import java.util.Objects;

public class LimitRangeMetadataInitializers {
    private List<LimitRangeMetadataInitializersPending> pending;
    private LimitRangeMetadataInitializersResult result;

    public LimitRangeMetadataInitializers() {
        // no-op
    }

    public LimitRangeMetadataInitializers(final List<LimitRangeMetadataInitializersPending> pending,
                                          final LimitRangeMetadataInitializersResult result) {
        // no-op
    }

    public List<LimitRangeMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<LimitRangeMetadataInitializersPending> pending) {
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
