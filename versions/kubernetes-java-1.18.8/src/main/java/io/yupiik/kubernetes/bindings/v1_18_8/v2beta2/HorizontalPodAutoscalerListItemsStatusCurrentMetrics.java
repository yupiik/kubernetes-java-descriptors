package io.yupiik.kubernetes.bindings.v1_18_8.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetrics {
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal external;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject object;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods pods;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource resource;
    private String type;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetrics() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetrics(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal external,
                                                                final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject object,
                                                                final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods pods,
                                                                final HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource resource,
                                                                final String type) {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal getExternal() {
        return external;
    }

    public void setExternal(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal external) {
        this.external = external;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject getObject() {
        return object;
    }

    public void setObject(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject object) {
        this.object = object;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods getPods() {
        return pods;
    }

    public void setPods(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods pods) {
        this.pods = pods;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource getResource() {
        return resource;
    }

    public void setResource(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource resource) {
        this.resource = resource;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                external,
                object,
                pods,
                resource,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetrics)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetrics __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetrics) __other;
        return Objects.equals(external, __otherCasted.external) &&
            Objects.equals(object, __otherCasted.object) &&
            Objects.equals(pods, __otherCasted.pods) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(type, __otherCasted.type);
    }
}
