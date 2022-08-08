package io.yupiik.kubernetes.bindings.v1_17_11.v1beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector {
    private List<DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector(final List<DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                                                     final Map<String, String> matchLabels) {
        // no-op
    }

    public List<DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector __otherCasted = (DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
