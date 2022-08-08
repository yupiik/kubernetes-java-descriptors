package io.yupiik.kubernetes.bindings.v1_7_14;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class NodeSpec {
    private String externalID;
    private String podCIDR;
    private String providerID;
    private List<JsonValue> taints;
    private Boolean unschedulable;

    public NodeSpec() {
        // no-op
    }

    public NodeSpec(final String externalID,
                    final String podCIDR,
                    final String providerID,
                    final List<JsonValue> taints,
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

    public List<JsonValue> getTaints() {
        return taints;
    }

    public void setTaints(final List<JsonValue> taints) {
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
}
