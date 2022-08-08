package io.yupiik.kubernetes.bindings.v1_16_4.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsExternal {
    private String metricName;
    private HorizontalPodAutoscalerSpecMetricsExternalMetricSelector metricSelector;
    private String targetAverageValue;
    private String targetValue;

    public HorizontalPodAutoscalerSpecMetricsExternal() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsExternal(final String metricName,
                                                      final HorizontalPodAutoscalerSpecMetricsExternalMetricSelector metricSelector,
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

    public HorizontalPodAutoscalerSpecMetricsExternalMetricSelector getMetricSelector() {
        return metricSelector;
    }

    public void setMetricSelector(final HorizontalPodAutoscalerSpecMetricsExternalMetricSelector metricSelector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsExternal)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsExternal __otherCasted = (HorizontalPodAutoscalerSpecMetricsExternal) __other;
        return Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(metricSelector, __otherCasted.metricSelector) &&
            Objects.equals(targetAverageValue, __otherCasted.targetAverageValue) &&
            Objects.equals(targetValue, __otherCasted.targetValue);
    }
}
