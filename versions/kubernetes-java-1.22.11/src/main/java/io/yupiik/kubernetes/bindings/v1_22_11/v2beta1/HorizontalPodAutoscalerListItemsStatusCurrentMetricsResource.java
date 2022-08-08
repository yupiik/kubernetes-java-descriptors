package io.yupiik.kubernetes.bindings.v1_22_11.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource {
    private Integer currentAverageUtilization;
    private String currentAverageValue;
    private String name;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource(final Integer currentAverageUtilization,
                                                                        final String currentAverageValue,
                                                                        final String name) {
        // no-op
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
                currentAverageUtilization,
                currentAverageValue,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsResource) __other;
        return Objects.equals(currentAverageUtilization, __otherCasted.currentAverageUtilization) &&
            Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(name, __otherCasted.name);
    }
}
