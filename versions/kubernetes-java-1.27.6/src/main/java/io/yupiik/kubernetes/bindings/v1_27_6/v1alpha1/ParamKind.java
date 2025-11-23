package io.yupiik.kubernetes.bindings.v1_27_6.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_27_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_6.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ParamKind implements Validable<ParamKind>, Exportable {
    private String apiVersion;
    private String kind;

    public ParamKind() {
        // no-op
    }

    public ParamKind(final String apiVersion,
                     final String kind) {
        this.apiVersion = apiVersion;
        this.kind = kind;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ParamKind)) {
            return false;
        }
        final ParamKind __otherCasted = (ParamKind) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind);
    }

    public ParamKind apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ParamKind kind(final String kind) {
        this.kind = kind;
        return this;
    }

    @Override
    public ParamKind validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
