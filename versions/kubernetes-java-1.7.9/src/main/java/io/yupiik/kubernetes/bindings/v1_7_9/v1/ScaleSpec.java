package io.yupiik.kubernetes.bindings.v1_7_9.v1;

import io.yupiik.kubernetes.bindings.v1_7_9.Validable;
import io.yupiik.kubernetes.bindings.v1_7_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScaleSpec implements Validable<ScaleSpec> {
    private Integer replicas;

    public ScaleSpec() {
        // no-op
    }

    public ScaleSpec(final Integer replicas) {
        // no-op
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(final Integer replicas) {
        this.replicas = replicas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                replicas);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ScaleSpec)) {
            return false;
        }
        final ScaleSpec __otherCasted = (ScaleSpec) __other;
        return Objects.equals(replicas, __otherCasted.replicas);
    }

    public ScaleSpec replicas(final Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    @Override
    public ScaleSpec validate() {
        return this;
    }
}
