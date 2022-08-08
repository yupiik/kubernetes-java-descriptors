package io.yupiik.kubernetes.bindings.v1_16_8.v2beta2;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelectorMatchExpressions {
    private String key;
    private String operator;
    private List<String> values;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelectorMatchExpressions() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelectorMatchExpressions(final String key,
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelectorMatchExpressions)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelectorMatchExpressions __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelectorMatchExpressions) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(values, __otherCasted.values);
    }
}
