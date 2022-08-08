package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector {
    private List<StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector(final List<StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions,
                                                                                               final Map<String, String> matchLabels) {
        // no-op
    }

    public List<StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
