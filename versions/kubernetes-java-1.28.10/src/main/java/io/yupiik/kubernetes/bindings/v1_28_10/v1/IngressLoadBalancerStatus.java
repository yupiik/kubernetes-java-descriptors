package io.yupiik.kubernetes.bindings.v1_28_10.v1;

import io.yupiik.kubernetes.bindings.v1_28_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_10.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressLoadBalancerStatus implements Validable<IngressLoadBalancerStatus>, Exportable {
    private List<IngressLoadBalancerIngress> ingress;

    public IngressLoadBalancerStatus() {
        // no-op
    }

    public IngressLoadBalancerStatus(final List<IngressLoadBalancerIngress> ingress) {
        this.ingress = ingress;
    }

    public List<IngressLoadBalancerIngress> getIngress() {
        return ingress;
    }

    public void setIngress(final List<IngressLoadBalancerIngress> ingress) {
        this.ingress = ingress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ingress);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressLoadBalancerStatus)) {
            return false;
        }
        final IngressLoadBalancerStatus __otherCasted = (IngressLoadBalancerStatus) __other;
        return Objects.equals(ingress, __otherCasted.ingress);
    }

    public IngressLoadBalancerStatus ingress(final List<IngressLoadBalancerIngress> ingress) {
        this.ingress = ingress;
        return this;
    }

    @Override
    public IngressLoadBalancerStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ingress != null ? "\"ingress\":" + ingress.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
