package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.List;
import java.util.Objects;

public class ResourceQuotaSpecScopeSelectorMatchExpressions {
    private ResourceQuotaSpecScopeSelectorMatchExpressionsOperator operator;
    private ResourceQuotaSpecScopeSelectorMatchExpressionsScopeName scopeName;
    private List<String> values;

    public ResourceQuotaSpecScopeSelectorMatchExpressions() {
        // no-op
    }

    public ResourceQuotaSpecScopeSelectorMatchExpressions(final ResourceQuotaSpecScopeSelectorMatchExpressionsOperator operator,
                                                          final ResourceQuotaSpecScopeSelectorMatchExpressionsScopeName scopeName,
                                                          final List<String> values) {
        // no-op
    }

    public ResourceQuotaSpecScopeSelectorMatchExpressionsOperator getOperator() {
        return operator;
    }

    public void setOperator(final ResourceQuotaSpecScopeSelectorMatchExpressionsOperator operator) {
        this.operator = operator;
    }

    public ResourceQuotaSpecScopeSelectorMatchExpressionsScopeName getScopeName() {
        return scopeName;
    }

    public void setScopeName(final ResourceQuotaSpecScopeSelectorMatchExpressionsScopeName scopeName) {
        this.scopeName = scopeName;
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
                operator,
                scopeName,
                values);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceQuotaSpecScopeSelectorMatchExpressions)) {
            return false;
        }
        final ResourceQuotaSpecScopeSelectorMatchExpressions __otherCasted = (ResourceQuotaSpecScopeSelectorMatchExpressions) __other;
        return Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(scopeName, __otherCasted.scopeName) &&
            Objects.equals(values, __otherCasted.values);
    }
}
