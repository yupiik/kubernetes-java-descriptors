package io.yupiik.kubernetes.bindings.v1_14_0.v1;

import java.util.Objects;

public class NodeListItemsSpecTaints {
    private String effect;
    private String key;
    private String timeAdded;
    private String value;

    public NodeListItemsSpecTaints() {
        // no-op
    }

    public NodeListItemsSpecTaints(final String effect,
                                   final String key,
                                   final String timeAdded,
                                   final String value) {
        // no-op
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(final String effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(final String timeAdded) {
        this.timeAdded = timeAdded;
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
                timeAdded,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeListItemsSpecTaints)) {
            return false;
        }
        final NodeListItemsSpecTaints __otherCasted = (NodeListItemsSpecTaints) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(timeAdded, __otherCasted.timeAdded) &&
            Objects.equals(value, __otherCasted.value);
    }
}
