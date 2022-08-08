package io.yupiik.kubernetes.bindings.v1_20_14.v1beta1;

import java.util.Objects;

public class IngressClassListItems {
    private String apiVersion;
    private String kind;
    private IngressClassListItemsMetadata metadata;
    private IngressClassListItemsSpec spec;

    public IngressClassListItems() {
        // no-op
    }

    public IngressClassListItems(final String apiVersion,
                                 final String kind,
                                 final IngressClassListItemsMetadata metadata,
                                 final IngressClassListItemsSpec spec) {
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

    public IngressClassListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final IngressClassListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public IngressClassListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final IngressClassListItemsSpec spec) {
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
        if (!(__other instanceof IngressClassListItems)) {
            return false;
        }
        final IngressClassListItems __otherCasted = (IngressClassListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
