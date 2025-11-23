package io.yupiik.kubernetes.bindings.v1_28_6.v1;

import io.yupiik.kubernetes.bindings.v1_28_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_6.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceStatus implements Validable<ServiceStatus>, Exportable {
    private List<Condition> conditions;
    private LoadBalancerStatus loadBalancer;

    public ServiceStatus() {
        // no-op
    }

    public ServiceStatus(final List<Condition> conditions,
                         final LoadBalancerStatus loadBalancer) {
        this.conditions = conditions;
        this.loadBalancer = loadBalancer;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<Condition> conditions) {
        this.conditions = conditions;
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

    public ServiceStatus conditions(final List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ServiceStatus loadBalancer(final LoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

    @Override
    public ServiceStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (loadBalancer != null ? "\"loadBalancer\":" + loadBalancer.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
