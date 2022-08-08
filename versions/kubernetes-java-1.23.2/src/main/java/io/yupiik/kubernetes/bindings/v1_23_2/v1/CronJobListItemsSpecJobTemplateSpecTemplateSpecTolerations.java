package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerations {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerations() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerations(final CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerationsEffect effect,
                                                                      final String key,
                                                                      final CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerationsOperator operator,
                                                                      final Integer tolerationSeconds,
                                                                      final String value) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerations)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerations __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
