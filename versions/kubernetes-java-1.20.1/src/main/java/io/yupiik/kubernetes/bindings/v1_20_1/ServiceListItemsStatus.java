package io.yupiik.kubernetes.bindings.v1_20_1;

import java.util.List;
import java.util.Objects;

public class ServiceListItemsStatus {
    private List<ServiceListItemsStatusConditions> conditions;
    private ServiceListItemsStatusLoadBalancer loadBalancer;

    public ServiceListItemsStatus() {
        // no-op
    }

    public ServiceListItemsStatus(final List<ServiceListItemsStatusConditions> conditions,
                                  final ServiceListItemsStatusLoadBalancer loadBalancer) {
        // no-op
    }

    public List<ServiceListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<ServiceListItemsStatusConditions> conditions) {
        this.conditions = conditions;
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
                conditions,
                loadBalancer);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceListItemsStatus)) {
            return false;
        }
        final ServiceListItemsStatus __otherCasted = (ServiceListItemsStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(loadBalancer, __otherCasted.loadBalancer);
    }
}
