package io.yupiik.kubernetes.bindings.v1_7_8.v1;

import io.yupiik.kubernetes.bindings.v1_7_8.Validable;
import io.yupiik.kubernetes.bindings.v1_7_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NetworkPolicyPeer implements Validable<NetworkPolicyPeer> {
    private LabelSelector namespaceSelector;
    private LabelSelector podSelector;

    public NetworkPolicyPeer() {
        // no-op
    }

    public NetworkPolicyPeer(final LabelSelector namespaceSelector,
                             final LabelSelector podSelector) {
        // no-op
    }

    public LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public LabelSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(final LabelSelector podSelector) {
        this.podSelector = podSelector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                namespaceSelector,
                podSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyPeer)) {
            return false;
        }
        final NetworkPolicyPeer __otherCasted = (NetworkPolicyPeer) __other;
        return Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(podSelector, __otherCasted.podSelector);
    }

    public NetworkPolicyPeer namespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public NetworkPolicyPeer podSelector(final LabelSelector podSelector) {
        this.podSelector = podSelector;
        return this;
    }

    @Override
    public NetworkPolicyPeer validate() {
        return this;
    }
}
