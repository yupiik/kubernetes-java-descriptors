package io.yupiik.kubernetes.bindings.v1_8_6.v1;

import io.yupiik.kubernetes.bindings.v1_8_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_6.Validable;
import io.yupiik.kubernetes.bindings.v1_8_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NFSVolumeSource implements Validable<NFSVolumeSource>, Exportable {
    private String path;
    private Boolean readOnly;
    private String server;

    public NFSVolumeSource() {
        // no-op
    }

    public NFSVolumeSource(final String path,
                           final Boolean readOnly,
                           final String server) {
        // no-op
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getServer() {
        return server;
    }

    public void setServer(final String server) {
        this.server = server;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                path,
                readOnly,
                server);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NFSVolumeSource)) {
            return false;
        }
        final NFSVolumeSource __otherCasted = (NFSVolumeSource) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(server, __otherCasted.server);
    }

    public NFSVolumeSource path(final String path) {
        this.path = path;
        return this;
    }

    public NFSVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public NFSVolumeSource server(final String server) {
        this.server = server;
        return this;
    }

    @Override
    public NFSVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (path == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "path", "path",
                "Missing 'path' attribute.", true));
        }
        if (server == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "server", "server",
                "Missing 'server' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (server != null ? "\"server\":\"" +  JsonStrings.escapeJson(server) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
