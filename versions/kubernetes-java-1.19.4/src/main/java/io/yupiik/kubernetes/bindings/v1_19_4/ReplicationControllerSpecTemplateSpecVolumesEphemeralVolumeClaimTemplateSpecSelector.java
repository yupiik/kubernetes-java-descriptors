package io.yupiik.kubernetes.bindings.v1_19_4;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector {
    private List<ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector(final List<ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions,
                                                                                                final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
