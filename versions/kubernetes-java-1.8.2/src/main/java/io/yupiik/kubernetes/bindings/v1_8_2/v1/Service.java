package io.yupiik.kubernetes.bindings.v1_8_2.v1;

import io.yupiik.kubernetes.bindings.v1_8_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_2.Validable;
import io.yupiik.kubernetes.bindings.v1_8_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Service implements Validable<Service>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ServiceSpec spec;
    private ServiceStatus status;

    public Service() {
        // no-op
    }

    public Service(final String apiVersion,
                   final String kind,
                   final ObjectMeta metadata,
                   final ServiceSpec spec,
                   final ServiceStatus status) {
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

    public ServiceSpec getSpec() {
        return spec;
    }

    public void setSpec(final ServiceSpec spec) {
        this.spec = spec;
    }

    public ServiceStatus getStatus() {
        return status;
    }

    public void setStatus(final ServiceStatus status) {
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
        if (!(__other instanceof Service)) {
            return false;
        }
        final Service __otherCasted = (Service) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public Service apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Service kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Service metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Service spec(final ServiceSpec spec) {
        this.spec = spec;
        return this;
    }

    public Service status(final ServiceStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public Service validate() {
        if (kind == null) {
            kind = "Service";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
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
