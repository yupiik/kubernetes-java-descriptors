package io.yupiik.kubernetes.bindings.v1_14_9.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateMetadataInitializers {
    private List<ReplicationControllerSpecTemplateMetadataInitializersPending> pending;
    private ReplicationControllerSpecTemplateMetadataInitializersResult result;

    public ReplicationControllerSpecTemplateMetadataInitializers() {
        // no-op
    }

    public ReplicationControllerSpecTemplateMetadataInitializers(final List<ReplicationControllerSpecTemplateMetadataInitializersPending> pending,
                                                                 final ReplicationControllerSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<ReplicationControllerSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ReplicationControllerSpecTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ReplicationControllerSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ReplicationControllerSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateMetadataInitializers)) {
            return false;
        }
        final ReplicationControllerSpecTemplateMetadataInitializers __otherCasted = (ReplicationControllerSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
