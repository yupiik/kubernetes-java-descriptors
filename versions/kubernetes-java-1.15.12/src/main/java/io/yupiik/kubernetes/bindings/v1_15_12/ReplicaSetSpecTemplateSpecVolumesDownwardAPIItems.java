package io.yupiik.kubernetes.bindings.v1_15_12;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesDownwardAPIItems {
    private ReplicaSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private ReplicaSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public ReplicaSetSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesDownwardAPIItems(final ReplicaSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                             final Integer mode,
                                                             final String path,
                                                             final ReplicaSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicaSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public ReplicaSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicaSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (ReplicaSetSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
