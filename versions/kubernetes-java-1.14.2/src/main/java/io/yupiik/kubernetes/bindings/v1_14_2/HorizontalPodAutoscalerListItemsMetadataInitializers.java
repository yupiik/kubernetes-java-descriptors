package io.yupiik.kubernetes.bindings.v1_14_2;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsMetadataInitializers {
    private List<HorizontalPodAutoscalerListItemsMetadataInitializersPending> pending;
    private HorizontalPodAutoscalerListItemsMetadataInitializersResult result;

    public HorizontalPodAutoscalerListItemsMetadataInitializers() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsMetadataInitializers(final List<HorizontalPodAutoscalerListItemsMetadataInitializersPending> pending,
                                                                final HorizontalPodAutoscalerListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<HorizontalPodAutoscalerListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public HorizontalPodAutoscalerListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final HorizontalPodAutoscalerListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsMetadataInitializers)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsMetadataInitializers __otherCasted = (HorizontalPodAutoscalerListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
