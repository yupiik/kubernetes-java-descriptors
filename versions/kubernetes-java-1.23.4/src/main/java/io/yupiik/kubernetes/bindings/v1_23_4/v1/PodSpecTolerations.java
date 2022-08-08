package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class PodSpecTolerations {
    private PodSpecTolerationsEffect effect;
    private String key;
    private PodSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public PodSpecTolerations() {
        // no-op
    }

    public PodSpecTolerations(final PodSpecTolerationsEffect effect,
                              final String key,
                              final PodSpecTolerationsOperator operator,
                              final Integer tolerationSeconds,
                              final String value) {
        // no-op
    }

    public PodSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final PodSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public PodSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final PodSpecTolerationsOperator operator) {
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
        if (!(__other instanceof PodSpecTolerations)) {
            return false;
        }
        final PodSpecTolerations __otherCasted = (PodSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
