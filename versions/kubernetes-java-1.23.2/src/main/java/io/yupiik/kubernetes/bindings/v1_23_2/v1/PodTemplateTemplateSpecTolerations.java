package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecTolerations {
    private PodTemplateTemplateSpecTolerationsEffect effect;
    private String key;
    private PodTemplateTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public PodTemplateTemplateSpecTolerations() {
        // no-op
    }

    public PodTemplateTemplateSpecTolerations(final PodTemplateTemplateSpecTolerationsEffect effect,
                                              final String key,
                                              final PodTemplateTemplateSpecTolerationsOperator operator,
                                              final Integer tolerationSeconds,
                                              final String value) {
        // no-op
    }

    public PodTemplateTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final PodTemplateTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public PodTemplateTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final PodTemplateTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof PodTemplateTemplateSpecTolerations)) {
            return false;
        }
        final PodTemplateTemplateSpecTolerations __otherCasted = (PodTemplateTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
