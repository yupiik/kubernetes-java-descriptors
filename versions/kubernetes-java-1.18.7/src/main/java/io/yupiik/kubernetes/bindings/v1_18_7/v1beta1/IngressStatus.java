package io.yupiik.kubernetes.bindings.v1_18_7.v1beta1;

import java.util.Objects;

public class IngressStatus {
    private IngressStatusLoadBalancer loadBalancer;

    public IngressStatus() {
        // no-op
    }

    public IngressStatus(final IngressStatusLoadBalancer loadBalancer) {
        // no-op
    }

    public IngressStatusLoadBalancer getLoadBalancer() {
        return loadBalancer;
    }

    public void setLoadBalancer(final IngressStatusLoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                loadBalancer);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressStatus)) {
            return false;
        }
        final IngressStatus __otherCasted = (IngressStatus) __other;
        return Objects.equals(loadBalancer, __otherCasted.loadBalancer);
    }
}
