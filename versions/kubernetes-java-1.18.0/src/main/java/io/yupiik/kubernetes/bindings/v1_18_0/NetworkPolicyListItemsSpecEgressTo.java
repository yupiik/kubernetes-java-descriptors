package io.yupiik.kubernetes.bindings.v1_18_0;

import java.util.Objects;

public class NetworkPolicyListItemsSpecEgressTo {
    private NetworkPolicyListItemsSpecEgressToIpBlock ipBlock;
    private NetworkPolicyListItemsSpecEgressToNamespaceSelector namespaceSelector;
    private NetworkPolicyListItemsSpecEgressToPodSelector podSelector;

    public NetworkPolicyListItemsSpecEgressTo() {
        // no-op
    }

    public NetworkPolicyListItemsSpecEgressTo(final NetworkPolicyListItemsSpecEgressToIpBlock ipBlock,
                                              final NetworkPolicyListItemsSpecEgressToNamespaceSelector namespaceSelector,
                                              final NetworkPolicyListItemsSpecEgressToPodSelector podSelector) {
        // no-op
    }

    public NetworkPolicyListItemsSpecEgressToIpBlock getIpBlock() {
        return ipBlock;
    }

    public void setIpBlock(final NetworkPolicyListItemsSpecEgressToIpBlock ipBlock) {
        this.ipBlock = ipBlock;
    }

    public NetworkPolicyListItemsSpecEgressToNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final NetworkPolicyListItemsSpecEgressToNamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public NetworkPolicyListItemsSpecEgressToPodSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(final NetworkPolicyListItemsSpecEgressToPodSelector podSelector) {
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
        if (!(__other instanceof NetworkPolicyListItemsSpecEgressTo)) {
            return false;
        }
        final NetworkPolicyListItemsSpecEgressTo __otherCasted = (NetworkPolicyListItemsSpecEgressTo) __other;
        return Objects.equals(ipBlock, __otherCasted.ipBlock) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(podSelector, __otherCasted.podSelector);
    }
}
