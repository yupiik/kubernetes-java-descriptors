package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecTolerations {
    private DaemonSetSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private DaemonSetSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public DaemonSetSpecTemplateSpecTolerations() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecTolerations(final DaemonSetSpecTemplateSpecTolerationsEffect effect,
                                                final String key,
                                                final DaemonSetSpecTemplateSpecTolerationsOperator operator,
                                                final Integer tolerationSeconds,
                                                final String value) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final DaemonSetSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public DaemonSetSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final DaemonSetSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecTolerations)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecTolerations __otherCasted = (DaemonSetSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
