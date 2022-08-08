package io.yupiik.kubernetes.bindings.v1_15_12.v1beta1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesDownwardAPIItems {
    private DaemonSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private DaemonSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public DaemonSetSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesDownwardAPIItems(final DaemonSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                            final Integer mode,
                                                            final String path,
                                                            final DaemonSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DaemonSetSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public DaemonSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DaemonSetSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (DaemonSetSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
