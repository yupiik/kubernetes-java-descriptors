package io.yupiik.kubernetes.bindings.v1_17_11.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<DeploymentSpecTemplateSpecVolumesDownwardAPIItems> items;

    public DeploymentSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                        final List<DeploymentSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<DeploymentSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<DeploymentSpecTemplateSpecVolumesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                defaultMode,
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesDownwardAPI __otherCasted = (DeploymentSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
