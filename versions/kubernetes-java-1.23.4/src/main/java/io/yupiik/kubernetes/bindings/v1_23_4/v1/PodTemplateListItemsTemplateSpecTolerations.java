package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecTolerations {
    private PodTemplateListItemsTemplateSpecTolerationsEffect effect;
    private String key;
    private PodTemplateListItemsTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public PodTemplateListItemsTemplateSpecTolerations() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecTolerations(final PodTemplateListItemsTemplateSpecTolerationsEffect effect,
                                                       final String key,
                                                       final PodTemplateListItemsTemplateSpecTolerationsOperator operator,
                                                       final Integer tolerationSeconds,
                                                       final String value) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final PodTemplateListItemsTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public PodTemplateListItemsTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final PodTemplateListItemsTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecTolerations)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecTolerations __otherCasted = (PodTemplateListItemsTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
