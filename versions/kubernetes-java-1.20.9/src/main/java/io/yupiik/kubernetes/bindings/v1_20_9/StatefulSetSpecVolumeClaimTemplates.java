package io.yupiik.kubernetes.bindings.v1_20_9;

import java.util.Objects;

public class StatefulSetSpecVolumeClaimTemplates {
    private String apiVersion;
    private String kind;
    private StatefulSetSpecVolumeClaimTemplatesMetadata metadata;
    private StatefulSetSpecVolumeClaimTemplatesSpec spec;
    private StatefulSetSpecVolumeClaimTemplatesStatus status;

    public StatefulSetSpecVolumeClaimTemplates() {
        // no-op
    }

    public StatefulSetSpecVolumeClaimTemplates(final String apiVersion,
                                               final String kind,
                                               final StatefulSetSpecVolumeClaimTemplatesMetadata metadata,
                                               final StatefulSetSpecVolumeClaimTemplatesSpec spec,
                                               final StatefulSetSpecVolumeClaimTemplatesStatus status) {
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

    public StatefulSetSpecVolumeClaimTemplatesMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StatefulSetSpecVolumeClaimTemplatesMetadata metadata) {
        this.metadata = metadata;
    }

    public StatefulSetSpecVolumeClaimTemplatesSpec getSpec() {
        return spec;
    }

    public void setSpec(final StatefulSetSpecVolumeClaimTemplatesSpec spec) {
        this.spec = spec;
    }

    public StatefulSetSpecVolumeClaimTemplatesStatus getStatus() {
        return status;
    }

    public void setStatus(final StatefulSetSpecVolumeClaimTemplatesStatus status) {
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
        if (!(__other instanceof StatefulSetSpecVolumeClaimTemplates)) {
            return false;
        }
        final StatefulSetSpecVolumeClaimTemplates __otherCasted = (StatefulSetSpecVolumeClaimTemplates) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
