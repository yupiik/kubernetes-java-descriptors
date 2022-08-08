package io.yupiik.kubernetes.bindings.v1_20_0.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<JobListItemsSpecTemplateSpecVolumesProjectedSources> sources;

    public JobListItemsSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                        final List<JobListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<JobListItemsSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<JobListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesProjected __otherCasted = (JobListItemsSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
