package io.yupiik.kubernetes.bindings.v1_23_9.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsContainerResource {
    private String container;
    private HorizontalPodAutoscalerStatusCurrentMetricsContainerResourceCurrent current;
    private String name;

    public HorizontalPodAutoscalerStatusCurrentMetricsContainerResource() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsContainerResource(final String container,
                                                                        final HorizontalPodAutoscalerStatusCurrentMetricsContainerResourceCurrent current,
                                                                        final String name) {
        // no-op
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsContainerResourceCurrent getCurrent() {
        return current;
    }

    public void setCurrent(final HorizontalPodAutoscalerStatusCurrentMetricsContainerResourceCurrent current) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsContainerResource)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsContainerResource __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsContainerResource) __other;
        return Objects.equals(container, __otherCasted.container) &&
            Objects.equals(current, __otherCasted.current) &&
            Objects.equals(name, __otherCasted.name);
    }
}
