package io.yupiik.kubernetes.bindings.v1_14_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_14_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_8.Validable;
import io.yupiik.kubernetes.bindings.v1_14_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LoadBalancerStatus implements Validable<LoadBalancerStatus>, Exportable {
    private List<LoadBalancerIngress> ingress;

    public LoadBalancerStatus() {
        // no-op
    }

    public LoadBalancerStatus(final List<LoadBalancerIngress> ingress) {
        // no-op
    }

    public List<LoadBalancerIngress> getIngress() {
        return ingress;
    }

    public void setIngress(final List<LoadBalancerIngress> ingress) {
        this.ingress = ingress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ingress);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LoadBalancerStatus)) {
            return false;
        }
        final LoadBalancerStatus __otherCasted = (LoadBalancerStatus) __other;
        return Objects.equals(ingress, __otherCasted.ingress);
    }

    public LoadBalancerStatus ingress(final List<LoadBalancerIngress> ingress) {
        this.ingress = ingress;
        return this;
    }

    @Override
    public LoadBalancerStatus validate() {
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
