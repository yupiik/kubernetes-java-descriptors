package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class JobSpecTemplateSpecTolerations {
    private JobSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private JobSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public JobSpecTemplateSpecTolerations() {
        // no-op
    }

    public JobSpecTemplateSpecTolerations(final JobSpecTemplateSpecTolerationsEffect effect,
                                          final String key,
                                          final JobSpecTemplateSpecTolerationsOperator operator,
                                          final Integer tolerationSeconds,
                                          final String value) {
        // no-op
    }

    public JobSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final JobSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public JobSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final JobSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof JobSpecTemplateSpecTolerations)) {
            return false;
        }
        final JobSpecTemplateSpecTolerations __otherCasted = (JobSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
