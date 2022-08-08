package io.yupiik.kubernetes.bindings.v1_19_16.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NetworkPolicySpecEgressToPodSelector {
    private List<NetworkPolicySpecEgressToPodSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public NetworkPolicySpecEgressToPodSelector() {
        // no-op
    }

    public NetworkPolicySpecEgressToPodSelector(final List<NetworkPolicySpecEgressToPodSelectorMatchExpressions> matchExpressions,
                                                final Map<String, String> matchLabels) {
        // no-op
    }

    public List<NetworkPolicySpecEgressToPodSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NetworkPolicySpecEgressToPodSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof NetworkPolicySpecEgressToPodSelector)) {
            return false;
        }
        final NetworkPolicySpecEgressToPodSelector __otherCasted = (NetworkPolicySpecEgressToPodSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
