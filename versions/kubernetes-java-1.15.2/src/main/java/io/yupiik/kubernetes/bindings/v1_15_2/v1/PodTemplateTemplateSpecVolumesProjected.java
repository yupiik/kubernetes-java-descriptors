package io.yupiik.kubernetes.bindings.v1_15_2.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<PodTemplateTemplateSpecVolumesProjectedSources> sources;

    public PodTemplateTemplateSpecVolumesProjected() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesProjected(final Integer defaultMode,
                                                   final List<PodTemplateTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodTemplateTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<PodTemplateTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesProjected)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesProjected __otherCasted = (PodTemplateTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
