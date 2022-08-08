package io.yupiik.kubernetes.bindings.v1_16_4;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NetworkPolicyListItemsSpecIngressFromPodSelector {
    private List<NetworkPolicyListItemsSpecIngressFromPodSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public NetworkPolicyListItemsSpecIngressFromPodSelector() {
        // no-op
    }

    public NetworkPolicyListItemsSpecIngressFromPodSelector(final List<NetworkPolicyListItemsSpecIngressFromPodSelectorMatchExpressions> matchExpressions,
                                                            final Map<String, String> matchLabels) {
        // no-op
    }

    public List<NetworkPolicyListItemsSpecIngressFromPodSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NetworkPolicyListItemsSpecIngressFromPodSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof NetworkPolicyListItemsSpecIngressFromPodSelector)) {
            return false;
        }
        final NetworkPolicyListItemsSpecIngressFromPodSelector __otherCasted = (NetworkPolicyListItemsSpecIngressFromPodSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
