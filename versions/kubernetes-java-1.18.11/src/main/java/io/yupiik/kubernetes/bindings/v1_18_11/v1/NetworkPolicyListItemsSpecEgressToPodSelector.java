package io.yupiik.kubernetes.bindings.v1_18_11.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NetworkPolicyListItemsSpecEgressToPodSelector {
    private List<NetworkPolicyListItemsSpecEgressToPodSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public NetworkPolicyListItemsSpecEgressToPodSelector() {
        // no-op
    }

    public NetworkPolicyListItemsSpecEgressToPodSelector(final List<NetworkPolicyListItemsSpecEgressToPodSelectorMatchExpressions> matchExpressions,
                                                         final Map<String, String> matchLabels) {
        // no-op
    }

    public List<NetworkPolicyListItemsSpecEgressToPodSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NetworkPolicyListItemsSpecEgressToPodSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof NetworkPolicyListItemsSpecEgressToPodSelector)) {
            return false;
        }
        final NetworkPolicyListItemsSpecEgressToPodSelector __otherCasted = (NetworkPolicyListItemsSpecEgressToPodSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
