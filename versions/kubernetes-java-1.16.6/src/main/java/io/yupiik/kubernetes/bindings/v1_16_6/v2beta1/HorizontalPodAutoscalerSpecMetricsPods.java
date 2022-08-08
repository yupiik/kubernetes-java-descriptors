package io.yupiik.kubernetes.bindings.v1_16_6.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsPods {
    private String metricName;
    private HorizontalPodAutoscalerSpecMetricsPodsSelector selector;
    private String targetAverageValue;

    public HorizontalPodAutoscalerSpecMetricsPods() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsPods(final String metricName,
                                                  final HorizontalPodAutoscalerSpecMetricsPodsSelector selector,
                                                  final String targetAverageValue) {
        // no-op
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    public HorizontalPodAutoscalerSpecMetricsPodsSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerSpecMetricsPodsSelector selector) {
        this.selector = selector;
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
                metricName,
                selector,
                targetAverageValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsPods)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsPods __otherCasted = (HorizontalPodAutoscalerSpecMetricsPods) __other;
        return Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(targetAverageValue, __otherCasted.targetAverageValue);
    }
}
