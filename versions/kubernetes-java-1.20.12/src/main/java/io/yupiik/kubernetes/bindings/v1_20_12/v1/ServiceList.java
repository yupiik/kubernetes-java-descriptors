package io.yupiik.kubernetes.bindings.v1_20_12.v1;

import java.util.List;
import java.util.Objects;

public class ServiceList {
    private String apiVersion;
    private List<ServiceListItems> items;
    private String kind;
    private ServiceListMetadata metadata;

    public ServiceList() {
        // no-op
    }

    public ServiceList(final String apiVersion,
                       final List<ServiceListItems> items,
                       final String kind,
                       final ServiceListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ServiceListItems> getItems() {
        return items;
    }

    public void setItems(final List<ServiceListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ServiceListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ServiceListMetadata metadata) {
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
        if (!(__other instanceof ServiceList)) {
            return false;
        }
        final ServiceList __otherCasted = (ServiceList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
