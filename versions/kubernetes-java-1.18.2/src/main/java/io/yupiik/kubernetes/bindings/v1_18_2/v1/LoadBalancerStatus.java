package io.yupiik.kubernetes.bindings.v1_18_2.v1;

import io.yupiik.kubernetes.bindings.v1_18_2.Validable;
import io.yupiik.kubernetes.bindings.v1_18_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoadBalancerStatus implements Validable<LoadBalancerStatus> {
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
}
