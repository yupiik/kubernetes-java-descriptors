package io.yupiik.kubernetes.bindings.v1_20_0.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItems {
    private ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItems() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItems(final ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef,
                                                                        final Integer mode,
                                                                        final String path,
                                                                        final ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItemsFieldRef fieldRef) {
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

    public ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItems)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItems __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
