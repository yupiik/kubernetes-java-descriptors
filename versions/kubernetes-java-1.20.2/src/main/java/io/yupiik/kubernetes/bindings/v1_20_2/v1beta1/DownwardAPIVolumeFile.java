package io.yupiik.kubernetes.bindings.v1_20_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_2.Validable;
import io.yupiik.kubernetes.bindings.v1_20_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DownwardAPIVolumeFile implements Validable<DownwardAPIVolumeFile> {
    private ObjectFieldSelector fieldRef;
    private Integer mode;
    private String path;
    private ResourceFieldSelector resourceFieldRef;

    public DownwardAPIVolumeFile() {
        // no-op
    }

    public DownwardAPIVolumeFile(final ObjectFieldSelector fieldRef,
                                 final Integer mode,
                                 final String path,
                                 final ResourceFieldSelector resourceFieldRef) {
        // no-op
    }

    public ObjectFieldSelector getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ObjectFieldSelector fieldRef) {
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

    public ResourceFieldSelector getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ResourceFieldSelector resourceFieldRef) {
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
        if (!(__other instanceof DownwardAPIVolumeFile)) {
            return false;
        }
        final DownwardAPIVolumeFile __otherCasted = (DownwardAPIVolumeFile) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(mode, __otherCasted.mode) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef);
    }

    public DownwardAPIVolumeFile fieldRef(final ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
        return this;
    }

    public DownwardAPIVolumeFile mode(final Integer mode) {
        this.mode = mode;
        return this;
    }

    public DownwardAPIVolumeFile path(final String path) {
        this.path = path;
        return this;
    }

    public DownwardAPIVolumeFile resourceFieldRef(final ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
        return this;
    }

    @Override
    public DownwardAPIVolumeFile validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (path == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "path", "path",
                "Missing 'path' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
