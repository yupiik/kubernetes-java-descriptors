package io.yupiik.kubernetes.bindings.v1_15_6.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsMetadataInitializers {
    private List<DaemonSetListItemsMetadataInitializersPending> pending;
    private DaemonSetListItemsMetadataInitializersResult result;

    public DaemonSetListItemsMetadataInitializers() {
        // no-op
    }

    public DaemonSetListItemsMetadataInitializers(final List<DaemonSetListItemsMetadataInitializersPending> pending,
                                                  final DaemonSetListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<DaemonSetListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<DaemonSetListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public DaemonSetListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final DaemonSetListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof DaemonSetListItemsMetadataInitializers)) {
            return false;
        }
        final DaemonSetListItemsMetadataInitializers __otherCasted = (DaemonSetListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
