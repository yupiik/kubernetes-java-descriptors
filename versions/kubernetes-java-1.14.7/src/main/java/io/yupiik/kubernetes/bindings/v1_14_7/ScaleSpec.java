package io.yupiik.kubernetes.bindings.v1_14_7;

import java.util.Objects;

public class ScaleSpec {
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
}
