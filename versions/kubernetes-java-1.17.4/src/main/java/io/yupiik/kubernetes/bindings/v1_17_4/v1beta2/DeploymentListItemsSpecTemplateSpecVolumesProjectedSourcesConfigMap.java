package io.yupiik.kubernetes.bindings.v1_17_4.v1beta2;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap {
    private List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap(final List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items,
                                                                               final String name,
                                                                               final Boolean optional) {
        // no-op
    }

    public List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items,
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
