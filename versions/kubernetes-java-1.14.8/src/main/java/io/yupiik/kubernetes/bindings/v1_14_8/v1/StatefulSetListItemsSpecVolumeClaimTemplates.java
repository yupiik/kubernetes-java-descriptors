package io.yupiik.kubernetes.bindings.v1_14_8.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecVolumeClaimTemplates {
    private String apiVersion;
    private String kind;
    private StatefulSetListItemsSpecVolumeClaimTemplatesMetadata metadata;
    private StatefulSetListItemsSpecVolumeClaimTemplatesSpec spec;
    private StatefulSetListItemsSpecVolumeClaimTemplatesStatus status;

    public StatefulSetListItemsSpecVolumeClaimTemplates() {
        // no-op
    }

    public StatefulSetListItemsSpecVolumeClaimTemplates(final String apiVersion,
                                                        final String kind,
                                                        final StatefulSetListItemsSpecVolumeClaimTemplatesMetadata metadata,
                                                        final StatefulSetListItemsSpecVolumeClaimTemplatesSpec spec,
                                                        final StatefulSetListItemsSpecVolumeClaimTemplatesStatus status) {
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

    public StatefulSetListItemsSpecVolumeClaimTemplatesMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StatefulSetListItemsSpecVolumeClaimTemplatesMetadata metadata) {
        this.metadata = metadata;
    }

    public StatefulSetListItemsSpecVolumeClaimTemplatesSpec getSpec() {
        return spec;
    }

    public void setSpec(final StatefulSetListItemsSpecVolumeClaimTemplatesSpec spec) {
        this.spec = spec;
    }

    public StatefulSetListItemsSpecVolumeClaimTemplatesStatus getStatus() {
        return status;
    }

    public void setStatus(final StatefulSetListItemsSpecVolumeClaimTemplatesStatus status) {
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
        if (!(__other instanceof StatefulSetListItemsSpecVolumeClaimTemplates)) {
            return false;
        }
        final StatefulSetListItemsSpecVolumeClaimTemplates __otherCasted = (StatefulSetListItemsSpecVolumeClaimTemplates) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
