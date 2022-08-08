package io.yupiik.kubernetes.bindings.v1_19_2.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector {
    private List<DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector(final List<DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions,
                                                                                             final Map<String, String> matchLabels) {
        // no-op
    }

    public List<DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
