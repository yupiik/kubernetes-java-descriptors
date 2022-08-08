package io.yupiik.kubernetes.bindings.v1_18_9.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumesProjectedSourcesDownwardAPIItems {
    private PodPresetSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private PodPresetSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public PodPresetSpecVolumesProjectedSourcesDownwardAPIItems() {
        // no-op
    }

    public PodPresetSpecVolumesProjectedSourcesDownwardAPIItems(final PodPresetSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef,
                                                                final Integer mode,
                                                                final String path,
                                                                final PodPresetSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public PodPresetSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodPresetSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef) {
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

    public PodPresetSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodPresetSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof PodPresetSpecVolumesProjectedSourcesDownwardAPIItems)) {
            return false;
        }
        final PodPresetSpecVolumesProjectedSourcesDownwardAPIItems __otherCasted = (PodPresetSpecVolumesProjectedSourcesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
