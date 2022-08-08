package io.yupiik.kubernetes.bindings.v1_20_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_10.Validable;
import io.yupiik.kubernetes.bindings.v1_20_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SELinuxStrategyOptions implements Validable<SELinuxStrategyOptions> {
    private String rule;
    private SELinuxOptions seLinuxOptions;

    public SELinuxStrategyOptions() {
        // no-op
    }

    public SELinuxStrategyOptions(final String rule,
                                  final SELinuxOptions seLinuxOptions) {
        // no-op
    }

    public String getRule() {
        return rule;
    }

    public void setRule(final String rule) {
        this.rule = rule;
    }

    public SELinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rule,
                seLinuxOptions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SELinuxStrategyOptions)) {
            return false;
        }
        final SELinuxStrategyOptions __otherCasted = (SELinuxStrategyOptions) __other;
        return Objects.equals(rule, __otherCasted.rule) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions);
    }

    public SELinuxStrategyOptions rule(final String rule) {
        this.rule = rule;
        return this;
    }

    public SELinuxStrategyOptions seLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
        return this;
    }

    @Override
    public SELinuxStrategyOptions validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (rule == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "rule", "rule",
                "Missing 'rule' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
