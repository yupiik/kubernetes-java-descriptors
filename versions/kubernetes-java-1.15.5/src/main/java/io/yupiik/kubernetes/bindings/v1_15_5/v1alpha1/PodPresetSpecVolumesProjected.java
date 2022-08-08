package io.yupiik.kubernetes.bindings.v1_15_5.v1alpha1;

import java.util.List;
import java.util.Objects;

public class PodPresetSpecVolumesProjected {
    private Integer defaultMode;
    private List<PodPresetSpecVolumesProjectedSources> sources;

    public PodPresetSpecVolumesProjected() {
        // no-op
    }

    public PodPresetSpecVolumesProjected(final Integer defaultMode,
                                         final List<PodPresetSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodPresetSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<PodPresetSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof PodPresetSpecVolumesProjected)) {
            return false;
        }
        final PodPresetSpecVolumesProjected __otherCasted = (PodPresetSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
