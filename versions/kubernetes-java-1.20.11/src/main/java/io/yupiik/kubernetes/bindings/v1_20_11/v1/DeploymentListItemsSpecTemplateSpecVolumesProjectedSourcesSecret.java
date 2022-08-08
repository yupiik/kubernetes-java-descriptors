package io.yupiik.kubernetes.bindings.v1_20_11.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecret {
    private List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecret(final List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items,
                                                                            final String name,
                                                                            final Boolean optional) {
        // no-op
    }

    public List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecret __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
