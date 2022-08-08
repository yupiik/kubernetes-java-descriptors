package io.yupiik.kubernetes.bindings.v1_20_7.v1;

import java.util.List;
import java.util.Objects;

public class ServiceAccountList {
    private String apiVersion;
    private List<ServiceAccountListItems> items;
    private String kind;
    private ServiceAccountListMetadata metadata;

    public ServiceAccountList() {
        // no-op
    }

    public ServiceAccountList(final String apiVersion,
                              final List<ServiceAccountListItems> items,
                              final String kind,
                              final ServiceAccountListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ServiceAccountListItems> getItems() {
        return items;
    }

    public void setItems(final List<ServiceAccountListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ServiceAccountListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ServiceAccountListMetadata metadata) {
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
        if (!(__other instanceof ServiceAccountList)) {
            return false;
        }
        final ServiceAccountList __otherCasted = (ServiceAccountList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
