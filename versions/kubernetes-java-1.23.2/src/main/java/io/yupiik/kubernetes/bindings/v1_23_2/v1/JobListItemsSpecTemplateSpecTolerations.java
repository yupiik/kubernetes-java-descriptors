package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecTolerations {
    private JobListItemsSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private JobListItemsSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public JobListItemsSpecTemplateSpecTolerations() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecTolerations(final JobListItemsSpecTemplateSpecTolerationsEffect effect,
                                                   final String key,
                                                   final JobListItemsSpecTemplateSpecTolerationsOperator operator,
                                                   final Integer tolerationSeconds,
                                                   final String value) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final JobListItemsSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public JobListItemsSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final JobListItemsSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecTolerations)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecTolerations __otherCasted = (JobListItemsSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
