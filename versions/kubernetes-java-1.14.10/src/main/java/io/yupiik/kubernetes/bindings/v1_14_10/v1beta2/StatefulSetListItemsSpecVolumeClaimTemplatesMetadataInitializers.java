package io.yupiik.kubernetes.bindings.v1_14_10.v1beta2;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializers {
    private List<StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersPending> pending;
    private StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersResult result;

    public StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializers() {
        // no-op
    }

    public StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializers(final List<StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersPending> pending,
                                                                            final StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersResult result) {
        // no-op
    }

    public List<StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersResult result) {
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
        if (!(__other instanceof StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializers)) {
            return false;
        }
        final StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializers __otherCasted = (StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
