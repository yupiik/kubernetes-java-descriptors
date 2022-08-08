package io.yupiik.kubernetes.bindings.v1_22_11.v1beta1;

import java.util.Objects;

public class RuntimeClassSchedulingTolerations {
    private String effect;
    private String key;
    private String operator;
    private Integer tolerationSeconds;
    private String value;

    public RuntimeClassSchedulingTolerations() {
        // no-op
    }

    public RuntimeClassSchedulingTolerations(final String effect,
                                             final String key,
                                             final String operator,
                                             final Integer tolerationSeconds,
                                             final String value) {
        // no-op
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(final String effect) {
        this.effect = effect;
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
