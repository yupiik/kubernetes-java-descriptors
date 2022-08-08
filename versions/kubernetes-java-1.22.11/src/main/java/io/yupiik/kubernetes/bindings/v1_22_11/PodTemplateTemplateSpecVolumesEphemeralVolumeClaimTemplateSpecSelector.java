package io.yupiik.kubernetes.bindings.v1_22_11;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector {
    private List<PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector(final List<PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions,
                                                                                  final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector __otherCasted = (PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
