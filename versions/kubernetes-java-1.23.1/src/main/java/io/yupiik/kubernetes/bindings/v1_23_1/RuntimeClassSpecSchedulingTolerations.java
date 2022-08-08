package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class RuntimeClassSpecSchedulingTolerations {
    private RuntimeClassSpecSchedulingTolerationsEffect effect;
    private String key;
    private RuntimeClassSpecSchedulingTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public RuntimeClassSpecSchedulingTolerations() {
        // no-op
    }

    public RuntimeClassSpecSchedulingTolerations(final RuntimeClassSpecSchedulingTolerationsEffect effect,
                                                 final String key,
                                                 final RuntimeClassSpecSchedulingTolerationsOperator operator,
                                                 final Integer tolerationSeconds,
                                                 final String value) {
        // no-op
    }

    public RuntimeClassSpecSchedulingTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final RuntimeClassSpecSchedulingTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public RuntimeClassSpecSchedulingTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final RuntimeClassSpecSchedulingTolerationsOperator operator) {
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
        if (!(__other instanceof RuntimeClassSpecSchedulingTolerations)) {
            return false;
        }
        final RuntimeClassSpecSchedulingTolerations __otherCasted = (RuntimeClassSpecSchedulingTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
