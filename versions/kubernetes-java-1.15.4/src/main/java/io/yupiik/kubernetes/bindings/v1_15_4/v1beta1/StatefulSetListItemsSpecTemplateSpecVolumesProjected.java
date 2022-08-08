package io.yupiik.kubernetes.bindings.v1_15_4.v1beta1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<StatefulSetListItemsSpecTemplateSpecVolumesProjectedSources> sources;

    public StatefulSetListItemsSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                                final List<StatefulSetListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<StatefulSetListItemsSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<StatefulSetListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesProjected __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
