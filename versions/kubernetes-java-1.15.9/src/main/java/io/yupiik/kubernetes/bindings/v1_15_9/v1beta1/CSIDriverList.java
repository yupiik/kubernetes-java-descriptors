package io.yupiik.kubernetes.bindings.v1_15_9.v1beta1;

import java.util.List;
import java.util.Objects;

public class CSIDriverList {
    private String apiVersion;
    private List<CSIDriverListItems> items;
    private String kind;
    private CSIDriverListMetadata metadata;

    public CSIDriverList() {
        // no-op
    }

    public CSIDriverList(final String apiVersion,
                         final List<CSIDriverListItems> items,
                         final String kind,
                         final CSIDriverListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<CSIDriverListItems> getItems() {
        return items;
    }

    public void setItems(final List<CSIDriverListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public CSIDriverListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CSIDriverListMetadata metadata) {
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
        if (!(__other instanceof CSIDriverList)) {
            return false;
        }
        final CSIDriverList __otherCasted = (CSIDriverList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
