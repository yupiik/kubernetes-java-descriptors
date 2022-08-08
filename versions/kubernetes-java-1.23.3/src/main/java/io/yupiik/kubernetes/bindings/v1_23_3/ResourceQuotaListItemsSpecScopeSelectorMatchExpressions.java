package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.List;
import java.util.Objects;

public class ResourceQuotaListItemsSpecScopeSelectorMatchExpressions {
    private ResourceQuotaListItemsSpecScopeSelectorMatchExpressionsOperator operator;
    private ResourceQuotaListItemsSpecScopeSelectorMatchExpressionsScopeName scopeName;
    private List<String> values;

    public ResourceQuotaListItemsSpecScopeSelectorMatchExpressions() {
        // no-op
    }

    public ResourceQuotaListItemsSpecScopeSelectorMatchExpressions(final ResourceQuotaListItemsSpecScopeSelectorMatchExpressionsOperator operator,
                                                                   final ResourceQuotaListItemsSpecScopeSelectorMatchExpressionsScopeName scopeName,
                                                                   final List<String> values) {
        // no-op
    }

    public ResourceQuotaListItemsSpecScopeSelectorMatchExpressionsOperator getOperator() {
        return operator;
    }

    public void setOperator(final ResourceQuotaListItemsSpecScopeSelectorMatchExpressionsOperator operator) {
        this.operator = operator;
    }

    public ResourceQuotaListItemsSpecScopeSelectorMatchExpressionsScopeName getScopeName() {
        return scopeName;
    }

    public void setScopeName(final ResourceQuotaListItemsSpecScopeSelectorMatchExpressionsScopeName scopeName) {
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
        if (!(__other instanceof ResourceQuotaListItemsSpecScopeSelectorMatchExpressions)) {
            return false;
        }
        final ResourceQuotaListItemsSpecScopeSelectorMatchExpressions __otherCasted = (ResourceQuotaListItemsSpecScopeSelectorMatchExpressions) __other;
        return Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(scopeName, __otherCasted.scopeName) &&
            Objects.equals(values, __otherCasted.values);
    }
}
