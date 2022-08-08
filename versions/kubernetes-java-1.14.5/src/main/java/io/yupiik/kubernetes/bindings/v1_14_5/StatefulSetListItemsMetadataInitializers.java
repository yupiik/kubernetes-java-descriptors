package io.yupiik.kubernetes.bindings.v1_14_5;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsMetadataInitializers {
    private List<StatefulSetListItemsMetadataInitializersPending> pending;
    private StatefulSetListItemsMetadataInitializersResult result;

    public StatefulSetListItemsMetadataInitializers() {
        // no-op
    }

    public StatefulSetListItemsMetadataInitializers(final List<StatefulSetListItemsMetadataInitializersPending> pending,
                                                    final StatefulSetListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<StatefulSetListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<StatefulSetListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public StatefulSetListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final StatefulSetListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof StatefulSetListItemsMetadataInitializers)) {
            return false;
        }
        final StatefulSetListItemsMetadataInitializers __otherCasted = (StatefulSetListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
