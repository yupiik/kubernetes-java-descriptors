package io.yupiik.kubernetes.bindings.v1_16_10;

import java.util.List;
import java.util.Objects;

public class CSINodeList {
    private String apiVersion;
    private List<CSINodeListItems> items;
    private String kind;
    private CSINodeListMetadata metadata;

    public CSINodeList() {
        // no-op
    }

    public CSINodeList(final String apiVersion,
                       final List<CSINodeListItems> items,
                       final String kind,
                       final CSINodeListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<CSINodeListItems> getItems() {
        return items;
    }

    public void setItems(final List<CSINodeListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public CSINodeListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CSINodeListMetadata metadata) {
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
        if (!(__other instanceof CSINodeList)) {
            return false;
        }
        final CSINodeList __otherCasted = (CSINodeList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
