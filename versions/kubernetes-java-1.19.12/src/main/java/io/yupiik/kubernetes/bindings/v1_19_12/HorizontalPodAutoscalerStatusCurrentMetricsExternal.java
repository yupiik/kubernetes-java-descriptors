package io.yupiik.kubernetes.bindings.v1_19_12;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsExternal {
    private String currentAverageValue;
    private String currentValue;
    private String metricName;
    private HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector metricSelector;

    public HorizontalPodAutoscalerStatusCurrentMetricsExternal() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsExternal(final String currentAverageValue,
                                                               final String currentValue,
                                                               final String metricName,
                                                               final HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector metricSelector) {
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

    public HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector getMetricSelector() {
        return metricSelector;
    }

    public void setMetricSelector(final HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector metricSelector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsExternal)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsExternal __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsExternal) __other;
        return Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(currentValue, __otherCasted.currentValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(metricSelector, __otherCasted.metricSelector);
    }
}
