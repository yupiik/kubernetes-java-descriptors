package io.yupiik.kubernetes.bindings.v1_10_3.v1beta2;

import java.util.Map;
import java.util.Objects;

public class ScaleStatus {
    private int replicas;
    private Map<String, String> selector;
    private String targetSelector;

    public ScaleStatus() {
        // no-op
    }

    public ScaleStatus(final int replicas,
                       final Map<String, String> selector,
                       final String targetSelector) {
        // no-op
    }

    public int getReplicas() {
        return replicas;
    }

    public void setReplicas(final int replicas) {
        this.replicas = replicas;
    }

    public Map<String, String> getSelector() {
        return selector;
    }

    public void setSelector(final Map<String, String> selector) {
        this.selector = selector;
    }

    public String getTargetSelector() {
        return targetSelector;
    }

    public void setTargetSelector(final String targetSelector) {
        this.targetSelector = targetSelector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                replicas,
                selector,
                targetSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ScaleStatus)) {
            return false;
        }
        final ScaleStatus __otherCasted = (ScaleStatus) __other;
        return Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(targetSelector, __otherCasted.targetSelector);
    }
}
