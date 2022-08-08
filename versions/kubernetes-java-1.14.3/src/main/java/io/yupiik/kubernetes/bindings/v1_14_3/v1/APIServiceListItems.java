package io.yupiik.kubernetes.bindings.v1_14_3.v1;

import java.util.Objects;

public class APIServiceListItems {
    private String apiVersion;
    private String kind;
    private APIServiceListItemsMetadata metadata;
    private APIServiceListItemsSpec spec;
    private APIServiceListItemsStatus status;

    public APIServiceListItems() {
        // no-op
    }

    public APIServiceListItems(final String apiVersion,
                               final String kind,
                               final APIServiceListItemsMetadata metadata,
                               final APIServiceListItemsSpec spec,
                               final APIServiceListItemsStatus status) {
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

    public APIServiceListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final APIServiceListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public APIServiceListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final APIServiceListItemsSpec spec) {
        this.spec = spec;
    }

    public APIServiceListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final APIServiceListItemsStatus status) {
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
        if (!(__other instanceof APIServiceListItems)) {
            return false;
        }
        final APIServiceListItems __otherCasted = (APIServiceListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
