package io.yupiik.kubernetes.bindings.v1_8_2.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_8_2.Validable;
import io.yupiik.kubernetes.bindings.v1_8_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HostPathVolumeSource implements Validable<HostPathVolumeSource> {
    private String path;
    private String type;

    public HostPathVolumeSource() {
        // no-op
    }

    public HostPathVolumeSource(final String path,
                                final String type) {
        // no-op
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                path,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HostPathVolumeSource)) {
            return false;
        }
        final HostPathVolumeSource __otherCasted = (HostPathVolumeSource) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(type, __otherCasted.type);
    }

    public HostPathVolumeSource path(final String path) {
        this.path = path;
        return this;
    }

    public HostPathVolumeSource type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public HostPathVolumeSource validate() {
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
