package io.yupiik.kubernetes.bindings.v1_23_4.v1alpha1;

import jakarta.json.JsonObject;
import java.util.Objects;

public class StorageVersionListItems {
    private String apiVersion;
    private String kind;
    private StorageVersionListItemsMetadata metadata;
    private JsonObject spec;
    private StorageVersionListItemsStatus status;

    public StorageVersionListItems() {
        // no-op
    }

    public StorageVersionListItems(final String apiVersion,
                                   final String kind,
                                   final StorageVersionListItemsMetadata metadata,
                                   final JsonObject spec,
                                   final StorageVersionListItemsStatus status) {
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

    public StorageVersionListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StorageVersionListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public JsonObject getSpec() {
        return spec;
    }

    public void setSpec(final JsonObject spec) {
        this.spec = spec;
    }

    public StorageVersionListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final StorageVersionListItemsStatus status) {
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
        if (!(__other instanceof StorageVersionListItems)) {
            return false;
        }
        final StorageVersionListItems __otherCasted = (StorageVersionListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
