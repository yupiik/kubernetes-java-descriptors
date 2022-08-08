package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecTolerations {
    private DaemonSetListItemsSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private DaemonSetListItemsSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public DaemonSetListItemsSpecTemplateSpecTolerations() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecTolerations(final DaemonSetListItemsSpecTemplateSpecTolerationsEffect effect,
                                                         final String key,
                                                         final DaemonSetListItemsSpecTemplateSpecTolerationsOperator operator,
                                                         final Integer tolerationSeconds,
                                                         final String value) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final DaemonSetListItemsSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public DaemonSetListItemsSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final DaemonSetListItemsSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecTolerations)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecTolerations __otherCasted = (DaemonSetListItemsSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
