package io.yupiik.kubernetes.bindings.v1_17_15.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetList {
    private String apiVersion;
    private List<DaemonSetListItems> items;
    private String kind;
    private DaemonSetListMetadata metadata;

    public DaemonSetList() {
        // no-op
    }

    public DaemonSetList(final String apiVersion,
                         final List<DaemonSetListItems> items,
                         final String kind,
                         final DaemonSetListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<DaemonSetListItems> getItems() {
        return items;
    }

    public void setItems(final List<DaemonSetListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public DaemonSetListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DaemonSetListMetadata metadata) {
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
        if (!(__other instanceof DaemonSetList)) {
            return false;
        }
        final DaemonSetList __otherCasted = (DaemonSetList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
