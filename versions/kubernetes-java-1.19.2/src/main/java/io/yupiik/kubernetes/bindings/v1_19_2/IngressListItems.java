package io.yupiik.kubernetes.bindings.v1_19_2;

import java.util.Objects;

public class IngressListItems {
    private String apiVersion;
    private String kind;
    private IngressListItemsMetadata metadata;
    private IngressListItemsSpec spec;
    private IngressListItemsStatus status;

    public IngressListItems() {
        // no-op
    }

    public IngressListItems(final String apiVersion,
                            final String kind,
                            final IngressListItemsMetadata metadata,
                            final IngressListItemsSpec spec,
                            final IngressListItemsStatus status) {
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

    public IngressListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final IngressListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public IngressListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final IngressListItemsSpec spec) {
        this.spec = spec;
    }

    public IngressListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final IngressListItemsStatus status) {
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
        if (!(__other instanceof IngressListItems)) {
            return false;
        }
        final IngressListItems __otherCasted = (IngressListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
