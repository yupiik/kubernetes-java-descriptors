package io.yupiik.kubernetes.bindings.v1_17_7;

import java.util.Objects;

public class NetworkPolicySpecIngressFrom {
    private NetworkPolicySpecIngressFromIpBlock ipBlock;
    private NetworkPolicySpecIngressFromNamespaceSelector namespaceSelector;
    private NetworkPolicySpecIngressFromPodSelector podSelector;

    public NetworkPolicySpecIngressFrom() {
        // no-op
    }

    public NetworkPolicySpecIngressFrom(final NetworkPolicySpecIngressFromIpBlock ipBlock,
                                        final NetworkPolicySpecIngressFromNamespaceSelector namespaceSelector,
                                        final NetworkPolicySpecIngressFromPodSelector podSelector) {
        // no-op
    }

    public NetworkPolicySpecIngressFromIpBlock getIpBlock() {
        return ipBlock;
    }

    public void setIpBlock(final NetworkPolicySpecIngressFromIpBlock ipBlock) {
        this.ipBlock = ipBlock;
    }

    public NetworkPolicySpecIngressFromNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final NetworkPolicySpecIngressFromNamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public NetworkPolicySpecIngressFromPodSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(final NetworkPolicySpecIngressFromPodSelector podSelector) {
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
        if (!(__other instanceof NetworkPolicySpecIngressFrom)) {
            return false;
        }
        final NetworkPolicySpecIngressFrom __otherCasted = (NetworkPolicySpecIngressFrom) __other;
        return Objects.equals(ipBlock, __otherCasted.ipBlock) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(podSelector, __otherCasted.podSelector);
    }
}
