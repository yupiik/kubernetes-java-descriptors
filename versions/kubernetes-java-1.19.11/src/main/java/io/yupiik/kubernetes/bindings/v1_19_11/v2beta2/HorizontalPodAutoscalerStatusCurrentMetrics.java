package io.yupiik.kubernetes.bindings.v1_19_11.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetrics {
    private HorizontalPodAutoscalerStatusCurrentMetricsExternal external;
    private HorizontalPodAutoscalerStatusCurrentMetricsObject object;
    private HorizontalPodAutoscalerStatusCurrentMetricsPods pods;
    private HorizontalPodAutoscalerStatusCurrentMetricsResource resource;
    private String type;

    public HorizontalPodAutoscalerStatusCurrentMetrics() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetrics(final HorizontalPodAutoscalerStatusCurrentMetricsExternal external,
                                                       final HorizontalPodAutoscalerStatusCurrentMetricsObject object,
                                                       final HorizontalPodAutoscalerStatusCurrentMetricsPods pods,
                                                       final HorizontalPodAutoscalerStatusCurrentMetricsResource resource,
                                                       final String type) {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsExternal getExternal() {
        return external;
    }

    public void setExternal(final HorizontalPodAutoscalerStatusCurrentMetricsExternal external) {
        this.external = external;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObject getObject() {
        return object;
    }

    public void setObject(final HorizontalPodAutoscalerStatusCurrentMetricsObject object) {
        this.object = object;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsPods getPods() {
        return pods;
    }

    public void setPods(final HorizontalPodAutoscalerStatusCurrentMetricsPods pods) {
        this.pods = pods;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsResource getResource() {
        return resource;
    }

    public void setResource(final HorizontalPodAutoscalerStatusCurrentMetricsResource resource) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetrics)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetrics __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetrics) __other;
        return Objects.equals(external, __otherCasted.external) &&
            Objects.equals(object, __otherCasted.object) &&
            Objects.equals(pods, __otherCasted.pods) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(type, __otherCasted.type);
    }
}
