package io.yupiik.kubernetes.bindings.v1_20_8;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DeploymentSpecTemplateSpecTopologySpreadConstraintsLabelSelector {
    private List<DeploymentSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public DeploymentSpecTemplateSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public DeploymentSpecTemplateSpecTopologySpreadConstraintsLabelSelector(final List<DeploymentSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                                            final Map<String, String> matchLabels) {
        // no-op
    }

    public List<DeploymentSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<DeploymentSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final DeploymentSpecTemplateSpecTopologySpreadConstraintsLabelSelector __otherCasted = (DeploymentSpecTemplateSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
