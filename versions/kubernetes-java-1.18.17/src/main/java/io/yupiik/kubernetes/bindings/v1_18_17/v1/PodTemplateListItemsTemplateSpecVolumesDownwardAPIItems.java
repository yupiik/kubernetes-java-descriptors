package io.yupiik.kubernetes.bindings.v1_18_17.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesDownwardAPIItems {
    private PodTemplateListItemsTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private PodTemplateListItemsTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public PodTemplateListItemsTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesDownwardAPIItems(final PodTemplateListItemsTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                                   final Integer mode,
                                                                   final String path,
                                                                   final PodTemplateListItemsTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodTemplateListItemsTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public PodTemplateListItemsTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodTemplateListItemsTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesDownwardAPIItems __otherCasted = (PodTemplateListItemsTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
