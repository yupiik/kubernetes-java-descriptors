package io.yupiik.kubernetes.bindings.v1_15_2.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NetworkPolicyListItemsSpecEgressToNamespaceSelector {
    private List<NetworkPolicyListItemsSpecEgressToNamespaceSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public NetworkPolicyListItemsSpecEgressToNamespaceSelector() {
        // no-op
    }

    public NetworkPolicyListItemsSpecEgressToNamespaceSelector(final List<NetworkPolicyListItemsSpecEgressToNamespaceSelectorMatchExpressions> matchExpressions,
                                                               final Map<String, String> matchLabels) {
        // no-op
    }

    public List<NetworkPolicyListItemsSpecEgressToNamespaceSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NetworkPolicyListItemsSpecEgressToNamespaceSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof NetworkPolicyListItemsSpecEgressToNamespaceSelector)) {
            return false;
        }
        final NetworkPolicyListItemsSpecEgressToNamespaceSelector __otherCasted = (NetworkPolicyListItemsSpecEgressToNamespaceSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
