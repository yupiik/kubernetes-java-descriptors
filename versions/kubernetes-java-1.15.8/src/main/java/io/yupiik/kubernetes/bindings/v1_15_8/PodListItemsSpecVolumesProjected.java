package io.yupiik.kubernetes.bindings.v1_15_8;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecVolumesProjected {
    private Integer defaultMode;
    private List<PodListItemsSpecVolumesProjectedSources> sources;

    public PodListItemsSpecVolumesProjected() {
        // no-op
    }

    public PodListItemsSpecVolumesProjected(final Integer defaultMode,
                                            final List<PodListItemsSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodListItemsSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<PodListItemsSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof PodListItemsSpecVolumesProjected)) {
            return false;
        }
        final PodListItemsSpecVolumesProjected __otherCasted = (PodListItemsSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
