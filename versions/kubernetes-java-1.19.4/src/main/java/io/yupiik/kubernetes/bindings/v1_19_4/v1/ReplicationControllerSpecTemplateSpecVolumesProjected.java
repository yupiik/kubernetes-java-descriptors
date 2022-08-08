package io.yupiik.kubernetes.bindings.v1_19_4.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<ReplicationControllerSpecTemplateSpecVolumesProjectedSources> sources;

    public ReplicationControllerSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                                 final List<ReplicationControllerSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<ReplicationControllerSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<ReplicationControllerSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesProjected __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
