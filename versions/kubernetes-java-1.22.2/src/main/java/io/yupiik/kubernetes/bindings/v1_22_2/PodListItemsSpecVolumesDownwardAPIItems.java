package io.yupiik.kubernetes.bindings.v1_22_2;

import java.util.Objects;

public class PodListItemsSpecVolumesDownwardAPIItems {
    private PodListItemsSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private PodListItemsSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public PodListItemsSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public PodListItemsSpecVolumesDownwardAPIItems(final PodListItemsSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                   final Integer mode,
                                                   final String path,
                                                   final PodListItemsSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public PodListItemsSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodListItemsSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public PodListItemsSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodListItemsSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof PodListItemsSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final PodListItemsSpecVolumesDownwardAPIItems __otherCasted = (PodListItemsSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
