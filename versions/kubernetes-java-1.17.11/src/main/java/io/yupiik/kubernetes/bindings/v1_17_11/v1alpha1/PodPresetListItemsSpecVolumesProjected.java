package io.yupiik.kubernetes.bindings.v1_17_11.v1alpha1;

import java.util.List;
import java.util.Objects;

public class PodPresetListItemsSpecVolumesProjected {
    private Integer defaultMode;
    private List<PodPresetListItemsSpecVolumesProjectedSources> sources;

    public PodPresetListItemsSpecVolumesProjected() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesProjected(final Integer defaultMode,
                                                  final List<PodPresetListItemsSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodPresetListItemsSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<PodPresetListItemsSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesProjected)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesProjected __otherCasted = (PodPresetListItemsSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
