package io.yupiik.kubernetes.bindings.v1_21_11.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMapItems {
    private String key;
    private Integer mode;
    private String path;

    public DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMapItems() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMapItems(final String key,
                                                                           final Integer mode,
                                                                           final String path) {
        // no-op
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                mode,
                path);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMapItems)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMapItems __otherCasted = (DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMapItems) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path);
    }
}
