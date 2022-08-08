package io.yupiik.kubernetes.bindings.v1_23_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_3.Validable;
import io.yupiik.kubernetes.bindings.v1_23_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NodeSelectorRequirement implements Validable<NodeSelectorRequirement> {
    private String key;
    private NodeSelectorRequirementOperator operator;
    private List<String> values;

    public NodeSelectorRequirement() {
        // no-op
    }

    public NodeSelectorRequirement(final String key,
                                   final NodeSelectorRequirementOperator operator,
                                   final List<String> values) {
        // no-op
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public NodeSelectorRequirementOperator getOperator() {
        return operator;
    }

    public void setOperator(final NodeSelectorRequirementOperator operator) {
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
        if (!(__other instanceof NodeSelectorRequirement)) {
            return false;
        }
        final NodeSelectorRequirement __otherCasted = (NodeSelectorRequirement) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(values, __otherCasted.values);
    }

    public NodeSelectorRequirement key(final String key) {
        this.key = key;
        return this;
    }

    public NodeSelectorRequirement operator(final NodeSelectorRequirementOperator operator) {
        this.operator = operator;
        return this;
    }

    public NodeSelectorRequirement values(final List<String> values) {
        this.values = values;
        return this;
    }

    @Override
    public NodeSelectorRequirement validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (key == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "key", "key",
                "Missing 'key' attribute.", true));
        }
        if (operator == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "operator", "operator",
                "Missing 'operator' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
