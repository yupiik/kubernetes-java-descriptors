package io.yupiik.kubernetes.bindings.v1_19_1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
