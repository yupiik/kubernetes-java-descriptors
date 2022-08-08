package io.yupiik.kubernetes.bindings.v1_16_10;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef,
                                                                                                  final Integer mode,
                                                                                                  final String path,
                                                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef) {
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
