package io.yupiik.kubernetes.bindings.v1_19_15.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NetworkPolicySpecIngressFromNamespaceSelector {
    private List<NetworkPolicySpecIngressFromNamespaceSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public NetworkPolicySpecIngressFromNamespaceSelector() {
        // no-op
    }

    public NetworkPolicySpecIngressFromNamespaceSelector(final List<NetworkPolicySpecIngressFromNamespaceSelectorMatchExpressions> matchExpressions,
                                                         final Map<String, String> matchLabels) {
        // no-op
    }

    public List<NetworkPolicySpecIngressFromNamespaceSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NetworkPolicySpecIngressFromNamespaceSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof NetworkPolicySpecIngressFromNamespaceSelector)) {
            return false;
        }
        final NetworkPolicySpecIngressFromNamespaceSelector __otherCasted = (NetworkPolicySpecIngressFromNamespaceSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
