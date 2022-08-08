package io.yupiik.kubernetes.bindings.v1_20_11.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpec {
    private Integer minReadySeconds;
    private Integer replicas;
    private ReplicaSetListItemsSpecSelector selector;
    private ReplicaSetListItemsSpecTemplate template;

    public ReplicaSetListItemsSpec() {
        // no-op
    }

    public ReplicaSetListItemsSpec(final Integer minReadySeconds,
                                   final Integer replicas,
                                   final ReplicaSetListItemsSpecSelector selector,
                                   final ReplicaSetListItemsSpecTemplate template) {
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

    public ReplicaSetListItemsSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final ReplicaSetListItemsSpecSelector selector) {
        this.selector = selector;
    }

    public ReplicaSetListItemsSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final ReplicaSetListItemsSpecTemplate template) {
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
        if (!(__other instanceof ReplicaSetListItemsSpec)) {
            return false;
        }
        final ReplicaSetListItemsSpec __otherCasted = (ReplicaSetListItemsSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template);
    }
}
