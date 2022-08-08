package io.yupiik.kubernetes.bindings.v1_15_10.v1beta1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems {
    private DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems(final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef,
                                                                                      final Integer mode,
                                                                                      final String path,
                                                                                      final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(final Integer mode) {
        this.mode = mode;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fieldRef,
                mode,
                path,
                resourceFieldRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
