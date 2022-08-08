package io.yupiik.kubernetes.bindings.v1_24_2.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsContainerResource {
    private String container;
    private Integer currentAverageUtilization;
    private String currentAverageValue;
    private String name;

    public HorizontalPodAutoscalerStatusCurrentMetricsContainerResource() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsContainerResource(final String container,
                                                                        final Integer currentAverageUtilization,
                                                                        final String currentAverageValue,
                                                                        final String name) {
        // no-op
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    public Integer getCurrentAverageUtilization() {
        return currentAverageUtilization;
    }

    public void setCurrentAverageUtilization(final Integer currentAverageUtilization) {
        this.currentAverageUtilization = currentAverageUtilization;
    }

    public String getCurrentAverageValue() {
        return currentAverageValue;
    }

    public void setCurrentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
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
                currentAverageUtilization,
                currentAverageValue,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsContainerResource)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsContainerResource __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsContainerResource) __other;
        return Objects.equals(container, __otherCasted.container) &&
            Objects.equals(currentAverageUtilization, __otherCasted.currentAverageUtilization) &&
            Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(name, __otherCasted.name);
    }
}
