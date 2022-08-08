package io.yupiik.kubernetes.bindings.v1_23_8;

import java.util.List;
import java.util.Objects;

public class NodeListItemsSpec {
    private NodeListItemsSpecConfigSource configSource;
    private String externalID;
    private String podCIDR;
    private List<String> podCIDRs;
    private String providerID;
    private List<NodeListItemsSpecTaints> taints;
    private Boolean unschedulable;

    public NodeListItemsSpec() {
        // no-op
    }

    public NodeListItemsSpec(final NodeListItemsSpecConfigSource configSource,
                             final String externalID,
                             final String podCIDR,
                             final List<String> podCIDRs,
                             final String providerID,
                             final List<NodeListItemsSpecTaints> taints,
                             final Boolean unschedulable) {
        // no-op
    }

    public NodeListItemsSpecConfigSource getConfigSource() {
        return configSource;
    }

    public void setConfigSource(final NodeListItemsSpecConfigSource configSource) {
        this.configSource = configSource;
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

    public List<String> getPodCIDRs() {
        return podCIDRs;
    }

    public void setPodCIDRs(final List<String> podCIDRs) {
        this.podCIDRs = podCIDRs;
    }

    public String getProviderID() {
        return providerID;
    }

    public void setProviderID(final String providerID) {
        this.providerID = providerID;
    }

    public List<NodeListItemsSpecTaints> getTaints() {
        return taints;
    }

    public void setTaints(final List<NodeListItemsSpecTaints> taints) {
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
                configSource,
                externalID,
                podCIDR,
                podCIDRs,
                providerID,
                taints,
                unschedulable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeListItemsSpec)) {
            return false;
        }
        final NodeListItemsSpec __otherCasted = (NodeListItemsSpec) __other;
        return Objects.equals(configSource, __otherCasted.configSource) &&
            Objects.equals(externalID, __otherCasted.externalID) &&
            Objects.equals(podCIDR, __otherCasted.podCIDR) &&
            Objects.equals(podCIDRs, __otherCasted.podCIDRs) &&
            Objects.equals(providerID, __otherCasted.providerID) &&
            Objects.equals(taints, __otherCasted.taints) &&
            Objects.equals(unschedulable, __otherCasted.unschedulable);
    }
}
