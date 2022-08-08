package io.yupiik.kubernetes.bindings.v1_20_13.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecVolumesProjected {
    private Integer defaultMode;
    private List<PodSpecVolumesProjectedSources> sources;

    public PodSpecVolumesProjected() {
        // no-op
    }

    public PodSpecVolumesProjected(final Integer defaultMode,
                                   final List<PodSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<PodSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof PodSpecVolumesProjected)) {
            return false;
        }
        final PodSpecVolumesProjected __otherCasted = (PodSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
