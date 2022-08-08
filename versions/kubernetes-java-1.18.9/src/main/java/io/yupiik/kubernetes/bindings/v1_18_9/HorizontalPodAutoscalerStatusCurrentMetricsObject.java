package io.yupiik.kubernetes.bindings.v1_18_9;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsObject {
    private String averageValue;
    private String currentValue;
    private String metricName;
    private HorizontalPodAutoscalerStatusCurrentMetricsObjectSelector selector;
    private HorizontalPodAutoscalerStatusCurrentMetricsObjectTarget target;

    public HorizontalPodAutoscalerStatusCurrentMetricsObject() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObject(final String averageValue,
                                                             final String currentValue,
                                                             final String metricName,
                                                             final HorizontalPodAutoscalerStatusCurrentMetricsObjectSelector selector,
                                                             final HorizontalPodAutoscalerStatusCurrentMetricsObjectTarget target) {
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

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerStatusCurrentMetricsObjectSelector selector) {
        this.selector = selector;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerStatusCurrentMetricsObjectTarget target) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsObject)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsObject __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsObject) __other;
        return Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(currentValue, __otherCasted.currentValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(target, __otherCasted.target);
    }
}
