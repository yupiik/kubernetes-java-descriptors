package io.yupiik.kubernetes.bindings.v1_30_11.v1;

import io.yupiik.kubernetes.bindings.v1_30_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_11.Validable;
import io.yupiik.kubernetes.bindings.v1_30_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SuccessPolicy implements Validable<SuccessPolicy>, Exportable {
    private List<SuccessPolicyRule> rules;

    public SuccessPolicy() {
        // no-op
    }

    public SuccessPolicy(final List<SuccessPolicyRule> rules) {
        this.rules = rules;
    }

    public List<SuccessPolicyRule> getRules() {
        return rules;
    }

    public void setRules(final List<SuccessPolicyRule> rules) {
        this.rules = rules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SuccessPolicy)) {
            return false;
        }
        final SuccessPolicy __otherCasted = (SuccessPolicy) __other;
        return Objects.equals(rules, __otherCasted.rules);
    }

    public SuccessPolicy rules(final List<SuccessPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public SuccessPolicy validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (rules == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "rules", "rules",
                "Missing 'rules' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (rules != null ? "\"rules\":" + rules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
