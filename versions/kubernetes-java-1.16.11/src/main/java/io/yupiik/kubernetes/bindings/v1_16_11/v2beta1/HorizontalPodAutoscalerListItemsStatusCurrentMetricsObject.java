package io.yupiik.kubernetes.bindings.v1_16_11.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject {
    private String averageValue;
    private String currentValue;
    private String metricName;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelector selector;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectTarget target;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject(final String averageValue,
                                                                      final String currentValue,
                                                                      final String metricName,
                                                                      final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelector selector,
                                                                      final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectTarget target) {
        // no-op
    }

    public String getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(final String averageValue) {
        this.averageValue = averageValue;
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

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelector selector) {
        this.selector = selector;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectTarget target) {
        this.target = target;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                averageValue,
                currentValue,
                metricName,
                selector,
                target);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject) __other;
        return Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(currentValue, __otherCasted.currentValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(target, __otherCasted.target);
    }
}
