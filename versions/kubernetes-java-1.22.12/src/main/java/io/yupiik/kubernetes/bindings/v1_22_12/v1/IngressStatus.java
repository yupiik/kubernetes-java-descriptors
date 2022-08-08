package io.yupiik.kubernetes.bindings.v1_22_12.v1;

import io.yupiik.kubernetes.bindings.v1_22_12.Validable;
import io.yupiik.kubernetes.bindings.v1_22_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngressStatus implements Validable<IngressStatus> {
    private LoadBalancerStatus loadBalancer;

    public IngressStatus() {
        // no-op
    }

    public IngressStatus(final LoadBalancerStatus loadBalancer) {
        // no-op
    }

    public LoadBalancerStatus getLoadBalancer() {
        return loadBalancer;
    }

    public void setLoadBalancer(final LoadBalancerStatus loadBalancer) {
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

    public IngressStatus loadBalancer(final LoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

    @Override
    public IngressStatus validate() {
        return this;
    }
}
