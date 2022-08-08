package io.yupiik.kubernetes.bindings.v1_14_7.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetMetadataInitializers {
    private List<DaemonSetMetadataInitializersPending> pending;
    private DaemonSetMetadataInitializersResult result;

    public DaemonSetMetadataInitializers() {
        // no-op
    }

    public DaemonSetMetadataInitializers(final List<DaemonSetMetadataInitializersPending> pending,
                                         final DaemonSetMetadataInitializersResult result) {
        // no-op
    }

    public List<DaemonSetMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<DaemonSetMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public DaemonSetMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final DaemonSetMetadataInitializersResult result) {
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
        if (!(__other instanceof DaemonSetMetadataInitializers)) {
            return false;
        }
        final DaemonSetMetadataInitializers __otherCasted = (DaemonSetMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
