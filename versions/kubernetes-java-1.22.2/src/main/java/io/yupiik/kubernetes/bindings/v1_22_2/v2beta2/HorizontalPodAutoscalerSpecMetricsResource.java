package io.yupiik.kubernetes.bindings.v1_22_2.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsResource {
    private String name;
    private HorizontalPodAutoscalerSpecMetricsResourceTarget target;

    public HorizontalPodAutoscalerSpecMetricsResource() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsResource(final String name,
                                                      final HorizontalPodAutoscalerSpecMetricsResourceTarget target) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerSpecMetricsResourceTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerSpecMetricsResourceTarget target) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsResource)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsResource __otherCasted = (HorizontalPodAutoscalerSpecMetricsResource) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(target, __otherCasted.target);
    }
}
