package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ManifestReference implements Validable<ManifestReference>, Exportable {
    private String path;

    public ManifestReference() {
        // no-op
    }

    public ManifestReference(final String path) {
        this.path = path;
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
        if (!(__other instanceof ManifestReference)) {
            return false;
        }
        final ManifestReference __otherCasted = (ManifestReference) __other;
        return Objects.equals(path, __otherCasted.path);
    }

    public ManifestReference path(final String path) {
        this.path = path;
        return this;
    }

    @Override
    public ManifestReference validate() {
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
