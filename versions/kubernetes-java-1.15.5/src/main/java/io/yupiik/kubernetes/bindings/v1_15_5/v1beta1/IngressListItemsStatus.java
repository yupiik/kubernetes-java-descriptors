package io.yupiik.kubernetes.bindings.v1_15_5.v1beta1;

import java.util.Objects;

public class IngressListItemsStatus {
    private IngressListItemsStatusLoadBalancer loadBalancer;

    public IngressListItemsStatus() {
        // no-op
    }

    public IngressListItemsStatus(final IngressListItemsStatusLoadBalancer loadBalancer) {
        // no-op
    }

    public IngressListItemsStatusLoadBalancer getLoadBalancer() {
        return loadBalancer;
    }

    public void setLoadBalancer(final IngressListItemsStatusLoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                loadBalancer);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressListItemsStatus)) {
            return false;
        }
        final IngressListItemsStatus __otherCasted = (IngressListItemsStatus) __other;
        return Objects.equals(loadBalancer, __otherCasted.loadBalancer);
    }
}
