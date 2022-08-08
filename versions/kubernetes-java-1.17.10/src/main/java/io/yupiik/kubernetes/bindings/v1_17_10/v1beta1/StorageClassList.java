package io.yupiik.kubernetes.bindings.v1_17_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_10.Validable;
import io.yupiik.kubernetes.bindings.v1_17_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StorageClassList implements Validable<StorageClassList> {
    private String apiVersion;
    private List<StorageClass> items;
    private String kind;
    private ListMeta metadata;

    public StorageClassList() {
        // no-op
    }

    public StorageClassList(final String apiVersion,
                            final List<StorageClass> items,
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

    public List<StorageClass> getItems() {
        return items;
    }

    public void setItems(final List<StorageClass> items) {
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
        if (!(__other instanceof StorageClassList)) {
            return false;
        }
        final StorageClassList __otherCasted = (StorageClassList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public StorageClassList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public StorageClassList items(final List<StorageClass> items) {
        this.items = items;
        return this;
    }

    public StorageClassList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public StorageClassList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public StorageClassList validate() {
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
