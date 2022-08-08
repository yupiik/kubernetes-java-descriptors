package io.yupiik.kubernetes.bindings.v1_7_10.v1;

import java.util.Objects;

public class PersistentVolumeClaim {
    private String apiVersion;
    private String kind;
    private PersistentVolumeClaimMetadata metadata;
    private PersistentVolumeClaimSpec spec;
    private PersistentVolumeClaimStatus status;

    public PersistentVolumeClaim() {
        // no-op
    }

    public PersistentVolumeClaim(final String apiVersion,
                                 final String kind,
                                 final PersistentVolumeClaimMetadata metadata,
                                 final PersistentVolumeClaimSpec spec,
                                 final PersistentVolumeClaimStatus status) {
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

    public PersistentVolumeClaimMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PersistentVolumeClaimMetadata metadata) {
        this.metadata = metadata;
    }

    public PersistentVolumeClaimSpec getSpec() {
        return spec;
    }

    public void setSpec(final PersistentVolumeClaimSpec spec) {
        this.spec = spec;
    }

    public PersistentVolumeClaimStatus getStatus() {
        return status;
    }

    public void setStatus(final PersistentVolumeClaimStatus status) {
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
        if (!(__other instanceof PersistentVolumeClaim)) {
            return false;
        }
        final PersistentVolumeClaim __otherCasted = (PersistentVolumeClaim) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
