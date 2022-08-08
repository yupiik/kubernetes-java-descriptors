package io.yupiik.kubernetes.bindings.v1_23_4.v1alpha1;

import java.util.Objects;

public class RuntimeClassListItemsSpecSchedulingTolerations {
    private RuntimeClassListItemsSpecSchedulingTolerationsEffect effect;
    private String key;
    private RuntimeClassListItemsSpecSchedulingTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public RuntimeClassListItemsSpecSchedulingTolerations() {
        // no-op
    }

    public RuntimeClassListItemsSpecSchedulingTolerations(final RuntimeClassListItemsSpecSchedulingTolerationsEffect effect,
                                                          final String key,
                                                          final RuntimeClassListItemsSpecSchedulingTolerationsOperator operator,
                                                          final Integer tolerationSeconds,
                                                          final String value) {
        // no-op
    }

    public RuntimeClassListItemsSpecSchedulingTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final RuntimeClassListItemsSpecSchedulingTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public RuntimeClassListItemsSpecSchedulingTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final RuntimeClassListItemsSpecSchedulingTolerationsOperator operator) {
        this.operator = operator;
    }

    public Integer getTolerationSeconds() {
        return tolerationSeconds;
    }

    public void setTolerationSeconds(final Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                effect,
                key,
                operator,
                tolerationSeconds,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClassListItemsSpecSchedulingTolerations)) {
            return false;
        }
        final RuntimeClassListItemsSpecSchedulingTolerations __otherCasted = (RuntimeClassListItemsSpecSchedulingTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
