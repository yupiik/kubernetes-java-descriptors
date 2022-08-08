package io.yupiik.kubernetes.bindings.v1_21_10;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsContainerResourceTarget {
    private Integer averageUtilization;
    private String averageValue;
    private String type;
    private String value;

    public HorizontalPodAutoscalerListItemsSpecMetricsContainerResourceTarget() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsContainerResourceTarget(final Integer averageUtilization,
                                                                              final String averageValue,
                                                                              final String type,
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

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
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
                type,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsContainerResourceTarget)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsContainerResourceTarget __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsContainerResourceTarget) __other;
        return Objects.equals(averageUtilization, __otherCasted.averageUtilization) &&
            Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(value, __otherCasted.value);
    }
}
