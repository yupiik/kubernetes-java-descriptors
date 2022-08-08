package io.yupiik.kubernetes.bindings.v1_18_8.v1;

import java.util.List;
import java.util.Objects;

public class ResourceQuotaListItemsSpecScopeSelectorMatchExpressions {
    private String operator;
    private String scopeName;
    private List<String> values;

    public ResourceQuotaListItemsSpecScopeSelectorMatchExpressions() {
        // no-op
    }

    public ResourceQuotaListItemsSpecScopeSelectorMatchExpressions(final String operator,
                                                                   final String scopeName,
                                                                   final List<String> values) {
        // no-op
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(final String operator) {
        this.operator = operator;
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(final String scopeName) {
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
