package io.yupiik.kubernetes.bindings.v1_18_5;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItems {
    private DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItems(final DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                                     final Integer mode,
                                                                     final String path,
                                                                     final DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
