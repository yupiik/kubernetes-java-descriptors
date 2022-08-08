package io.yupiik.kubernetes.bindings.v1_14_0.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<DaemonSetSpecTemplateSpecVolumesProjectedSources> sources;

    public DaemonSetSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                     final List<DaemonSetSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<DaemonSetSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<DaemonSetSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesProjected __otherCasted = (DaemonSetSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
