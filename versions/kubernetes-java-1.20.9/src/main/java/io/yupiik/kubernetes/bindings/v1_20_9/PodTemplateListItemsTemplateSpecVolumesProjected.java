package io.yupiik.kubernetes.bindings.v1_20_9;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<PodTemplateListItemsTemplateSpecVolumesProjectedSources> sources;

    public PodTemplateListItemsTemplateSpecVolumesProjected() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesProjected(final Integer defaultMode,
                                                            final List<PodTemplateListItemsTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodTemplateListItemsTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<PodTemplateListItemsTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesProjected)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesProjected __otherCasted = (PodTemplateListItemsTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
