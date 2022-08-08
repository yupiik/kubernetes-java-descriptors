package io.yupiik.kubernetes.bindings.v1_16_13.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsObject {
    private String averageValue;
    private String metricName;
    private HorizontalPodAutoscalerListItemsSpecMetricsObjectSelector selector;
    private HorizontalPodAutoscalerListItemsSpecMetricsObjectTarget target;
    private String targetValue;

    public HorizontalPodAutoscalerListItemsSpecMetricsObject() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObject(final String averageValue,
                                                             final String metricName,
                                                             final HorizontalPodAutoscalerListItemsSpecMetricsObjectSelector selector,
                                                             final HorizontalPodAutoscalerListItemsSpecMetricsObjectTarget target,
                                                             final String targetValue) {
        // no-op
    }

    public String getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(final String averageValue) {
        this.averageValue = averageValue;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerListItemsSpecMetricsObjectSelector selector) {
        this.selector = selector;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerListItemsSpecMetricsObjectTarget target) {
        this.target = target;
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
                averageValue,
                metricName,
                selector,
                target,
                targetValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsObject)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsObject __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsObject) __other;
        return Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(target, __otherCasted.target) &&
            Objects.equals(targetValue, __otherCasted.targetValue);
    }
}
