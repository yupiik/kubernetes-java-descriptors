package io.yupiik.kubernetes.bindings.v1_20_0.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsResourceCurrent {
    private Integer averageUtilization;
    private String averageValue;
    private String value;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsResourceCurrent() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsResourceCurrent(final Integer averageUtilization,
                                                                               final String averageValue,
                                                                               final String value) {
        // no-op
    }

    public Integer getAverageUtilization() {
        return averageUtilization;
    }

    public void setAverageUtilization(final Integer averageUtilization) {
        this.averageUtilization = averageUtilization;
    }

    public String getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(final String averageValue) {
        this.averageValue = averageValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                averageUtilization,
                averageValue,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsResourceCurrent)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsResourceCurrent __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsResourceCurrent) __other;
        return Objects.equals(averageUtilization, __otherCasted.averageUtilization) &&
            Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(value, __otherCasted.value);
    }
}
