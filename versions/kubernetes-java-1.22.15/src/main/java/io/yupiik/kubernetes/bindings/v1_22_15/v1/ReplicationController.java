package io.yupiik.kubernetes.bindings.v1_22_15.v1;

import io.yupiik.kubernetes.bindings.v1_22_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_15.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ReplicationController implements Validable<ReplicationController>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ReplicationControllerSpec spec;
    private ReplicationControllerStatus status;

    public ReplicationController() {
        // no-op
    }

    public ReplicationController(final String apiVersion,
                                 final String kind,
                                 final ObjectMeta metadata,
                                 final ReplicationControllerSpec spec,
                                 final ReplicationControllerStatus status) {
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

    public ReplicationControllerSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicationControllerSpec spec) {
        this.spec = spec;
    }

    public ReplicationControllerStatus getStatus() {
        return status;
    }

    public void setStatus(final ReplicationControllerStatus status) {
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
        if (!(__other instanceof ReplicationController)) {
            return false;
        }
        final ReplicationController __otherCasted = (ReplicationController) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public ReplicationController apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ReplicationController kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ReplicationController metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ReplicationController spec(final ReplicationControllerSpec spec) {
        this.spec = spec;
        return this;
    }

    public ReplicationController status(final ReplicationControllerStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public ReplicationController validate() {
        if (kind == null) {
            kind = "ReplicationController";
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
