package io.yupiik.kubernetes.bindings.v1_20_0.v1;

import java.util.Objects;

public class CSIDriverListItems {
    private String apiVersion;
    private String kind;
    private CSIDriverListItemsMetadata metadata;
    private CSIDriverListItemsSpec spec;

    public CSIDriverListItems() {
        // no-op
    }

    public CSIDriverListItems(final String apiVersion,
                              final String kind,
                              final CSIDriverListItemsMetadata metadata,
                              final CSIDriverListItemsSpec spec) {
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

    public CSIDriverListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CSIDriverListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public CSIDriverListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final CSIDriverListItemsSpec spec) {
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
        if (!(__other instanceof CSIDriverListItems)) {
            return false;
        }
        final CSIDriverListItems __otherCasted = (CSIDriverListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
