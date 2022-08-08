package io.yupiik.kubernetes.bindings.v1_14_6.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumesDownwardAPIItems {
    private PodPresetSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private PodPresetSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public PodPresetSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public PodPresetSpecVolumesDownwardAPIItems(final PodPresetSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                final Integer mode,
                                                final String path,
                                                final PodPresetSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public PodPresetSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodPresetSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public PodPresetSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodPresetSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof PodPresetSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final PodPresetSpecVolumesDownwardAPIItems __otherCasted = (PodPresetSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
