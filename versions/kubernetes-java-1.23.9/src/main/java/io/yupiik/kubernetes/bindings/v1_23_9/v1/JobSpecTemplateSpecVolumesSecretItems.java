package io.yupiik.kubernetes.bindings.v1_23_9.v1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesSecretItems {
    private String key;
    private Integer mode;
    private String path;

    public JobSpecTemplateSpecVolumesSecretItems() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesSecretItems(final String key,
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesSecretItems)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesSecretItems __otherCasted = (JobSpecTemplateSpecVolumesSecretItems) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path);
    }
}
