package io.yupiik.kubernetes.bindings.v1_20_0;

import java.util.Objects;

public class PersistentVolume {
    private String apiVersion;
    private String kind;
    private PersistentVolumeMetadata metadata;
    private PersistentVolumeSpec spec;
    private PersistentVolumeStatus status;

    public PersistentVolume() {
        // no-op
    }

    public PersistentVolume(final String apiVersion,
                            final String kind,
                            final PersistentVolumeMetadata metadata,
                            final PersistentVolumeSpec spec,
                            final PersistentVolumeStatus status) {
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

    public PersistentVolumeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PersistentVolumeMetadata metadata) {
        this.metadata = metadata;
    }

    public PersistentVolumeSpec getSpec() {
        return spec;
    }

    public void setSpec(final PersistentVolumeSpec spec) {
        this.spec = spec;
    }

    public PersistentVolumeStatus getStatus() {
        return status;
    }

    public void setStatus(final PersistentVolumeStatus status) {
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
        if (!(__other instanceof PersistentVolume)) {
            return false;
        }
        final PersistentVolume __otherCasted = (PersistentVolume) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
