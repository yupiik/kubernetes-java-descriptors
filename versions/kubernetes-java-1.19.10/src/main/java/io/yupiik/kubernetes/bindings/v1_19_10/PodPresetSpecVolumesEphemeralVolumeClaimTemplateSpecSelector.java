package io.yupiik.kubernetes.bindings.v1_19_10;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpecSelector {
    private List<PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpecSelector() {
        // no-op
    }

    public PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpecSelector(final List<PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions,
                                                                        final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpecSelector)) {
            return false;
        }
        final PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpecSelector __otherCasted = (PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
