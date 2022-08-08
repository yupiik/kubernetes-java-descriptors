package io.yupiik.kubernetes.bindings.v1_18_16.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems {
    private ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems(final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef,
                                                                                      final Integer mode,
                                                                                      final String path,
                                                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef) {
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

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
