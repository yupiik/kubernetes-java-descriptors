package io.yupiik.kubernetes.bindings.v1_12_5.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class IngressStatusLoadBalancer {
    private List<JsonValue> ingress;

    public IngressStatusLoadBalancer() {
        // no-op
    }

    public IngressStatusLoadBalancer(final List<JsonValue> ingress) {
        // no-op
    }

    public List<JsonValue> getIngress() {
        return ingress;
    }

    public void setIngress(final List<JsonValue> ingress) {
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
