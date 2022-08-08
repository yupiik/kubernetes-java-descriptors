package io.yupiik.kubernetes.bindings.v1_21_8;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItems {
    private DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItems(final DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                                      final Integer mode,
                                                                      final String path,
                                                                      final DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
