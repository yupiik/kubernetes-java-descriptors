package io.yupiik.kubernetes.bindings.v1_22_0;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NetworkPolicyListItemsSpecPodSelector {
    private List<NetworkPolicyListItemsSpecPodSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public NetworkPolicyListItemsSpecPodSelector() {
        // no-op
    }

    public NetworkPolicyListItemsSpecPodSelector(final List<NetworkPolicyListItemsSpecPodSelectorMatchExpressions> matchExpressions,
                                                 final Map<String, String> matchLabels) {
        // no-op
    }

    public List<NetworkPolicyListItemsSpecPodSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NetworkPolicyListItemsSpecPodSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof NetworkPolicyListItemsSpecPodSelector)) {
            return false;
        }
        final NetworkPolicyListItemsSpecPodSelector __otherCasted = (NetworkPolicyListItemsSpecPodSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
