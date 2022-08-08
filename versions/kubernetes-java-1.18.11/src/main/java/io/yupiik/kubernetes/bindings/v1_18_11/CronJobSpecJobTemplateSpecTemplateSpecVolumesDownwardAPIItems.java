package io.yupiik.kubernetes.bindings.v1_18_11;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems {
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems(final CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                                         final Integer mode,
                                                                         final String path,
                                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
