package io.yupiik.kubernetes.bindings.v1_18_5;

import java.util.Objects;

public class CustomResourceDefinitionListItems {
    private String apiVersion;
    private String kind;
    private CustomResourceDefinitionListItemsMetadata metadata;
    private CustomResourceDefinitionListItemsSpec spec;
    private CustomResourceDefinitionListItemsStatus status;

    public CustomResourceDefinitionListItems() {
        // no-op
    }

    public CustomResourceDefinitionListItems(final String apiVersion,
                                             final String kind,
                                             final CustomResourceDefinitionListItemsMetadata metadata,
                                             final CustomResourceDefinitionListItemsSpec spec,
                                             final CustomResourceDefinitionListItemsStatus status) {
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

    public CustomResourceDefinitionListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CustomResourceDefinitionListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public CustomResourceDefinitionListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final CustomResourceDefinitionListItemsSpec spec) {
        this.spec = spec;
    }

    public CustomResourceDefinitionListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final CustomResourceDefinitionListItemsStatus status) {
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
        if (!(__other instanceof CustomResourceDefinitionListItems)) {
            return false;
        }
        final CustomResourceDefinitionListItems __otherCasted = (CustomResourceDefinitionListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
