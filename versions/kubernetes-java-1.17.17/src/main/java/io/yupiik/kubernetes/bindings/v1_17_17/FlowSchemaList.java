package io.yupiik.kubernetes.bindings.v1_17_17;

import java.util.List;
import java.util.Objects;

public class FlowSchemaList {
    private String apiVersion;
    private List<FlowSchemaListItems> items;
    private String kind;
    private FlowSchemaListMetadata metadata;

    public FlowSchemaList() {
        // no-op
    }

    public FlowSchemaList(final String apiVersion,
                          final List<FlowSchemaListItems> items,
                          final String kind,
                          final FlowSchemaListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<FlowSchemaListItems> getItems() {
        return items;
    }

    public void setItems(final List<FlowSchemaListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public FlowSchemaListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final FlowSchemaListMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlowSchemaList)) {
            return false;
        }
        final FlowSchemaList __otherCasted = (FlowSchemaList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
