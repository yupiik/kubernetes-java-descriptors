package io.yupiik.kubernetes.bindings.v1_15_3.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerMetadataInitializersPending {
    private String name;

    public HorizontalPodAutoscalerMetadataInitializersPending() {
        // no-op
    }

    public HorizontalPodAutoscalerMetadataInitializersPending(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerMetadataInitializersPending)) {
            return false;
        }
        final HorizontalPodAutoscalerMetadataInitializersPending __otherCasted = (HorizontalPodAutoscalerMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
