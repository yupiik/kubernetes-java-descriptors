package io.yupiik.kubernetes.bindings.v1_23_0.v2;

import io.yupiik.kubernetes.bindings.v1_23_0.Validable;
import io.yupiik.kubernetes.bindings.v1_23_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MetricValueStatus implements Validable<MetricValueStatus> {
    private Integer averageUtilization;
    private String averageValue;
    private String value;

    public MetricValueStatus() {
        // no-op
    }

    public MetricValueStatus(final Integer averageUtilization,
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
        if (!(__other instanceof MetricValueStatus)) {
            return false;
        }
        final MetricValueStatus __otherCasted = (MetricValueStatus) __other;
        return Objects.equals(averageUtilization, __otherCasted.averageUtilization) &&
            Objects.equals(averageValue, __otherCasted.averageValue) &&
            Objects.equals(value, __otherCasted.value);
    }

    public MetricValueStatus averageUtilization(final Integer averageUtilization) {
        this.averageUtilization = averageUtilization;
        return this;
    }

    public MetricValueStatus averageValue(final String averageValue) {
        this.averageValue = averageValue;
        return this;
    }

    public MetricValueStatus value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public MetricValueStatus validate() {
        return this;
    }
}
