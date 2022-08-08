package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.Objects;

public class PodListItemsSpecTolerations {
    private PodListItemsSpecTolerationsEffect effect;
    private String key;
    private PodListItemsSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public PodListItemsSpecTolerations() {
        // no-op
    }

    public PodListItemsSpecTolerations(final PodListItemsSpecTolerationsEffect effect,
                                       final String key,
                                       final PodListItemsSpecTolerationsOperator operator,
                                       final Integer tolerationSeconds,
                                       final String value) {
        // no-op
    }

    public PodListItemsSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final PodListItemsSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public PodListItemsSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final PodListItemsSpecTolerationsOperator operator) {
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
        if (!(__other instanceof PodListItemsSpecTolerations)) {
            return false;
        }
        final PodListItemsSpecTolerations __otherCasted = (PodListItemsSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
