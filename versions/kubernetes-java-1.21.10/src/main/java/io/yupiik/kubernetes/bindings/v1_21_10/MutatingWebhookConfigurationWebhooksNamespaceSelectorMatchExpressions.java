package io.yupiik.kubernetes.bindings.v1_21_10;

import java.util.List;
import java.util.Objects;

public class MutatingWebhookConfigurationWebhooksNamespaceSelectorMatchExpressions {
    private String key;
    private String operator;
    private List<String> values;

    public MutatingWebhookConfigurationWebhooksNamespaceSelectorMatchExpressions() {
        // no-op
    }

    public MutatingWebhookConfigurationWebhooksNamespaceSelectorMatchExpressions(final String key,
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
        if (!(__other instanceof MutatingWebhookConfigurationWebhooksNamespaceSelectorMatchExpressions)) {
            return false;
        }
        final MutatingWebhookConfigurationWebhooksNamespaceSelectorMatchExpressions __otherCasted = (MutatingWebhookConfigurationWebhooksNamespaceSelectorMatchExpressions) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(values, __otherCasted.values);
    }
}
