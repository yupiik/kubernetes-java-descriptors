package io.yupiik.kubernetes.bindings.v1_28_0.v1;

import io.yupiik.kubernetes.bindings.v1_28_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_0.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DaemonSet implements Validable<DaemonSet>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private DaemonSetSpec spec;
    private DaemonSetStatus status;

    public DaemonSet() {
        // no-op
    }

    public DaemonSet(final String apiVersion,
                     final String kind,
                     final ObjectMeta metadata,
                     final DaemonSetSpec spec,
                     final DaemonSetStatus status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
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

    public DaemonSetSpec getSpec() {
        return spec;
    }

    public void setSpec(final DaemonSetSpec spec) {
        this.spec = spec;
    }

    public DaemonSetStatus getStatus() {
        return status;
    }

    public void setStatus(final DaemonSetStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSet)) {
            return false;
        }
        final DaemonSet __otherCasted = (DaemonSet) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public DaemonSet apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public DaemonSet kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public DaemonSet metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public DaemonSet spec(final DaemonSetSpec spec) {
        this.spec = spec;
        return this;
    }

    public DaemonSet status(final DaemonSetStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public DaemonSet validate() {
        if (kind == null) {
            kind = "DaemonSet";
        }
        if (apiVersion == null) {
            apiVersion = "apps/v1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""),
                    (status != null ? "\"status\":" + status.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
