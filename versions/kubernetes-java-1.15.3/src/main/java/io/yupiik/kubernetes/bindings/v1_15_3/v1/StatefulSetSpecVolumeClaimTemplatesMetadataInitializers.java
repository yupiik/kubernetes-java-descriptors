package io.yupiik.kubernetes.bindings.v1_15_3.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecVolumeClaimTemplatesMetadataInitializers {
    private List<StatefulSetSpecVolumeClaimTemplatesMetadataInitializersPending> pending;
    private StatefulSetSpecVolumeClaimTemplatesMetadataInitializersResult result;

    public StatefulSetSpecVolumeClaimTemplatesMetadataInitializers() {
        // no-op
    }

    public StatefulSetSpecVolumeClaimTemplatesMetadataInitializers(final List<StatefulSetSpecVolumeClaimTemplatesMetadataInitializersPending> pending,
                                                                   final StatefulSetSpecVolumeClaimTemplatesMetadataInitializersResult result) {
        // no-op
    }

    public List<StatefulSetSpecVolumeClaimTemplatesMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<StatefulSetSpecVolumeClaimTemplatesMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public StatefulSetSpecVolumeClaimTemplatesMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final StatefulSetSpecVolumeClaimTemplatesMetadataInitializersResult result) {
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
        if (!(__other instanceof StatefulSetSpecVolumeClaimTemplatesMetadataInitializers)) {
            return false;
        }
        final StatefulSetSpecVolumeClaimTemplatesMetadataInitializers __otherCasted = (StatefulSetSpecVolumeClaimTemplatesMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
