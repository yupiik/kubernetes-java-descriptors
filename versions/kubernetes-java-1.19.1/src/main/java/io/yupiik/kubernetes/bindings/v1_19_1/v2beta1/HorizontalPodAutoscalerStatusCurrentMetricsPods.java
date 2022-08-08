package io.yupiik.kubernetes.bindings.v1_19_1.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsPods {
    private String currentAverageValue;
    private String metricName;
    private HorizontalPodAutoscalerStatusCurrentMetricsPodsSelector selector;

    public HorizontalPodAutoscalerStatusCurrentMetricsPods() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsPods(final String currentAverageValue,
                                                           final String metricName,
                                                           final HorizontalPodAutoscalerStatusCurrentMetricsPodsSelector selector) {
        // no-op
    }

    public String getCurrentAverageValue() {
        return currentAverageValue;
    }

    public void setCurrentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsPodsSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerStatusCurrentMetricsPodsSelector selector) {
        this.selector = selector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                currentAverageValue,
                metricName,
                selector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsPods)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsPods __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsPods) __other;
        return Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
