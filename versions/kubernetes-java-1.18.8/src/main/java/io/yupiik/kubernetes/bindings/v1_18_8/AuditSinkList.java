package io.yupiik.kubernetes.bindings.v1_18_8;

import java.util.List;
import java.util.Objects;

public class AuditSinkList {
    private String apiVersion;
    private List<AuditSinkListItems> items;
    private String kind;
    private AuditSinkListMetadata metadata;

    public AuditSinkList() {
        // no-op
    }

    public AuditSinkList(final String apiVersion,
                         final List<AuditSinkListItems> items,
                         final String kind,
                         final AuditSinkListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<AuditSinkListItems> getItems() {
        return items;
    }

    public void setItems(final List<AuditSinkListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public AuditSinkListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final AuditSinkListMetadata metadata) {
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
        if (!(__other instanceof AuditSinkList)) {
            return false;
        }
        final AuditSinkList __otherCasted = (AuditSinkList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
