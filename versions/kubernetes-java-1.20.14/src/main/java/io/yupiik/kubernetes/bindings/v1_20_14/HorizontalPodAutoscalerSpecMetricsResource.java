package io.yupiik.kubernetes.bindings.v1_20_14;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsResource {
    private String name;
    private Integer targetAverageUtilization;
    private String targetAverageValue;

    public HorizontalPodAutoscalerSpecMetricsResource() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsResource(final String name,
                                                      final Integer targetAverageUtilization,
                                                      final String targetAverageValue) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getTargetAverageUtilization() {
        return targetAverageUtilization;
    }

    public void setTargetAverageUtilization(final Integer targetAverageUtilization) {
        this.targetAverageUtilization = targetAverageUtilization;
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
                name,
                targetAverageUtilization,
                targetAverageValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsResource)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsResource __otherCasted = (HorizontalPodAutoscalerSpecMetricsResource) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(targetAverageUtilization, __otherCasted.targetAverageUtilization) &&
            Objects.equals(targetAverageValue, __otherCasted.targetAverageValue);
    }
}
