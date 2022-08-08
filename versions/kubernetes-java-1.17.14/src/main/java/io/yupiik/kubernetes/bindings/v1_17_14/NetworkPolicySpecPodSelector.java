package io.yupiik.kubernetes.bindings.v1_17_14;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NetworkPolicySpecPodSelector {
    private List<NetworkPolicySpecPodSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public NetworkPolicySpecPodSelector() {
        // no-op
    }

    public NetworkPolicySpecPodSelector(final List<NetworkPolicySpecPodSelectorMatchExpressions> matchExpressions,
                                        final Map<String, String> matchLabels) {
        // no-op
    }

    public List<NetworkPolicySpecPodSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NetworkPolicySpecPodSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof NetworkPolicySpecPodSelector)) {
            return false;
        }
        final NetworkPolicySpecPodSelector __otherCasted = (NetworkPolicySpecPodSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
