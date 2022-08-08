package io.yupiik.kubernetes.bindings.v1_15_1.v1;

import java.util.Objects;

public class ServiceListItemsStatus {
    private ServiceListItemsStatusLoadBalancer loadBalancer;

    public ServiceListItemsStatus() {
        // no-op
    }

    public ServiceListItemsStatus(final ServiceListItemsStatusLoadBalancer loadBalancer) {
        // no-op
    }

    public ServiceListItemsStatusLoadBalancer getLoadBalancer() {
        return loadBalancer;
    }

    public void setLoadBalancer(final ServiceListItemsStatusLoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                loadBalancer);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceListItemsStatus)) {
            return false;
        }
        final ServiceListItemsStatus __otherCasted = (ServiceListItemsStatus) __other;
        return Objects.equals(loadBalancer, __otherCasted.loadBalancer);
    }
}
