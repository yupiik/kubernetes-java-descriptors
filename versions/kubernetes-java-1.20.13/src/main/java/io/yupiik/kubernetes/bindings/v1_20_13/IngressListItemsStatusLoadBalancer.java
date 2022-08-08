package io.yupiik.kubernetes.bindings.v1_20_13;

import java.util.List;
import java.util.Objects;

public class IngressListItemsStatusLoadBalancer {
    private List<IngressListItemsStatusLoadBalancerIngress> ingress;

    public IngressListItemsStatusLoadBalancer() {
        // no-op
    }

    public IngressListItemsStatusLoadBalancer(final List<IngressListItemsStatusLoadBalancerIngress> ingress) {
        // no-op
    }

    public List<IngressListItemsStatusLoadBalancerIngress> getIngress() {
        return ingress;
    }

    public void setIngress(final List<IngressListItemsStatusLoadBalancerIngress> ingress) {
        this.ingress = ingress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ingress);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressListItemsStatusLoadBalancer)) {
            return false;
        }
        final IngressListItemsStatusLoadBalancer __otherCasted = (IngressListItemsStatusLoadBalancer) __other;
        return Objects.equals(ingress, __otherCasted.ingress);
    }
}
