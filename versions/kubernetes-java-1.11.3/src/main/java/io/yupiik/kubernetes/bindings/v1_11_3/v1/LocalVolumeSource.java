package io.yupiik.kubernetes.bindings.v1_11_3.v1;

import io.yupiik.kubernetes.bindings.v1_11_3.Validable;
import io.yupiik.kubernetes.bindings.v1_11_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LocalVolumeSource implements Validable<LocalVolumeSource> {
    private String path;

    public LocalVolumeSource() {
        // no-op
    }

    public LocalVolumeSource(final String path) {
        // no-op
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
                path);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LocalVolumeSource)) {
            return false;
        }
        final LocalVolumeSource __otherCasted = (LocalVolumeSource) __other;
        return Objects.equals(path, __otherCasted.path);
    }

    public LocalVolumeSource path(final String path) {
        this.path = path;
        return this;
    }

    @Override
    public LocalVolumeSource validate() {
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
