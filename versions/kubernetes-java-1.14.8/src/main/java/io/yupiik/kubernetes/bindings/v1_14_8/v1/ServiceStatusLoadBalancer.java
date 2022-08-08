package io.yupiik.kubernetes.bindings.v1_14_8.v1;

import java.util.List;
import java.util.Objects;

public class ServiceStatusLoadBalancer {
    private List<ServiceStatusLoadBalancerIngress> ingress;

    public ServiceStatusLoadBalancer() {
        // no-op
    }

    public ServiceStatusLoadBalancer(final List<ServiceStatusLoadBalancerIngress> ingress) {
        // no-op
    }

    public List<ServiceStatusLoadBalancerIngress> getIngress() {
        return ingress;
    }

    public void setIngress(final List<ServiceStatusLoadBalancerIngress> ingress) {
        this.ingress = ingress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ingress);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceStatusLoadBalancer)) {
            return false;
        }
        final ServiceStatusLoadBalancer __otherCasted = (ServiceStatusLoadBalancer) __other;
        return Objects.equals(ingress, __otherCasted.ingress);
    }
}
