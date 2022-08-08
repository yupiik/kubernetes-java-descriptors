package io.yupiik.kubernetes.bindings.v1_14_10.v1alpha1;

import java.util.Objects;

public class RuntimeClassListItems {
    private String apiVersion;
    private String kind;
    private RuntimeClassListItemsMetadata metadata;
    private RuntimeClassListItemsSpec spec;

    public RuntimeClassListItems() {
        // no-op
    }

    public RuntimeClassListItems(final String apiVersion,
                                 final String kind,
                                 final RuntimeClassListItemsMetadata metadata,
                                 final RuntimeClassListItemsSpec spec) {
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

    public RuntimeClassListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final RuntimeClassListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public RuntimeClassListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final RuntimeClassListItemsSpec spec) {
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
        if (!(__other instanceof RuntimeClassListItems)) {
            return false;
        }
        final RuntimeClassListItems __otherCasted = (RuntimeClassListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
