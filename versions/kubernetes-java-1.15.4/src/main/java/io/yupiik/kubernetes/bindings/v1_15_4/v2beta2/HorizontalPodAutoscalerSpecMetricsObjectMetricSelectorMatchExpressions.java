package io.yupiik.kubernetes.bindings.v1_15_4.v2beta2;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsObjectMetricSelectorMatchExpressions {
    private String key;
    private String operator;
    private List<String> values;

    public HorizontalPodAutoscalerSpecMetricsObjectMetricSelectorMatchExpressions() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsObjectMetricSelectorMatchExpressions(final String key,
                                                                                  final String operator,
                                                                                  final List<String> values) {
        // no-op
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(final String operator) {
        this.operator = operator;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(final List<String> values) {
        this.values = values;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                operator,
                values);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsObjectMetricSelectorMatchExpressions)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsObjectMetricSelectorMatchExpressions __otherCasted = (HorizontalPodAutoscalerSpecMetricsObjectMetricSelectorMatchExpressions) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(values, __otherCasted.values);
    }
}
