package io.yupiik.kubernetes.bindings.v1_14_7;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsMetadataInitializers {
    private List<PodTemplateListItemsMetadataInitializersPending> pending;
    private PodTemplateListItemsMetadataInitializersResult result;

    public PodTemplateListItemsMetadataInitializers() {
        // no-op
    }

    public PodTemplateListItemsMetadataInitializers(final List<PodTemplateListItemsMetadataInitializersPending> pending,
                                                    final PodTemplateListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<PodTemplateListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PodTemplateListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PodTemplateListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodTemplateListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof PodTemplateListItemsMetadataInitializers)) {
            return false;
        }
        final PodTemplateListItemsMetadataInitializers __otherCasted = (PodTemplateListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
