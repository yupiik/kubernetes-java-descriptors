package io.yupiik.kubernetes.bindings.v1_16_2.v1;

import java.util.List;
import java.util.Objects;

public class NetworkPolicySpec {
    private List<NetworkPolicySpecEgress> egress;
    private List<NetworkPolicySpecIngress> ingress;
    private NetworkPolicySpecPodSelector podSelector;
    private List<String> policyTypes;

    public NetworkPolicySpec() {
        // no-op
    }

    public NetworkPolicySpec(final List<NetworkPolicySpecEgress> egress,
                             final List<NetworkPolicySpecIngress> ingress,
                             final NetworkPolicySpecPodSelector podSelector,
                             final List<String> policyTypes) {
        // no-op
    }

    public List<NetworkPolicySpecEgress> getEgress() {
        return egress;
    }

    public void setEgress(final List<NetworkPolicySpecEgress> egress) {
        this.egress = egress;
    }

    public List<NetworkPolicySpecIngress> getIngress() {
        return ingress;
    }

    public void setIngress(final List<NetworkPolicySpecIngress> ingress) {
        this.ingress = ingress;
    }

    public NetworkPolicySpecPodSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(final NetworkPolicySpecPodSelector podSelector) {
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
        if (!(__other instanceof NetworkPolicySpec)) {
            return false;
        }
        final NetworkPolicySpec __otherCasted = (NetworkPolicySpec) __other;
        return Objects.equals(egress, __otherCasted.egress) &&
            Objects.equals(ingress, __otherCasted.ingress) &&
            Objects.equals(podSelector, __otherCasted.podSelector) &&
            Objects.equals(policyTypes, __otherCasted.policyTypes);
    }
}
