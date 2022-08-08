package io.yupiik.kubernetes.bindings.v1_16_14;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSources> sources;

    public DaemonSetListItemsSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                              final List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesProjected __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
