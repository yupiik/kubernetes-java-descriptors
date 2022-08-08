package io.yupiik.kubernetes.bindings.v1_20_12;

import jakarta.json.JsonObject;
import java.util.Objects;

public class StorageVersion {
    private String apiVersion;
    private String kind;
    private StorageVersionMetadata metadata;
    private JsonObject spec;
    private StorageVersionStatus status;

    public StorageVersion() {
        // no-op
    }

    public StorageVersion(final String apiVersion,
                          final String kind,
                          final StorageVersionMetadata metadata,
                          final JsonObject spec,
                          final StorageVersionStatus status) {
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

    public StorageVersionMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StorageVersionMetadata metadata) {
        this.metadata = metadata;
    }

    public JsonObject getSpec() {
        return spec;
    }

    public void setSpec(final JsonObject spec) {
        this.spec = spec;
    }

    public StorageVersionStatus getStatus() {
        return status;
    }

    public void setStatus(final StorageVersionStatus status) {
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
        if (!(__other instanceof StorageVersion)) {
            return false;
        }
        final StorageVersion __otherCasted = (StorageVersion) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
