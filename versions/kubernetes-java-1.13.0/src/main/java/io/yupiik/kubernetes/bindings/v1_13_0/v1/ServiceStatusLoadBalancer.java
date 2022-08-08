package io.yupiik.kubernetes.bindings.v1_13_0.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ServiceStatusLoadBalancer {
    private List<JsonValue> ingress;

    public ServiceStatusLoadBalancer() {
        // no-op
    }

    public ServiceStatusLoadBalancer(final List<JsonValue> ingress) {
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
        if (!(__other instanceof ServiceStatusLoadBalancer)) {
            return false;
        }
        final ServiceStatusLoadBalancer __otherCasted = (ServiceStatusLoadBalancer) __other;
        return Objects.equals(ingress, __otherCasted.ingress);
    }
}
