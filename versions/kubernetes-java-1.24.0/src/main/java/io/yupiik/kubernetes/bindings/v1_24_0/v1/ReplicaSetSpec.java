package io.yupiik.kubernetes.bindings.v1_24_0.v1;

import java.util.Objects;

public class ReplicaSetSpec {
    private Integer minReadySeconds;
    private Integer replicas;
    private ReplicaSetSpecSelector selector;
    private ReplicaSetSpecTemplate template;

    public ReplicaSetSpec() {
        // no-op
    }

    public ReplicaSetSpec(final Integer minReadySeconds,
                          final Integer replicas,
                          final ReplicaSetSpecSelector selector,
                          final ReplicaSetSpecTemplate template) {
        // no-op
    }

    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    public void setMinReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(final Integer replicas) {
        this.replicas = replicas;
    }

    public ReplicaSetSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final ReplicaSetSpecSelector selector) {
        this.selector = selector;
    }

    public ReplicaSetSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final ReplicaSetSpecTemplate template) {
        this.template = template;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                minReadySeconds,
                replicas,
                selector,
                template);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpec)) {
            return false;
        }
        final ReplicaSetSpec __otherCasted = (ReplicaSetSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template);
    }
}
