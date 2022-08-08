package io.yupiik.kubernetes.bindings.v1_21_3.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NetworkPolicySpecEgressToNamespaceSelector {
    private List<NetworkPolicySpecEgressToNamespaceSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public NetworkPolicySpecEgressToNamespaceSelector() {
        // no-op
    }

    public NetworkPolicySpecEgressToNamespaceSelector(final List<NetworkPolicySpecEgressToNamespaceSelectorMatchExpressions> matchExpressions,
                                                      final Map<String, String> matchLabels) {
        // no-op
    }

    public List<NetworkPolicySpecEgressToNamespaceSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NetworkPolicySpecEgressToNamespaceSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof NetworkPolicySpecEgressToNamespaceSelector)) {
            return false;
        }
        final NetworkPolicySpecEgressToNamespaceSelector __otherCasted = (NetworkPolicySpecEgressToNamespaceSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
