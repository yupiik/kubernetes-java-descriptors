package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecTolerations {
    private ReplicaSetListItemsSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private ReplicaSetListItemsSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public ReplicaSetListItemsSpecTemplateSpecTolerations() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecTolerations(final ReplicaSetListItemsSpecTemplateSpecTolerationsEffect effect,
                                                          final String key,
                                                          final ReplicaSetListItemsSpecTemplateSpecTolerationsOperator operator,
                                                          final Integer tolerationSeconds,
                                                          final String value) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final ReplicaSetListItemsSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public ReplicaSetListItemsSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final ReplicaSetListItemsSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecTolerations)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecTolerations __otherCasted = (ReplicaSetListItemsSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
