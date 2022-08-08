package io.yupiik.kubernetes.bindings.v1_16_6;

import java.util.Objects;

public class NamespaceListItems {
    private String apiVersion;
    private String kind;
    private NamespaceListItemsMetadata metadata;
    private NamespaceListItemsSpec spec;
    private NamespaceListItemsStatus status;

    public NamespaceListItems() {
        // no-op
    }

    public NamespaceListItems(final String apiVersion,
                              final String kind,
                              final NamespaceListItemsMetadata metadata,
                              final NamespaceListItemsSpec spec,
                              final NamespaceListItemsStatus status) {
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

    public NamespaceListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final NamespaceListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public NamespaceListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final NamespaceListItemsSpec spec) {
        this.spec = spec;
    }

    public NamespaceListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final NamespaceListItemsStatus status) {
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
        if (!(__other instanceof NamespaceListItems)) {
            return false;
        }
        final NamespaceListItems __otherCasted = (NamespaceListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
