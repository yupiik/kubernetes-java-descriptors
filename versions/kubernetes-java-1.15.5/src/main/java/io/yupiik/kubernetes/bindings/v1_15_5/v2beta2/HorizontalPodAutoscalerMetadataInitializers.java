package io.yupiik.kubernetes.bindings.v1_15_5.v2beta2;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerMetadataInitializers {
    private List<HorizontalPodAutoscalerMetadataInitializersPending> pending;
    private HorizontalPodAutoscalerMetadataInitializersResult result;

    public HorizontalPodAutoscalerMetadataInitializers() {
        // no-op
    }

    public HorizontalPodAutoscalerMetadataInitializers(final List<HorizontalPodAutoscalerMetadataInitializersPending> pending,
                                                       final HorizontalPodAutoscalerMetadataInitializersResult result) {
        // no-op
    }

    public List<HorizontalPodAutoscalerMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<HorizontalPodAutoscalerMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public HorizontalPodAutoscalerMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final HorizontalPodAutoscalerMetadataInitializersResult result) {
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
        if (!(__other instanceof HorizontalPodAutoscalerMetadataInitializers)) {
            return false;
        }
        final HorizontalPodAutoscalerMetadataInitializers __otherCasted = (HorizontalPodAutoscalerMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
