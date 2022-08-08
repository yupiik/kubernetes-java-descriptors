package io.yupiik.kubernetes.bindings.v1_17_2;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesDownwardAPIItems {
    private StatefulSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private StatefulSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public StatefulSetSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesDownwardAPIItems(final StatefulSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                              final Integer mode,
                                                              final String path,
                                                              final StatefulSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final StatefulSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public StatefulSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final StatefulSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (StatefulSetSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
