package io.yupiik.kubernetes.bindings.v1_17_1.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsExternal {
    private String metricName;
    private HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector metricSelector;
    private String targetAverageValue;
    private String targetValue;

    public HorizontalPodAutoscalerListItemsSpecMetricsExternal() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsExternal(final String metricName,
                                                               final HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector metricSelector,
                                                               final String targetAverageValue,
                                                               final String targetValue) {
        // no-op
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector getMetricSelector() {
        return metricSelector;
    }

    public void setMetricSelector(final HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector metricSelector) {
        this.metricSelector = metricSelector;
    }

    public String getTargetAverageValue() {
        return targetAverageValue;
    }

    public void setTargetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
    }

    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(final String targetValue) {
        this.targetValue = targetValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metricName,
                metricSelector,
                targetAverageValue,
                targetValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsExternal)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsExternal __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsExternal) __other;
        return Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(metricSelector, __otherCasted.metricSelector) &&
            Objects.equals(targetAverageValue, __otherCasted.targetAverageValue) &&
            Objects.equals(targetValue, __otherCasted.targetValue);
    }
}
