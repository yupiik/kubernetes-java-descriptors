package io.yupiik.kubernetes.bindings.v1_15_7.v1beta1;

import java.util.Objects;

public class NetworkPolicySpecEgressTo {
    private NetworkPolicySpecEgressToIpBlock ipBlock;
    private NetworkPolicySpecEgressToNamespaceSelector namespaceSelector;
    private NetworkPolicySpecEgressToPodSelector podSelector;

    public NetworkPolicySpecEgressTo() {
        // no-op
    }

    public NetworkPolicySpecEgressTo(final NetworkPolicySpecEgressToIpBlock ipBlock,
                                     final NetworkPolicySpecEgressToNamespaceSelector namespaceSelector,
                                     final NetworkPolicySpecEgressToPodSelector podSelector) {
        // no-op
    }

    public NetworkPolicySpecEgressToIpBlock getIpBlock() {
        return ipBlock;
    }

    public void setIpBlock(final NetworkPolicySpecEgressToIpBlock ipBlock) {
        this.ipBlock = ipBlock;
    }

    public NetworkPolicySpecEgressToNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final NetworkPolicySpecEgressToNamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public NetworkPolicySpecEgressToPodSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(final NetworkPolicySpecEgressToPodSelector podSelector) {
        this.podSelector = podSelector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ipBlock,
                namespaceSelector,
                podSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicySpecEgressTo)) {
            return false;
        }
        final NetworkPolicySpecEgressTo __otherCasted = (NetworkPolicySpecEgressTo) __other;
        return Objects.equals(ipBlock, __otherCasted.ipBlock) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(podSelector, __otherCasted.podSelector);
    }
}
