package io.yupiik.kubernetes.bindings.v1_16_3.v1beta2;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<DeploymentSpecTemplateSpecVolumesProjectedSources> sources;

    public DeploymentSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                      final List<DeploymentSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<DeploymentSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<DeploymentSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesProjected __otherCasted = (DeploymentSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
