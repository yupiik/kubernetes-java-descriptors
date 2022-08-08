package io.yupiik.kubernetes.bindings.v1_17_12.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods {
    private String currentAverageValue;
    private String metricName;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelector selector;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods(final String currentAverageValue,
                                                                    final String metricName,
                                                                    final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelector selector) {
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

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods) __other;
        return Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
