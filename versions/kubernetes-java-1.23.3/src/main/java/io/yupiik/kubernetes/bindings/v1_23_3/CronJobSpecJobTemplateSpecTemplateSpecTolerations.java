package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecTolerations {
    private CronJobSpecJobTemplateSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private CronJobSpecJobTemplateSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public CronJobSpecJobTemplateSpecTemplateSpecTolerations() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecTolerations(final CronJobSpecJobTemplateSpecTemplateSpecTolerationsEffect effect,
                                                             final String key,
                                                             final CronJobSpecJobTemplateSpecTemplateSpecTolerationsOperator operator,
                                                             final Integer tolerationSeconds,
                                                             final String value) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final CronJobSpecJobTemplateSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final CronJobSpecJobTemplateSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecTolerations)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecTolerations __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
