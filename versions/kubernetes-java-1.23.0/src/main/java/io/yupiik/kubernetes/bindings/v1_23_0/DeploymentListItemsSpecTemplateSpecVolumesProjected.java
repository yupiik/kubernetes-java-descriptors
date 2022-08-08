package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesProjected {
    private Integer defaultMode;
    private List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSources> sources;

    public DeploymentListItemsSpecTemplateSpecVolumesProjected() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjected(final Integer defaultMode,
                                                               final List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSources> getSources() {
        return sources;
    }

    public void setSources(final List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSources> sources) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesProjected)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesProjected __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesProjected) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }
}
