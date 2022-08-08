package io.yupiik.kubernetes.bindings.v1_22_1.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_22_1.Validable;
import io.yupiik.kubernetes.bindings.v1_22_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StorageVersionList implements Validable<StorageVersionList> {
    private String apiVersion;
    private List<StorageVersion> items;
    private String kind;
    private ListMeta metadata;

    public StorageVersionList() {
        // no-op
    }

    public StorageVersionList(final String apiVersion,
                              final List<StorageVersion> items,
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

    public List<StorageVersion> getItems() {
        return items;
    }

    public void setItems(final List<StorageVersion> items) {
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
        if (!(__other instanceof StorageVersionList)) {
            return false;
        }
        final StorageVersionList __otherCasted = (StorageVersionList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public StorageVersionList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public StorageVersionList items(final List<StorageVersion> items) {
        this.items = items;
        return this;
    }

    public StorageVersionList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public StorageVersionList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public StorageVersionList validate() {
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
