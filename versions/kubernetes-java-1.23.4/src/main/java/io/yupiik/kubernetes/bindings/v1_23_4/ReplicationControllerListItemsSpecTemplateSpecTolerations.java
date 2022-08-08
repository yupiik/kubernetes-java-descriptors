package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecTolerations {
    private ReplicationControllerListItemsSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private ReplicationControllerListItemsSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public ReplicationControllerListItemsSpecTemplateSpecTolerations() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecTolerations(final ReplicationControllerListItemsSpecTemplateSpecTolerationsEffect effect,
                                                                     final String key,
                                                                     final ReplicationControllerListItemsSpecTemplateSpecTolerationsOperator operator,
                                                                     final Integer tolerationSeconds,
                                                                     final String value) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final ReplicationControllerListItemsSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public ReplicationControllerListItemsSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final ReplicationControllerListItemsSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecTolerations)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecTolerations __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
