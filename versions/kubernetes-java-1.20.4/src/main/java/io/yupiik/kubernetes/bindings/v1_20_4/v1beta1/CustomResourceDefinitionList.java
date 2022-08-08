package io.yupiik.kubernetes.bindings.v1_20_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_4.Validable;
import io.yupiik.kubernetes.bindings.v1_20_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionList implements Validable<CustomResourceDefinitionList> {
    private String apiVersion;
    private List<CustomResourceDefinition> items;
    private String kind;
    private ListMeta metadata;

    public CustomResourceDefinitionList() {
        // no-op
    }

    public CustomResourceDefinitionList(final String apiVersion,
                                        final List<CustomResourceDefinition> items,
                                        final String kind,
                                        final ListMeta metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<CustomResourceDefinition> getItems() {
        return items;
    }

    public void setItems(final List<CustomResourceDefinition> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ListMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ListMeta metadata) {
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

    public CustomResourceDefinitionList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CustomResourceDefinitionList items(final List<CustomResourceDefinition> items) {
        this.items = items;
        return this;
    }

    public CustomResourceDefinitionList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public CustomResourceDefinitionList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public CustomResourceDefinitionList validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (items == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "items", "items",
                "Missing 'items' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
