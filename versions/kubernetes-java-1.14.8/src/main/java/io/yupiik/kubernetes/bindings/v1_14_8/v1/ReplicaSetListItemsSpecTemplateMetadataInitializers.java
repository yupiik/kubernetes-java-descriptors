package io.yupiik.kubernetes.bindings.v1_14_8.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateMetadataInitializers {
    private List<ReplicaSetListItemsSpecTemplateMetadataInitializersPending> pending;
    private ReplicaSetListItemsSpecTemplateMetadataInitializersResult result;

    public ReplicaSetListItemsSpecTemplateMetadataInitializers() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateMetadataInitializers(final List<ReplicaSetListItemsSpecTemplateMetadataInitializersPending> pending,
                                                               final ReplicaSetListItemsSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<ReplicaSetListItemsSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ReplicaSetListItemsSpecTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ReplicaSetListItemsSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ReplicaSetListItemsSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateMetadataInitializers)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateMetadataInitializers __otherCasted = (ReplicaSetListItemsSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
