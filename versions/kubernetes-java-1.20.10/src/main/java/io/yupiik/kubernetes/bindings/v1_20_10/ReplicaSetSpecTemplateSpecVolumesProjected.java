package io.yupiik.kubernetes.bindings.v1_20_10;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<ReplicaSetSpecTemplateSpecVolumesProjectedSources> sources;

    public ReplicaSetSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                      final List<ReplicaSetSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<ReplicaSetSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<ReplicaSetSpecTemplateSpecVolumesProjectedSources> sources) {
        this.sources = sources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                defaultMode,
                sources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesProjected __otherCasted = (ReplicaSetSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
