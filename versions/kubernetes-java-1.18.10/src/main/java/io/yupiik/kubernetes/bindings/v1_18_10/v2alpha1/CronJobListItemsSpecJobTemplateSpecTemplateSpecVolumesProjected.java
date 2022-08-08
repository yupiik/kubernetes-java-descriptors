package io.yupiik.kubernetes.bindings.v1_18_10.v2alpha1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSources> sources;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                                           final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjected __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
