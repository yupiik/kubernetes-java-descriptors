package io.yupiik.kubernetes.bindings.v1_14_9;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateMetadataInitializers {
    private List<ReplicationControllerListItemsSpecTemplateMetadataInitializersPending> pending;
    private ReplicationControllerListItemsSpecTemplateMetadataInitializersResult result;

    public ReplicationControllerListItemsSpecTemplateMetadataInitializers() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateMetadataInitializers(final List<ReplicationControllerListItemsSpecTemplateMetadataInitializersPending> pending,
                                                                          final ReplicationControllerListItemsSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<ReplicationControllerListItemsSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ReplicationControllerListItemsSpecTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ReplicationControllerListItemsSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ReplicationControllerListItemsSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateMetadataInitializers)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateMetadataInitializers __otherCasted = (ReplicationControllerListItemsSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
