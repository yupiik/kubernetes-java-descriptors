package io.yupiik.kubernetes.bindings.v1_7_4.v1;

import io.yupiik.kubernetes.bindings.v1_7_4.Validable;
import io.yupiik.kubernetes.bindings.v1_7_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NodeSpec implements Validable<NodeSpec> {
    private String externalID;
    private String podCIDR;
    private String providerID;
    private List<Taint> taints;
    private Boolean unschedulable;

    public NodeSpec() {
        // no-op
    }

    public NodeSpec(final String externalID,
                    final String podCIDR,
                    final String providerID,
                    final List<Taint> taints,
                    final Boolean unschedulable) {
        // no-op
    }

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(final String externalID) {
        this.externalID = externalID;
    }

    public String getPodCIDR() {
        return podCIDR;
    }

    public void setPodCIDR(final String podCIDR) {
        this.podCIDR = podCIDR;
    }

    public String getProviderID() {
        return providerID;
    }

    public void setProviderID(final String providerID) {
        this.providerID = providerID;
    }

    public List<Taint> getTaints() {
        return taints;
    }

    public void setTaints(final List<Taint> taints) {
        this.taints = taints;
    }

    public Boolean getUnschedulable() {
        return unschedulable;
    }

    public void setUnschedulable(final Boolean unschedulable) {
        this.unschedulable = unschedulable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                externalID,
                podCIDR,
                providerID,
                taints,
                unschedulable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeSpec)) {
            return false;
        }
        final NodeSpec __otherCasted = (NodeSpec) __other;
        return Objects.equals(externalID, __otherCasted.externalID) &&
            Objects.equals(podCIDR, __otherCasted.podCIDR) &&
            Objects.equals(providerID, __otherCasted.providerID) &&
            Objects.equals(taints, __otherCasted.taints) &&
            Objects.equals(unschedulable, __otherCasted.unschedulable);
    }

    public NodeSpec externalID(final String externalID) {
        this.externalID = externalID;
        return this;
    }

    public NodeSpec podCIDR(final String podCIDR) {
        this.podCIDR = podCIDR;
        return this;
    }

    public NodeSpec providerID(final String providerID) {
        this.providerID = providerID;
        return this;
    }

    public NodeSpec taints(final List<Taint> taints) {
        this.taints = taints;
        return this;
    }

    public NodeSpec unschedulable(final Boolean unschedulable) {
        this.unschedulable = unschedulable;
        return this;
    }

    @Override
    public NodeSpec validate() {
        return this;
    }
}
