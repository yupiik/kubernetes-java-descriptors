package io.yupiik.kubernetes.bindings.v1_15_6.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal {
    private String currentAverageValue;
    private String currentValue;
    private String metricName;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector metricSelector;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal(final String currentAverageValue,
                                                                        final String currentValue,
                                                                        final String metricName,
                                                                        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector metricSelector) {
        // no-op
    }

    public String getCurrentAverageValue() {
        return currentAverageValue;
    }

    public void setCurrentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(final String currentValue) {
        this.currentValue = currentValue;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector getMetricSelector() {
        return metricSelector;
    }

    public void setMetricSelector(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector metricSelector) {
        this.metricSelector = metricSelector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                currentAverageValue,
                currentValue,
                metricName,
                metricSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal) __other;
        return Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(currentValue, __otherCasted.currentValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(metricSelector, __otherCasted.metricSelector);
    }
}
