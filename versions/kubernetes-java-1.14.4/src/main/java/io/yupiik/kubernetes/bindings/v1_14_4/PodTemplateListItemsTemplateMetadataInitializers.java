package io.yupiik.kubernetes.bindings.v1_14_4;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateMetadataInitializers {
    private List<PodTemplateListItemsTemplateMetadataInitializersPending> pending;
    private PodTemplateListItemsTemplateMetadataInitializersResult result;

    public PodTemplateListItemsTemplateMetadataInitializers() {
        // no-op
    }

    public PodTemplateListItemsTemplateMetadataInitializers(final List<PodTemplateListItemsTemplateMetadataInitializersPending> pending,
                                                            final PodTemplateListItemsTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<PodTemplateListItemsTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PodTemplateListItemsTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PodTemplateListItemsTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodTemplateListItemsTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateMetadataInitializers)) {
            return false;
        }
        final PodTemplateListItemsTemplateMetadataInitializers __otherCasted = (PodTemplateListItemsTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
