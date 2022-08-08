package io.yupiik.kubernetes.bindings.v1_20_15.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NetworkPolicySpecIngressFromPodSelector {
    private List<NetworkPolicySpecIngressFromPodSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public NetworkPolicySpecIngressFromPodSelector() {
        // no-op
    }

    public NetworkPolicySpecIngressFromPodSelector(final List<NetworkPolicySpecIngressFromPodSelectorMatchExpressions> matchExpressions,
                                                   final Map<String, String> matchLabels) {
        // no-op
    }

    public List<NetworkPolicySpecIngressFromPodSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NetworkPolicySpecIngressFromPodSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof NetworkPolicySpecIngressFromPodSelector)) {
            return false;
        }
        final NetworkPolicySpecIngressFromPodSelector __otherCasted = (NetworkPolicySpecIngressFromPodSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
