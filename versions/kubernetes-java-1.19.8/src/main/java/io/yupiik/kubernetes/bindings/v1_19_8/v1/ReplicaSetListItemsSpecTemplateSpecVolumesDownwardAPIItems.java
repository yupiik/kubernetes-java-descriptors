package io.yupiik.kubernetes.bindings.v1_19_8.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItems {
    private ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItems(final ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                                      final Integer mode,
                                                                      final String path,
                                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
