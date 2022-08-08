package io.yupiik.kubernetes.bindings.v1_17_1.v1alpha1;

import java.util.Objects;

public class AuditSinkListItems {
    private String apiVersion;
    private String kind;
    private AuditSinkListItemsMetadata metadata;
    private AuditSinkListItemsSpec spec;

    public AuditSinkListItems() {
        // no-op
    }

    public AuditSinkListItems(final String apiVersion,
                              final String kind,
                              final AuditSinkListItemsMetadata metadata,
                              final AuditSinkListItemsSpec spec) {
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

    public AuditSinkListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final AuditSinkListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public AuditSinkListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final AuditSinkListItemsSpec spec) {
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
        if (!(__other instanceof AuditSinkListItems)) {
            return false;
        }
        final AuditSinkListItems __otherCasted = (AuditSinkListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
