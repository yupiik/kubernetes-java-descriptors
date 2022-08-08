package io.yupiik.kubernetes.bindings.v1_23_8.v1;

import java.util.List;
import java.util.Objects;

public class ServiceStatus {
    private List<ServiceStatusConditions> conditions;
    private ServiceStatusLoadBalancer loadBalancer;

    public ServiceStatus() {
        // no-op
    }

    public ServiceStatus(final List<ServiceStatusConditions> conditions,
                         final ServiceStatusLoadBalancer loadBalancer) {
        // no-op
    }

    public List<ServiceStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<ServiceStatusConditions> conditions) {
        this.conditions = conditions;
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
                conditions,
                loadBalancer);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceStatus)) {
            return false;
        }
        final ServiceStatus __otherCasted = (ServiceStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(loadBalancer, __otherCasted.loadBalancer);
    }
}
