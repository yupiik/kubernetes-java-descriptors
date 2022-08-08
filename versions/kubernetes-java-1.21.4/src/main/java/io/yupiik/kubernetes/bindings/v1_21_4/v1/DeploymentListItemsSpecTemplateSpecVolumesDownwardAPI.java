package io.yupiik.kubernetes.bindings.v1_21_4.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItems> items;

    public DeploymentListItemsSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                                 final List<DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesDownwardAPI __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
