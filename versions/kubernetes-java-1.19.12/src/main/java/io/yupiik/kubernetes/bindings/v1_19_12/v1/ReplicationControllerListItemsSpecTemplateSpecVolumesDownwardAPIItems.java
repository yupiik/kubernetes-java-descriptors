package io.yupiik.kubernetes.bindings.v1_19_12.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItems {
    private ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItems(final ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                                                 final Integer mode,
                                                                                 final String path,
                                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
