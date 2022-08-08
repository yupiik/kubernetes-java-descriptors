package io.yupiik.kubernetes.bindings.v1_19_6.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsResource {
    private HorizontalPodAutoscalerStatusCurrentMetricsResourceCurrent current;
    private String name;

    public HorizontalPodAutoscalerStatusCurrentMetricsResource() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsResource(final HorizontalPodAutoscalerStatusCurrentMetricsResourceCurrent current,
                                                               final String name) {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsResourceCurrent getCurrent() {
        return current;
    }

    public void setCurrent(final HorizontalPodAutoscalerStatusCurrentMetricsResourceCurrent current) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsResource)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsResource __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsResource) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(name, __otherCasted.name);
    }
}
