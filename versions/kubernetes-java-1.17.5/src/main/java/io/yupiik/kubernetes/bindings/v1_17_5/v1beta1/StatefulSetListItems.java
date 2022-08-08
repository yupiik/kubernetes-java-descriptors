package io.yupiik.kubernetes.bindings.v1_17_5.v1beta1;

import java.util.Objects;

public class StatefulSetListItems {
    private String apiVersion;
    private String kind;
    private StatefulSetListItemsMetadata metadata;
    private StatefulSetListItemsSpec spec;
    private StatefulSetListItemsStatus status;

    public StatefulSetListItems() {
        // no-op
    }

    public StatefulSetListItems(final String apiVersion,
                                final String kind,
                                final StatefulSetListItemsMetadata metadata,
                                final StatefulSetListItemsSpec spec,
                                final StatefulSetListItemsStatus status) {
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

    public StatefulSetListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StatefulSetListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public StatefulSetListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final StatefulSetListItemsSpec spec) {
        this.spec = spec;
    }

    public StatefulSetListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final StatefulSetListItemsStatus status) {
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
        if (!(__other instanceof StatefulSetListItems)) {
            return false;
        }
        final StatefulSetListItems __otherCasted = (StatefulSetListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
