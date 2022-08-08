package io.yupiik.kubernetes.bindings.v1_21_8.v1beta1;

import java.util.Objects;

public class FlowSchemaListItems {
    private String apiVersion;
    private String kind;
    private FlowSchemaListItemsMetadata metadata;
    private FlowSchemaListItemsSpec spec;
    private FlowSchemaListItemsStatus status;

    public FlowSchemaListItems() {
        // no-op
    }

    public FlowSchemaListItems(final String apiVersion,
                               final String kind,
                               final FlowSchemaListItemsMetadata metadata,
                               final FlowSchemaListItemsSpec spec,
                               final FlowSchemaListItemsStatus status) {
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

    public FlowSchemaListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final FlowSchemaListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public FlowSchemaListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final FlowSchemaListItemsSpec spec) {
        this.spec = spec;
    }

    public FlowSchemaListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final FlowSchemaListItemsStatus status) {
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
        if (!(__other instanceof FlowSchemaListItems)) {
            return false;
        }
        final FlowSchemaListItems __otherCasted = (FlowSchemaListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
