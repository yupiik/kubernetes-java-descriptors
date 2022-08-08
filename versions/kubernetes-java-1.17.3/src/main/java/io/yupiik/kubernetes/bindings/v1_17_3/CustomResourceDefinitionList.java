package io.yupiik.kubernetes.bindings.v1_17_3;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionList {
    private String apiVersion;
    private List<CustomResourceDefinitionListItems> items;
    private String kind;
    private CustomResourceDefinitionListMetadata metadata;

    public CustomResourceDefinitionList() {
        // no-op
    }

    public CustomResourceDefinitionList(final String apiVersion,
                                        final List<CustomResourceDefinitionListItems> items,
                                        final String kind,
                                        final CustomResourceDefinitionListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<CustomResourceDefinitionListItems> getItems() {
        return items;
    }

    public void setItems(final List<CustomResourceDefinitionListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public CustomResourceDefinitionListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CustomResourceDefinitionListMetadata metadata) {
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
        if (!(__other instanceof CustomResourceDefinitionList)) {
            return false;
        }
        final CustomResourceDefinitionList __otherCasted = (CustomResourceDefinitionList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
