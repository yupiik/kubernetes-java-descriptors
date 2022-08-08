package io.yupiik.kubernetes.bindings.v1_13_0.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerMetadataInitializers {
    private List<JsonValue> pending;
    private HorizontalPodAutoscalerMetadataInitializersResult result;

    public HorizontalPodAutoscalerMetadataInitializers() {
        // no-op
    }

    public HorizontalPodAutoscalerMetadataInitializers(final List<JsonValue> pending,
                                                       final HorizontalPodAutoscalerMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
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
