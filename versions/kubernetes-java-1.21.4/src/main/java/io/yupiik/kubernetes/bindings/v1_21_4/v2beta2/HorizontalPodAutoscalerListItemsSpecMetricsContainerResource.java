package io.yupiik.kubernetes.bindings.v1_21_4.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsContainerResource {
    private String container;
    private String name;
    private HorizontalPodAutoscalerListItemsSpecMetricsContainerResourceTarget target;

    public HorizontalPodAutoscalerListItemsSpecMetricsContainerResource() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsContainerResource(final String container,
                                                                        final String name,
                                                                        final HorizontalPodAutoscalerListItemsSpecMetricsContainerResourceTarget target) {
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

    public HorizontalPodAutoscalerListItemsSpecMetricsContainerResourceTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerListItemsSpecMetricsContainerResourceTarget target) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsContainerResource)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsContainerResource __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsContainerResource) __other;
        return Objects.equals(container, __otherCasted.container) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(target, __otherCasted.target);
    }
}
