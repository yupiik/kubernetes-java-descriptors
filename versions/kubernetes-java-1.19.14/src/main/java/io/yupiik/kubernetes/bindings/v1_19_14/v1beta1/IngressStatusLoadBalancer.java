package io.yupiik.kubernetes.bindings.v1_19_14.v1beta1;

import java.util.List;
import java.util.Objects;

public class IngressStatusLoadBalancer {
    private List<IngressStatusLoadBalancerIngress> ingress;

    public IngressStatusLoadBalancer() {
        // no-op
    }

    public IngressStatusLoadBalancer(final List<IngressStatusLoadBalancerIngress> ingress) {
        // no-op
    }

    public List<IngressStatusLoadBalancerIngress> getIngress() {
        return ingress;
    }

    public void setIngress(final List<IngressStatusLoadBalancerIngress> ingress) {
        this.ingress = ingress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ingress);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressStatusLoadBalancer)) {
            return false;
        }
        final IngressStatusLoadBalancer __otherCasted = (IngressStatusLoadBalancer) __other;
        return Objects.equals(ingress, __otherCasted.ingress);
    }
}
