package io.yupiik.kubernetes.bindings.v1_15_3.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMap {
    private List<DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMap(final List<DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items,
                                                                      final String name,
                                                                      final Boolean optional) {
        // no-op
    }

    public List<DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMap __otherCasted = (DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
