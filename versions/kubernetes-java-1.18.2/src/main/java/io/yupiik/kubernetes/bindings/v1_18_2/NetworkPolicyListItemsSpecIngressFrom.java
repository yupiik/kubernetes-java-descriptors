package io.yupiik.kubernetes.bindings.v1_18_2;

import java.util.Objects;

public class NetworkPolicyListItemsSpecIngressFrom {
    private NetworkPolicyListItemsSpecIngressFromIpBlock ipBlock;
    private NetworkPolicyListItemsSpecIngressFromNamespaceSelector namespaceSelector;
    private NetworkPolicyListItemsSpecIngressFromPodSelector podSelector;

    public NetworkPolicyListItemsSpecIngressFrom() {
        // no-op
    }

    public NetworkPolicyListItemsSpecIngressFrom(final NetworkPolicyListItemsSpecIngressFromIpBlock ipBlock,
                                                 final NetworkPolicyListItemsSpecIngressFromNamespaceSelector namespaceSelector,
                                                 final NetworkPolicyListItemsSpecIngressFromPodSelector podSelector) {
        // no-op
    }

    public NetworkPolicyListItemsSpecIngressFromIpBlock getIpBlock() {
        return ipBlock;
    }

    public void setIpBlock(final NetworkPolicyListItemsSpecIngressFromIpBlock ipBlock) {
        this.ipBlock = ipBlock;
    }

    public NetworkPolicyListItemsSpecIngressFromNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final NetworkPolicyListItemsSpecIngressFromNamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public NetworkPolicyListItemsSpecIngressFromPodSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(final NetworkPolicyListItemsSpecIngressFromPodSelector podSelector) {
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
        if (!(__other instanceof NetworkPolicyListItemsSpecIngressFrom)) {
            return false;
        }
        final NetworkPolicyListItemsSpecIngressFrom __otherCasted = (NetworkPolicyListItemsSpecIngressFrom) __other;
        return Objects.equals(ipBlock, __otherCasted.ipBlock) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(podSelector, __otherCasted.podSelector);
    }
}
