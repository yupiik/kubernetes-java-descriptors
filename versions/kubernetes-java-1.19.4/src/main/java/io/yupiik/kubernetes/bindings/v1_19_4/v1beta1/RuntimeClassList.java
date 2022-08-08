package io.yupiik.kubernetes.bindings.v1_19_4.v1beta1;

import java.util.List;
import java.util.Objects;

public class RuntimeClassList {
    private String apiVersion;
    private List<RuntimeClassListItems> items;
    private String kind;
    private RuntimeClassListMetadata metadata;

    public RuntimeClassList() {
        // no-op
    }

    public RuntimeClassList(final String apiVersion,
                            final List<RuntimeClassListItems> items,
                            final String kind,
                            final RuntimeClassListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<RuntimeClassListItems> getItems() {
        return items;
    }

    public void setItems(final List<RuntimeClassListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public RuntimeClassListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final RuntimeClassListMetadata metadata) {
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
        if (!(__other instanceof RuntimeClassList)) {
            return false;
        }
        final RuntimeClassList __otherCasted = (RuntimeClassList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
