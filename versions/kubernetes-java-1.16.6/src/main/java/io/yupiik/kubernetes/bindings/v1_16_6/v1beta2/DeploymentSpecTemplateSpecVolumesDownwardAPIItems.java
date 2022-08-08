package io.yupiik.kubernetes.bindings.v1_16_6.v1beta2;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesDownwardAPIItems {
    private DeploymentSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private DeploymentSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public DeploymentSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesDownwardAPIItems(final DeploymentSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                             final Integer mode,
                                                             final String path,
                                                             final DeploymentSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DeploymentSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public DeploymentSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DeploymentSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (DeploymentSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
