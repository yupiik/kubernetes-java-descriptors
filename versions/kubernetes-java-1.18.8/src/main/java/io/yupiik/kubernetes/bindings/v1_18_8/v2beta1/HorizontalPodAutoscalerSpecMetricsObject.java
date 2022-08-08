package io.yupiik.kubernetes.bindings.v1_18_8.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsObject {
    private String averageValue;
    private String metricName;
    private HorizontalPodAutoscalerSpecMetricsObjectSelector selector;
    private HorizontalPodAutoscalerSpecMetricsObjectTarget target;
    private String targetValue;

    public HorizontalPodAutoscalerSpecMetricsObject() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsObject(final String averageValue,
                                                    final String metricName,
                                                    final HorizontalPodAutoscalerSpecMetricsObjectSelector selector,
                                                    final HorizontalPodAutoscalerSpecMetricsObjectTarget target,
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

    public HorizontalPodAutoscalerSpecMetricsObjectSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerSpecMetricsObjectSelector selector) {
        this.selector = selector;
    }

    public HorizontalPodAutoscalerSpecMetricsObjectTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerSpecMetricsObjectTarget target) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsObject)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsObject __otherCasted = (HorizontalPodAutoscalerSpecMetricsObject) __other;
        return Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(target, __otherCasted.target) &&
            Objects.equals(targetValue, __otherCasted.targetValue);
    }
}
