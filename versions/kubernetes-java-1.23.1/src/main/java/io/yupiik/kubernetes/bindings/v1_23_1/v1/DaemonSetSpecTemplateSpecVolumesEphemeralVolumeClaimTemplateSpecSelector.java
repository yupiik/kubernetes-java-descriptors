package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector {
    private List<DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector(final List<DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions,
                                                                                    final Map<String, String> matchLabels) {
        // no-op
    }

    public List<DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector __otherCasted = (DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
