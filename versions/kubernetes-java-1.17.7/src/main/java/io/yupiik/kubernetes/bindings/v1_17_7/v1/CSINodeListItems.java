package io.yupiik.kubernetes.bindings.v1_17_7.v1;

import java.util.Objects;

public class CSINodeListItems {
    private String apiVersion;
    private String kind;
    private CSINodeListItemsMetadata metadata;
    private CSINodeListItemsSpec spec;

    public CSINodeListItems() {
        // no-op
    }

    public CSINodeListItems(final String apiVersion,
                            final String kind,
                            final CSINodeListItemsMetadata metadata,
                            final CSINodeListItemsSpec spec) {
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

    public CSINodeListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CSINodeListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public CSINodeListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final CSINodeListItemsSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSINodeListItems)) {
            return false;
        }
        final CSINodeListItems __otherCasted = (CSINodeListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
