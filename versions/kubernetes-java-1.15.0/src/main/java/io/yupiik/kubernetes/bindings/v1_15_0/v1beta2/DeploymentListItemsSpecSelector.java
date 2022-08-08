package io.yupiik.kubernetes.bindings.v1_15_0.v1beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DeploymentListItemsSpecSelector {
    private List<DeploymentListItemsSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public DeploymentListItemsSpecSelector() {
        // no-op
    }

    public DeploymentListItemsSpecSelector(final List<DeploymentListItemsSpecSelectorMatchExpressions> matchExpressions,
                                           final Map<String, String> matchLabels) {
        // no-op
    }

    public List<DeploymentListItemsSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<DeploymentListItemsSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof DeploymentListItemsSpecSelector)) {
            return false;
        }
        final DeploymentListItemsSpecSelector __otherCasted = (DeploymentListItemsSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
