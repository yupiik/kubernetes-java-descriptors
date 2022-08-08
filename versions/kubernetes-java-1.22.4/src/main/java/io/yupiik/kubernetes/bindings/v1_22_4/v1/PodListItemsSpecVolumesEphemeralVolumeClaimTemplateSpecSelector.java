package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpecSelector {
    private List<PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpecSelector() {
        // no-op
    }

    public PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpecSelector(final List<PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions,
                                                                           final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpecSelector)) {
            return false;
        }
        final PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpecSelector __otherCasted = (PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
