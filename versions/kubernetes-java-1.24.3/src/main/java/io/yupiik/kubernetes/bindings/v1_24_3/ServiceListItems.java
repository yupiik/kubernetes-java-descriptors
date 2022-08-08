package io.yupiik.kubernetes.bindings.v1_24_3;

import java.util.Objects;

public class ServiceListItems {
    private String apiVersion;
    private String kind;
    private ServiceListItemsMetadata metadata;
    private ServiceListItemsSpec spec;
    private ServiceListItemsStatus status;

    public ServiceListItems() {
        // no-op
    }

    public ServiceListItems(final String apiVersion,
                            final String kind,
                            final ServiceListItemsMetadata metadata,
                            final ServiceListItemsSpec spec,
                            final ServiceListItemsStatus status) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ServiceListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ServiceListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public ServiceListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final ServiceListItemsSpec spec) {
        this.spec = spec;
    }

    public ServiceListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final ServiceListItemsStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceListItems)) {
            return false;
        }
        final ServiceListItems __otherCasted = (ServiceListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
