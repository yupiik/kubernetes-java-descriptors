package io.yupiik.kubernetes.bindings.v1_10_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_10_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_3.Validable;
import io.yupiik.kubernetes.bindings.v1_10_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AllowedHostPath implements Validable<AllowedHostPath>, Exportable {
    private String pathPrefix;

    public AllowedHostPath() {
        // no-op
    }

    public AllowedHostPath(final String pathPrefix) {
        // no-op
    }

    public String getPathPrefix() {
        return pathPrefix;
    }

    public void setPathPrefix(final String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pathPrefix);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AllowedHostPath)) {
            return false;
        }
        final AllowedHostPath __otherCasted = (AllowedHostPath) __other;
        return Objects.equals(pathPrefix, __otherCasted.pathPrefix);
    }

    public AllowedHostPath pathPrefix(final String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    @Override
    public AllowedHostPath validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (pathPrefix != null ? "\"pathPrefix\":\"" +  JsonStrings.escapeJson(pathPrefix) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
