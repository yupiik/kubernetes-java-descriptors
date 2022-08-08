package io.yupiik.kubernetes.bindings.v1_19_3.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSources> sources;

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                               final List<ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesProjected __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
