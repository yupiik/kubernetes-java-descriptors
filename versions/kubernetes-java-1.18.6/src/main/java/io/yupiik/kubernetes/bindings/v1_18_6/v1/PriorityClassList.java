package io.yupiik.kubernetes.bindings.v1_18_6.v1;

import io.yupiik.kubernetes.bindings.v1_18_6.Validable;
import io.yupiik.kubernetes.bindings.v1_18_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PriorityClassList implements Validable<PriorityClassList> {
    private String apiVersion;
    private List<PriorityClass> items;
    private String kind;
    private ListMeta metadata;

    public PriorityClassList() {
        // no-op
    }

    public PriorityClassList(final String apiVersion,
                             final List<PriorityClass> items,
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

    public List<PriorityClass> getItems() {
        return items;
    }

    public void setItems(final List<PriorityClass> items) {
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
        if (!(__other instanceof PriorityClassList)) {
            return false;
        }
        final PriorityClassList __otherCasted = (PriorityClassList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public PriorityClassList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PriorityClassList items(final List<PriorityClass> items) {
        this.items = items;
        return this;
    }

    public PriorityClassList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PriorityClassList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public PriorityClassList validate() {
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
