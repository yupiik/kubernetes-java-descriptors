package io.yupiik.kubernetes.bindings.v1_15_5;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateMetadataInitializers {
    private List<PodTemplateTemplateMetadataInitializersPending> pending;
    private PodTemplateTemplateMetadataInitializersResult result;

    public PodTemplateTemplateMetadataInitializers() {
        // no-op
    }

    public PodTemplateTemplateMetadataInitializers(final List<PodTemplateTemplateMetadataInitializersPending> pending,
                                                   final PodTemplateTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<PodTemplateTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PodTemplateTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PodTemplateTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodTemplateTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof PodTemplateTemplateMetadataInitializers)) {
            return false;
        }
        final PodTemplateTemplateMetadataInitializers __otherCasted = (PodTemplateTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
