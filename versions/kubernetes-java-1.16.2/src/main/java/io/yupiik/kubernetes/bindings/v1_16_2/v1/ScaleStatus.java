package io.yupiik.kubernetes.bindings.v1_16_2.v1;

import io.yupiik.kubernetes.bindings.v1_16_2.Validable;
import io.yupiik.kubernetes.bindings.v1_16_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScaleStatus implements Validable<ScaleStatus> {
    private int replicas;
    private String selector;

    public ScaleStatus() {
        // no-op
    }

    public ScaleStatus(final int replicas,
                       final String selector) {
        // no-op
    }

    public int getReplicas() {
        return replicas;
    }

    public void setReplicas(final int replicas) {
        this.replicas = replicas;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(final String selector) {
        this.selector = selector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                replicas,
                selector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ScaleStatus)) {
            return false;
        }
        final ScaleStatus __otherCasted = (ScaleStatus) __other;
        return Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(selector, __otherCasted.selector);
    }

    public ScaleStatus replicas(final int replicas) {
        this.replicas = replicas;
        return this;
    }

    public ScaleStatus selector(final String selector) {
        this.selector = selector;
        return this;
    }

    @Override
    public ScaleStatus validate() {
        return this;
    }
}
