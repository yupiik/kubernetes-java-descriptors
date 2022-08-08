package io.yupiik.kubernetes.bindings.v1_14_8.v1beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DeploymentSpecSelector {
    private List<DeploymentSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public DeploymentSpecSelector() {
        // no-op
    }

    public DeploymentSpecSelector(final List<DeploymentSpecSelectorMatchExpressions> matchExpressions,
                                  final Map<String, String> matchLabels) {
        // no-op
    }

    public List<DeploymentSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<DeploymentSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof DeploymentSpecSelector)) {
            return false;
        }
        final DeploymentSpecSelector __otherCasted = (DeploymentSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
