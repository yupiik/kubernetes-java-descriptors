package io.yupiik.kubernetes.bindings.v1_22_12.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsResource {
    private String name;
    private HorizontalPodAutoscalerListItemsSpecMetricsResourceTarget target;

    public HorizontalPodAutoscalerListItemsSpecMetricsResource() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsResource(final String name,
                                                               final HorizontalPodAutoscalerListItemsSpecMetricsResourceTarget target) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsResourceTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerListItemsSpecMetricsResourceTarget target) {
        this.target = target;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                target);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsResource)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsResource __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsResource) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(target, __otherCasted.target);
    }
}
