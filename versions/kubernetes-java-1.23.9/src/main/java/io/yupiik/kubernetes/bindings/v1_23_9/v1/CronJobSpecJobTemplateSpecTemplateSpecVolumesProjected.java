package io.yupiik.kubernetes.bindings.v1_23_9.v1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSources> sources;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                                  final List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjected __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
