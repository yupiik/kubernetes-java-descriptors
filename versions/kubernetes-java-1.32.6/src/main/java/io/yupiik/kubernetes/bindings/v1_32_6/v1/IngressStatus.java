package io.yupiik.kubernetes.bindings.v1_32_6.v1;

import io.yupiik.kubernetes.bindings.v1_32_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_6.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressStatus implements Validable<IngressStatus>, Exportable {
    private IngressLoadBalancerStatus loadBalancer;

    public IngressStatus() {
        // no-op
    }

    public IngressStatus(final IngressLoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    public IngressLoadBalancerStatus getLoadBalancer() {
        return loadBalancer;
    }

    public void setLoadBalancer(final IngressLoadBalancerStatus loadBalancer) {
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

    public IngressStatus loadBalancer(final IngressLoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

    @Override
    public IngressStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (loadBalancer != null ? "\"loadBalancer\":" + loadBalancer.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
