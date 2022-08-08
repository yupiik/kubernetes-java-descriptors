package io.yupiik.kubernetes.bindings.v1_15_0;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NetworkPolicyListItemsSpecIngressFromNamespaceSelector {
    private List<NetworkPolicyListItemsSpecIngressFromNamespaceSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public NetworkPolicyListItemsSpecIngressFromNamespaceSelector() {
        // no-op
    }

    public NetworkPolicyListItemsSpecIngressFromNamespaceSelector(final List<NetworkPolicyListItemsSpecIngressFromNamespaceSelectorMatchExpressions> matchExpressions,
                                                                  final Map<String, String> matchLabels) {
        // no-op
    }

    public List<NetworkPolicyListItemsSpecIngressFromNamespaceSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NetworkPolicyListItemsSpecIngressFromNamespaceSelectorMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public Map<String, String> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(final Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions,
                matchLabels);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyListItemsSpecIngressFromNamespaceSelector)) {
            return false;
        }
        final NetworkPolicyListItemsSpecIngressFromNamespaceSelector __otherCasted = (NetworkPolicyListItemsSpecIngressFromNamespaceSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
