package io.yupiik.kubernetes.bindings.v1_11_10.v1;

import java.util.Objects;

public class ServiceStatus {
    private ServiceStatusLoadBalancer loadBalancer;

    public ServiceStatus() {
        // no-op
    }

    public ServiceStatus(final ServiceStatusLoadBalancer loadBalancer) {
        // no-op
    }

    public ServiceStatusLoadBalancer getLoadBalancer() {
        return loadBalancer;
    }

    public void setLoadBalancer(final ServiceStatusLoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                loadBalancer);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceStatus)) {
            return false;
        }
        final ServiceStatus __otherCasted = (ServiceStatus) __other;
        return Objects.equals(loadBalancer, __otherCasted.loadBalancer);
    }
}
