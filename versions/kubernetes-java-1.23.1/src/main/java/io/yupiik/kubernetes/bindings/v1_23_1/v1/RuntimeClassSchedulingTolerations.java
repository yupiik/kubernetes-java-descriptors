package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class RuntimeClassSchedulingTolerations {
    private RuntimeClassSchedulingTolerationsEffect effect;
    private String key;
    private RuntimeClassSchedulingTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public RuntimeClassSchedulingTolerations() {
        // no-op
    }

    public RuntimeClassSchedulingTolerations(final RuntimeClassSchedulingTolerationsEffect effect,
                                             final String key,
                                             final RuntimeClassSchedulingTolerationsOperator operator,
                                             final Integer tolerationSeconds,
                                             final String value) {
        // no-op
    }

    public RuntimeClassSchedulingTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final RuntimeClassSchedulingTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public RuntimeClassSchedulingTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final RuntimeClassSchedulingTolerationsOperator operator) {
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
        if (!(__other instanceof RuntimeClassSchedulingTolerations)) {
            return false;
        }
        final RuntimeClassSchedulingTolerations __otherCasted = (RuntimeClassSchedulingTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
