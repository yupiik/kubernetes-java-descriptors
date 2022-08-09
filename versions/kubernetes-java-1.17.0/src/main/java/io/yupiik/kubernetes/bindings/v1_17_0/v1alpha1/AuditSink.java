package io.yupiik.kubernetes.bindings.v1_17_0.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_17_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_0.Validable;
import io.yupiik.kubernetes.bindings.v1_17_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AuditSink implements Validable<AuditSink>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private AuditSinkSpec spec;

    public AuditSink() {
        // no-op
    }

    public AuditSink(final String apiVersion,
                     final String kind,
                     final ObjectMeta metadata,
                     final AuditSinkSpec spec) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public AuditSinkSpec getSpec() {
        return spec;
    }

    public void setSpec(final AuditSinkSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AuditSink)) {
            return false;
        }
        final AuditSink __otherCasted = (AuditSink) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public AuditSink apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public AuditSink kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public AuditSink metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public AuditSink spec(final AuditSinkSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public AuditSink validate() {
        if (kind == null) {
            kind = "AuditSink";
        }
        if (apiVersion == null) {
            apiVersion = "auditregistration.k8s.io/v1alpha1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
