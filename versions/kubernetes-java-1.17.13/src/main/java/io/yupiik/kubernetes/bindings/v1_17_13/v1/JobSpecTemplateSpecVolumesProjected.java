package io.yupiik.kubernetes.bindings.v1_17_13.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<JobSpecTemplateSpecVolumesProjectedSources> sources;

    public JobSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                               final List<JobSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<JobSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<JobSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesProjected __otherCasted = (JobSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
