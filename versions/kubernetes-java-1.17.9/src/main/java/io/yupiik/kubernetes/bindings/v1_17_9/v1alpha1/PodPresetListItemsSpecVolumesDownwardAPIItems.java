package io.yupiik.kubernetes.bindings.v1_17_9.v1alpha1;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesDownwardAPIItems {
    private PodPresetListItemsSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private PodPresetListItemsSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public PodPresetListItemsSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesDownwardAPIItems(final PodPresetListItemsSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                         final Integer mode,
                                                         final String path,
                                                         final PodPresetListItemsSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public PodPresetListItemsSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodPresetListItemsSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public PodPresetListItemsSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodPresetListItemsSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesDownwardAPIItems __otherCasted = (PodPresetListItemsSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
