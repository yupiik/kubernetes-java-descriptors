package io.yupiik.kubernetes.bindings.v1_18_8.v1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesDownwardAPIItems {
    private JobSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private JobSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public JobSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesDownwardAPIItems(final JobSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                      final Integer mode,
                                                      final String path,
                                                      final JobSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public JobSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final JobSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public JobSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final JobSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (JobSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
