package io.yupiik.kubernetes.bindings.v1_15_5;

import java.util.List;
import java.util.Objects;

public class LimitRangeListItemsMetadataInitializers {
    private List<LimitRangeListItemsMetadataInitializersPending> pending;
    private LimitRangeListItemsMetadataInitializersResult result;

    public LimitRangeListItemsMetadataInitializers() {
        // no-op
    }

    public LimitRangeListItemsMetadataInitializers(final List<LimitRangeListItemsMetadataInitializersPending> pending,
                                                   final LimitRangeListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<LimitRangeListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<LimitRangeListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public LimitRangeListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final LimitRangeListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof LimitRangeListItemsMetadataInitializers)) {
            return false;
        }
        final LimitRangeListItemsMetadataInitializers __otherCasted = (LimitRangeListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
