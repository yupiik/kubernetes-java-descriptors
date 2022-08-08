package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecTolerations {
    private StatefulSetListItemsSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private StatefulSetListItemsSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public StatefulSetListItemsSpecTemplateSpecTolerations() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecTolerations(final StatefulSetListItemsSpecTemplateSpecTolerationsEffect effect,
                                                           final String key,
                                                           final StatefulSetListItemsSpecTemplateSpecTolerationsOperator operator,
                                                           final Integer tolerationSeconds,
                                                           final String value) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final StatefulSetListItemsSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public StatefulSetListItemsSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final StatefulSetListItemsSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecTolerations)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecTolerations __otherCasted = (StatefulSetListItemsSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
