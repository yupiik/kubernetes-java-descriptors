package io.yupiik.kubernetes.bindings.v1_21_11.v1;

import java.util.List;
import java.util.Objects;

public class ServiceListItemsStatusLoadBalancer {
    private List<ServiceListItemsStatusLoadBalancerIngress> ingress;

    public ServiceListItemsStatusLoadBalancer() {
        // no-op
    }

    public ServiceListItemsStatusLoadBalancer(final List<ServiceListItemsStatusLoadBalancerIngress> ingress) {
        // no-op
    }

    public List<ServiceListItemsStatusLoadBalancerIngress> getIngress() {
        return ingress;
    }

    public void setIngress(final List<ServiceListItemsStatusLoadBalancerIngress> ingress) {
        this.ingress = ingress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ingress);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceListItemsStatusLoadBalancer)) {
            return false;
        }
        final ServiceListItemsStatusLoadBalancer __otherCasted = (ServiceListItemsStatusLoadBalancer) __other;
        return Objects.equals(ingress, __otherCasted.ingress);
    }
}
