package io.yupiik.kubernetes.bindings.v1_14_7.v1beta1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetMetadataInitializers {
    private List<ReplicaSetMetadataInitializersPending> pending;
    private ReplicaSetMetadataInitializersResult result;

    public ReplicaSetMetadataInitializers() {
        // no-op
    }

    public ReplicaSetMetadataInitializers(final List<ReplicaSetMetadataInitializersPending> pending,
                                          final ReplicaSetMetadataInitializersResult result) {
        // no-op
    }

    public List<ReplicaSetMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ReplicaSetMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ReplicaSetMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ReplicaSetMetadataInitializersResult result) {
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
        if (!(__other instanceof ReplicaSetMetadataInitializers)) {
            return false;
        }
        final ReplicaSetMetadataInitializers __otherCasted = (ReplicaSetMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
