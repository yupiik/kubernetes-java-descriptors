package io.yupiik.kubernetes.bindings.v1_18_11;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems {
    private ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef;
    private Integer mode;
    private String path;
    private ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef;

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems(final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef,
                                                                                        final Integer mode,
                                                                                        final String path,
                                                                                        final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsFieldRef fieldRef) {
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

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItemsResourceFieldRef resourceFieldRef) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }
}
