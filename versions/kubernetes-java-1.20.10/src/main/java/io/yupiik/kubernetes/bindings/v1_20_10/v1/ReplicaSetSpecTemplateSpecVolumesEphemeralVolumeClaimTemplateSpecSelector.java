package io.yupiik.kubernetes.bindings.v1_20_10.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector {
    private List<ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector(final List<ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions,
                                                                                     final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector __otherCasted = (ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
