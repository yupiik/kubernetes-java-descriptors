package io.yupiik.kubernetes.bindings.v1_13_9.v1beta2;

import io.yupiik.kubernetes.bindings.v1_13_9.Validable;
import io.yupiik.kubernetes.bindings.v1_13_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LabelSelectorRequirement implements Validable<LabelSelectorRequirement> {
    private String key;
    private String operator;
    private List<String> values;

    public LabelSelectorRequirement() {
        // no-op
    }

    public LabelSelectorRequirement(final String key,
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
        if (!(__other instanceof LabelSelectorRequirement)) {
            return false;
        }
        final LabelSelectorRequirement __otherCasted = (LabelSelectorRequirement) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(values, __otherCasted.values);
    }

    public LabelSelectorRequirement key(final String key) {
        this.key = key;
        return this;
    }

    public LabelSelectorRequirement operator(final String operator) {
        this.operator = operator;
        return this;
    }

    public LabelSelectorRequirement values(final List<String> values) {
        this.values = values;
        return this;
    }

    @Override
    public LabelSelectorRequirement validate() {
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
