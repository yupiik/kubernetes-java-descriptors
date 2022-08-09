package io.yupiik.kubernetes.bindings.v1_18_13.v2beta2;

import io.yupiik.kubernetes.bindings.v1_18_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_13.Validable;
import io.yupiik.kubernetes.bindings.v1_18_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Preconditions implements Validable<Preconditions>, Exportable {
    private String resourceVersion;
    private String uid;

    public Preconditions() {
        // no-op
    }

    public Preconditions(final String resourceVersion,
                         final String uid) {
        // no-op
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resourceVersion,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Preconditions)) {
            return false;
        }
        final Preconditions __otherCasted = (Preconditions) __other;
        return Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public Preconditions resourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public Preconditions uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public Preconditions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (resourceVersion != null ? "\"resourceVersion\":\"" +  JsonStrings.escapeJson(resourceVersion) + "\"" : ""),
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
