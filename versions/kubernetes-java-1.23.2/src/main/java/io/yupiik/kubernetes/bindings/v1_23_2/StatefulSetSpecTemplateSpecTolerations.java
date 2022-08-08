package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecTolerations {
    private StatefulSetSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private StatefulSetSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public StatefulSetSpecTemplateSpecTolerations() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecTolerations(final StatefulSetSpecTemplateSpecTolerationsEffect effect,
                                                  final String key,
                                                  final StatefulSetSpecTemplateSpecTolerationsOperator operator,
                                                  final Integer tolerationSeconds,
                                                  final String value) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final StatefulSetSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public StatefulSetSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final StatefulSetSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecTolerations)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecTolerations __otherCasted = (StatefulSetSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
