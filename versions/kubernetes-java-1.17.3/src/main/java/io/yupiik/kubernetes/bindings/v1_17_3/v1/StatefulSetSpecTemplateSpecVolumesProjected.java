package io.yupiik.kubernetes.bindings.v1_17_3.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<StatefulSetSpecTemplateSpecVolumesProjectedSources> sources;

    public StatefulSetSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                       final List<StatefulSetSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<StatefulSetSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<StatefulSetSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesProjected __otherCasted = (StatefulSetSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
