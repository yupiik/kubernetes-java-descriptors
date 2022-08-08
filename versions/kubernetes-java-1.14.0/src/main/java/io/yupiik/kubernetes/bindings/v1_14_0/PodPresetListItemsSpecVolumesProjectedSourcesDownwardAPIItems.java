package io.yupiik.kubernetes.bindings.v1_14_0;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItems {
    private PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItems() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItems(final PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef,
                                                                         final Integer mode,
                                                                         final String path,
                                                                         final PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef) {
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

    public PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItems)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItems __otherCasted = (PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
