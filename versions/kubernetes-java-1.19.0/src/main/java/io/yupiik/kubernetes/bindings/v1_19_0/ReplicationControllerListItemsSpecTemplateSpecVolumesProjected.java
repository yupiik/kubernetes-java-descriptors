package io.yupiik.kubernetes.bindings.v1_19_0;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSources> sources;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                                          final List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesProjected __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
