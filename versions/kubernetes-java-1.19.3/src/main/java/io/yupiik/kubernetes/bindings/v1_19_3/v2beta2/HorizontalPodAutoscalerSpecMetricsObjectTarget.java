package io.yupiik.kubernetes.bindings.v1_19_3.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsObjectTarget {
    private Integer averageUtilization;
    private String averageValue;
    private String type;
    private String value;

    public HorizontalPodAutoscalerSpecMetricsObjectTarget() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsObjectTarget(final Integer averageUtilization,
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsObjectTarget)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsObjectTarget __otherCasted = (HorizontalPodAutoscalerSpecMetricsObjectTarget) __other;
        return Objects.equals(averageUtilization, __otherCasted.averageUtilization) &&
            Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(value, __otherCasted.value);
    }
}
