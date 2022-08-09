package io.yupiik.kubernetes.bindings.v1_9_4.v1;

import io.yupiik.kubernetes.bindings.v1_9_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_9_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_9_4.Validable;
import io.yupiik.kubernetes.bindings.v1_9_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LocalVolumeSource implements Validable<LocalVolumeSource>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
