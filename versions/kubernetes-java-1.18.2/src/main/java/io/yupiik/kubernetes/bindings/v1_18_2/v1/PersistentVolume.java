package io.yupiik.kubernetes.bindings.v1_18_2.v1;

import io.yupiik.kubernetes.bindings.v1_18_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_2.Validable;
import io.yupiik.kubernetes.bindings.v1_18_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PersistentVolume implements Validable<PersistentVolume>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private PersistentVolumeSpec spec;
    private PersistentVolumeStatus status;

    public PersistentVolume() {
        // no-op
    }

    public PersistentVolume(final String apiVersion,
                            final String kind,
                            final ObjectMeta metadata,
                            final PersistentVolumeSpec spec,
                            final PersistentVolumeStatus status) {
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

    public PersistentVolumeSpec getSpec() {
        return spec;
    }

    public void setSpec(final PersistentVolumeSpec spec) {
        this.spec = spec;
    }

    public PersistentVolumeStatus getStatus() {
        return status;
    }

    public void setStatus(final PersistentVolumeStatus status) {
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
        if (!(__other instanceof PersistentVolume)) {
            return false;
        }
        final PersistentVolume __otherCasted = (PersistentVolume) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public PersistentVolume apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PersistentVolume kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PersistentVolume metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PersistentVolume spec(final PersistentVolumeSpec spec) {
        this.spec = spec;
        return this;
    }

    public PersistentVolume status(final PersistentVolumeStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public PersistentVolume validate() {
        if (kind == null) {
            kind = "PersistentVolume";
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
