package io.yupiik.kubernetes.bindings.v1_21_6;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource {
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsResourceCurrent current;
    private String name;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsResourceCurrent current,
                                                                        final String name) {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsResourceCurrent getCurrent() {
        return current;
    }

    public void setCurrent(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsResourceCurrent current) {
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
                current,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(name, __otherCasted.name);
    }
}
