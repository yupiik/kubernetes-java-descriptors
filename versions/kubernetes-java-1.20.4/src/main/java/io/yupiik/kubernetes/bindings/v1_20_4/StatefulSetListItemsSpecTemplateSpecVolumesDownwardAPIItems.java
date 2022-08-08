package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItems {
    private StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItems(final StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                                       final Integer mode,
                                                                       final String path,
                                                                       final StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
