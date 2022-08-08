package io.yupiik.kubernetes.bindings.v1_21_5.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsContainerResource {
    private String container;
    private String name;
    private HorizontalPodAutoscalerSpecMetricsContainerResourceTarget target;

    public HorizontalPodAutoscalerSpecMetricsContainerResource() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsContainerResource(final String container,
                                                               final String name,
                                                               final HorizontalPodAutoscalerSpecMetricsContainerResourceTarget target) {
        // no-op
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerSpecMetricsContainerResourceTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerSpecMetricsContainerResourceTarget target) {
        this.target = target;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                container,
                name,
                target);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsContainerResource)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsContainerResource __otherCasted = (HorizontalPodAutoscalerSpecMetricsContainerResource) __other;
        return Objects.equals(container, __otherCasted.container) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(target, __otherCasted.target);
    }
}
