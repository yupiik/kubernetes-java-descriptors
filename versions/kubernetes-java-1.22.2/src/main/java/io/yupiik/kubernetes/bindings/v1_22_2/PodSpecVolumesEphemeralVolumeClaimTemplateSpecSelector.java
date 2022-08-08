package io.yupiik.kubernetes.bindings.v1_22_2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelector {
    private List<PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelector() {
        // no-op
    }

    public PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelector(final List<PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions,
                                                                  final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelector)) {
            return false;
        }
        final PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelector __otherCasted = (PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
