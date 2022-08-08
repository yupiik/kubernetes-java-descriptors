package io.yupiik.kubernetes.bindings.v1_21_8;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsContainerResource {
    private String container;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsContainerResourceCurrent current;
    private String name;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsContainerResource() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsContainerResource(final String container,
                                                                                 final HorizontalPodAutoscalerListItemsStatusCurrentMetricsContainerResourceCurrent current,
                                                                                 final String name) {
        // no-op
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsContainerResourceCurrent getCurrent() {
        return current;
    }

    public void setCurrent(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsContainerResourceCurrent current) {
        this.current = current;
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
                container,
                current,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsContainerResource)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsContainerResource __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsContainerResource) __other;
        return Objects.equals(container, __otherCasted.container) &&
            Objects.equals(current, __otherCasted.current) &&
            Objects.equals(name, __otherCasted.name);
    }
}
