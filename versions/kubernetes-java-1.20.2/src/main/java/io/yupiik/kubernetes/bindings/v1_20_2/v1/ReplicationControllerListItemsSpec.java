package io.yupiik.kubernetes.bindings.v1_20_2.v1;

import java.util.Map;
import java.util.Objects;

public class ReplicationControllerListItemsSpec {
    private Integer minReadySeconds;
    private Integer replicas;
    private Map<String, String> selector;
    private ReplicationControllerListItemsSpecTemplate template;

    public ReplicationControllerListItemsSpec() {
        // no-op
    }

    public ReplicationControllerListItemsSpec(final Integer minReadySeconds,
                                              final Integer replicas,
                                              final Map<String, String> selector,
                                              final ReplicationControllerListItemsSpecTemplate template) {
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

    public Map<String, String> getSelector() {
        return selector;
    }

    public void setSelector(final Map<String, String> selector) {
        this.selector = selector;
    }

    public ReplicationControllerListItemsSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final ReplicationControllerListItemsSpecTemplate template) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpec)) {
            return false;
        }
        final ReplicationControllerListItemsSpec __otherCasted = (ReplicationControllerListItemsSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template);
    }
}
