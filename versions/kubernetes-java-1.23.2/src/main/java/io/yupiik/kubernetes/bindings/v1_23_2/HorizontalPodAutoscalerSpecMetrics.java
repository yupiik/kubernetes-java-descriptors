package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetrics {
    private HorizontalPodAutoscalerSpecMetricsContainerResource containerResource;
    private HorizontalPodAutoscalerSpecMetricsExternal external;
    private HorizontalPodAutoscalerSpecMetricsObject object;
    private HorizontalPodAutoscalerSpecMetricsPods pods;
    private HorizontalPodAutoscalerSpecMetricsResource resource;
    private String type;

    public HorizontalPodAutoscalerSpecMetrics() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetrics(final HorizontalPodAutoscalerSpecMetricsContainerResource containerResource,
                                              final HorizontalPodAutoscalerSpecMetricsExternal external,
                                              final HorizontalPodAutoscalerSpecMetricsObject object,
                                              final HorizontalPodAutoscalerSpecMetricsPods pods,
                                              final HorizontalPodAutoscalerSpecMetricsResource resource,
                                              final String type) {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsContainerResource getContainerResource() {
        return containerResource;
    }

    public void setContainerResource(final HorizontalPodAutoscalerSpecMetricsContainerResource containerResource) {
        this.containerResource = containerResource;
    }

    public HorizontalPodAutoscalerSpecMetricsExternal getExternal() {
        return external;
    }

    public void setExternal(final HorizontalPodAutoscalerSpecMetricsExternal external) {
        this.external = external;
    }

    public HorizontalPodAutoscalerSpecMetricsObject getObject() {
        return object;
    }

    public void setObject(final HorizontalPodAutoscalerSpecMetricsObject object) {
        this.object = object;
    }

    public HorizontalPodAutoscalerSpecMetricsPods getPods() {
        return pods;
    }

    public void setPods(final HorizontalPodAutoscalerSpecMetricsPods pods) {
        this.pods = pods;
    }

    public HorizontalPodAutoscalerSpecMetricsResource getResource() {
        return resource;
    }

    public void setResource(final HorizontalPodAutoscalerSpecMetricsResource resource) {
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
                containerResource,
                external,
                object,
                pods,
                resource,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetrics)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetrics __otherCasted = (HorizontalPodAutoscalerSpecMetrics) __other;
        return Objects.equals(containerResource, __otherCasted.containerResource) &&
            Objects.equals(external, __otherCasted.external) &&
            Objects.equals(object, __otherCasted.object) &&
            Objects.equals(pods, __otherCasted.pods) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(type, __otherCasted.type);
    }
}
