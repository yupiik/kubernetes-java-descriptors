package io.yupiik.kubernetes.bindings.v1_18_12;

import java.util.List;
import java.util.Objects;

public class NetworkPolicyListItemsSpec {
    private List<NetworkPolicyListItemsSpecEgress> egress;
    private List<NetworkPolicyListItemsSpecIngress> ingress;
    private NetworkPolicyListItemsSpecPodSelector podSelector;
    private List<String> policyTypes;

    public NetworkPolicyListItemsSpec() {
        // no-op
    }

    public NetworkPolicyListItemsSpec(final List<NetworkPolicyListItemsSpecEgress> egress,
                                      final List<NetworkPolicyListItemsSpecIngress> ingress,
                                      final NetworkPolicyListItemsSpecPodSelector podSelector,
                                      final List<String> policyTypes) {
        // no-op
    }

    public List<NetworkPolicyListItemsSpecEgress> getEgress() {
        return egress;
    }

    public void setEgress(final List<NetworkPolicyListItemsSpecEgress> egress) {
        this.egress = egress;
    }

    public List<NetworkPolicyListItemsSpecIngress> getIngress() {
        return ingress;
    }

    public void setIngress(final List<NetworkPolicyListItemsSpecIngress> ingress) {
        this.ingress = ingress;
    }

    public NetworkPolicyListItemsSpecPodSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(final NetworkPolicyListItemsSpecPodSelector podSelector) {
        this.podSelector = podSelector;
    }

    public List<String> getPolicyTypes() {
        return policyTypes;
    }

    public void setPolicyTypes(final List<String> policyTypes) {
        this.policyTypes = policyTypes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                egress,
                ingress,
                podSelector,
                policyTypes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyListItemsSpec)) {
            return false;
        }
        final NetworkPolicyListItemsSpec __otherCasted = (NetworkPolicyListItemsSpec) __other;
        return Objects.equals(egress, __otherCasted.egress) &&
            Objects.equals(ingress, __otherCasted.ingress) &&
            Objects.equals(podSelector, __otherCasted.podSelector) &&
            Objects.equals(policyTypes, __otherCasted.policyTypes);
    }
}
