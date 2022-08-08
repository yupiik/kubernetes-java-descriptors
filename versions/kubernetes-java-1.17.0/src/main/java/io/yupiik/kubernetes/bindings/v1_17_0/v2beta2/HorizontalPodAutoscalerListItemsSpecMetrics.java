package io.yupiik.kubernetes.bindings.v1_17_0.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetrics {
    private HorizontalPodAutoscalerListItemsSpecMetricsExternal external;
    private HorizontalPodAutoscalerListItemsSpecMetricsObject object;
    private HorizontalPodAutoscalerListItemsSpecMetricsPods pods;
    private HorizontalPodAutoscalerListItemsSpecMetricsResource resource;
    private String type;

    public HorizontalPodAutoscalerListItemsSpecMetrics() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetrics(final HorizontalPodAutoscalerListItemsSpecMetricsExternal external,
                                                       final HorizontalPodAutoscalerListItemsSpecMetricsObject object,
                                                       final HorizontalPodAutoscalerListItemsSpecMetricsPods pods,
                                                       final HorizontalPodAutoscalerListItemsSpecMetricsResource resource,
                                                       final String type) {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsExternal getExternal() {
        return external;
    }

    public void setExternal(final HorizontalPodAutoscalerListItemsSpecMetricsExternal external) {
        this.external = external;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObject getObject() {
        return object;
    }

    public void setObject(final HorizontalPodAutoscalerListItemsSpecMetricsObject object) {
        this.object = object;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsPods getPods() {
        return pods;
    }

    public void setPods(final HorizontalPodAutoscalerListItemsSpecMetricsPods pods) {
        this.pods = pods;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsResource getResource() {
        return resource;
    }

    public void setResource(final HorizontalPodAutoscalerListItemsSpecMetricsResource resource) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetrics)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetrics __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetrics) __other;
        return Objects.equals(external, __otherCasted.external) &&
            Objects.equals(object, __otherCasted.object) &&
            Objects.equals(pods, __otherCasted.pods) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(type, __otherCasted.type);
    }
}
