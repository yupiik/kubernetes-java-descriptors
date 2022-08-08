package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import io.yupiik.kubernetes.bindings.v1_23_2.Validable;
import io.yupiik.kubernetes.bindings.v1_23_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScopedResourceSelectorRequirement implements Validable<ScopedResourceSelectorRequirement> {
    private ScopedResourceSelectorRequirementOperator operator;
    private ScopedResourceSelectorRequirementScopeName scopeName;
    private List<String> values;

    public ScopedResourceSelectorRequirement() {
        // no-op
    }

    public ScopedResourceSelectorRequirement(final ScopedResourceSelectorRequirementOperator operator,
                                             final ScopedResourceSelectorRequirementScopeName scopeName,
                                             final List<String> values) {
        // no-op
    }

    public ScopedResourceSelectorRequirementOperator getOperator() {
        return operator;
    }

    public void setOperator(final ScopedResourceSelectorRequirementOperator operator) {
        this.operator = operator;
    }

    public ScopedResourceSelectorRequirementScopeName getScopeName() {
        return scopeName;
    }

    public void setScopeName(final ScopedResourceSelectorRequirementScopeName scopeName) {
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
        if (!(__other instanceof ScopedResourceSelectorRequirement)) {
            return false;
        }
        final ScopedResourceSelectorRequirement __otherCasted = (ScopedResourceSelectorRequirement) __other;
        return Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(scopeName, __otherCasted.scopeName) &&
            Objects.equals(values, __otherCasted.values);
    }

    public ScopedResourceSelectorRequirement operator(final ScopedResourceSelectorRequirementOperator operator) {
        this.operator = operator;
        return this;
    }

    public ScopedResourceSelectorRequirement scopeName(final ScopedResourceSelectorRequirementScopeName scopeName) {
        this.scopeName = scopeName;
        return this;
    }

    public ScopedResourceSelectorRequirement values(final List<String> values) {
        this.values = values;
        return this;
    }

    @Override
    public ScopedResourceSelectorRequirement validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (operator == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "operator", "operator",
                "Missing 'operator' attribute.", true));
        }
        if (scopeName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "scopeName", "scopeName",
                "Missing 'scopeName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
