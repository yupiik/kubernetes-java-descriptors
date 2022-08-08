package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector {
    private List<StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector(final List<StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions,
                                                                                      final Map<String, String> matchLabels) {
        // no-op
    }

    public List<StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector __otherCasted = (StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
