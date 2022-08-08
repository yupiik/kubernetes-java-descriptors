package io.yupiik.kubernetes.bindings.v1_22_0;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesDownwardAPIItems {
    private PodTemplateTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private PodTemplateTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public PodTemplateTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesDownwardAPIItems(final PodTemplateTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                          final Integer mode,
                                                          final String path,
                                                          final PodTemplateTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodTemplateTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public PodTemplateTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodTemplateTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesDownwardAPIItems __otherCasted = (PodTemplateTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
