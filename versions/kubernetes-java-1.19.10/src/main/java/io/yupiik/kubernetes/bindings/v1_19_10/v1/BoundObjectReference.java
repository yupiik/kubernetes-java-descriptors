package io.yupiik.kubernetes.bindings.v1_19_10.v1;

import io.yupiik.kubernetes.bindings.v1_19_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_10.Validable;
import io.yupiik.kubernetes.bindings.v1_19_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class BoundObjectReference implements Validable<BoundObjectReference>, Exportable {
    private String apiVersion;
    private String kind;
    private String name;
    private String uid;

    public BoundObjectReference() {
        // no-op
    }

    public BoundObjectReference(final String apiVersion,
                                final String kind,
                                final String name,
                                final String uid) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
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
                apiVersion,
                kind,
                name,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof BoundObjectReference)) {
            return false;
        }
        final BoundObjectReference __otherCasted = (BoundObjectReference) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public BoundObjectReference apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public BoundObjectReference kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public BoundObjectReference name(final String name) {
        this.name = name;
        return this;
    }

    public BoundObjectReference uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public BoundObjectReference validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}