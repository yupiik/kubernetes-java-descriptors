package io.yupiik.kubernetes.bindings.v1_17_5.v1;

import io.yupiik.kubernetes.bindings.v1_17_5.Validable;
import io.yupiik.kubernetes.bindings.v1_17_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceStatus implements Validable<ServiceStatus> {
    private LoadBalancerStatus loadBalancer;

    public ServiceStatus() {
        // no-op
    }

    public ServiceStatus(final LoadBalancerStatus loadBalancer) {
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
        if (!(__other instanceof ServiceStatus)) {
            return false;
        }
        final ServiceStatus __otherCasted = (ServiceStatus) __other;
        return Objects.equals(loadBalancer, __otherCasted.loadBalancer);
    }

    public ServiceStatus loadBalancer(final LoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

    @Override
    public ServiceStatus validate() {
        return this;
    }
}
