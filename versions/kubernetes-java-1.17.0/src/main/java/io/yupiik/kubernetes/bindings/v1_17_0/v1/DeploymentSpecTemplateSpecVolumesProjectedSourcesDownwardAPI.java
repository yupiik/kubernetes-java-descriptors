package io.yupiik.kubernetes.bindings.v1_17_0.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
