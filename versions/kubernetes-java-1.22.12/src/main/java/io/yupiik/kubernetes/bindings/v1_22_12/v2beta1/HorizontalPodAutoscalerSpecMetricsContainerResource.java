package io.yupiik.kubernetes.bindings.v1_22_12.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsContainerResource {
    private String container;
    private String name;
    private Integer targetAverageUtilization;
    private String targetAverageValue;

    public HorizontalPodAutoscalerSpecMetricsContainerResource() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsContainerResource(final String container,
                                                               final String name,
                                                               final Integer targetAverageUtilization,
                                                               final String targetAverageValue) {
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

    public Integer getTargetAverageUtilization() {
        return targetAverageUtilization;
    }

    public void setTargetAverageUtilization(final Integer targetAverageUtilization) {
        this.targetAverageUtilization = targetAverageUtilization;
    }

    public String getTargetAverageValue() {
        return targetAverageValue;
    }

    public void setTargetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                container,
                name,
                targetAverageUtilization,
                targetAverageValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsContainerResource)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsContainerResource __otherCasted = (HorizontalPodAutoscalerSpecMetricsContainerResource) __other;
        return Objects.equals(container, __otherCasted.container) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(targetAverageUtilization, __otherCasted.targetAverageUtilization) &&
            Objects.equals(targetAverageValue, __otherCasted.targetAverageValue);
    }
}
