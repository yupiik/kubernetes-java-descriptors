package io.yupiik.kubernetes.bindings.v1_23_6;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems {
    private DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems(final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef,
                                                                                     final Integer mode,
                                                                                     final String path,
                                                                                     final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef) {
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

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
