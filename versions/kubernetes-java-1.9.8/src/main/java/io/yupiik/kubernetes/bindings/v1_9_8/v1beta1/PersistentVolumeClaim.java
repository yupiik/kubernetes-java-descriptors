package io.yupiik.kubernetes.bindings.v1_9_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_9_8.Validable;
import io.yupiik.kubernetes.bindings.v1_9_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaim implements Validable<PersistentVolumeClaim> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private PersistentVolumeClaimSpec spec;
    private PersistentVolumeClaimStatus status;

    public PersistentVolumeClaim() {
        // no-op
    }

    public PersistentVolumeClaim(final String apiVersion,
                                 final String kind,
                                 final ObjectMeta metadata,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public PersistentVolumeClaim apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PersistentVolumeClaim kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PersistentVolumeClaim metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PersistentVolumeClaim spec(final PersistentVolumeClaimSpec spec) {
        this.spec = spec;
        return this;
    }

    public PersistentVolumeClaim status(final PersistentVolumeClaimStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public PersistentVolumeClaim validate() {
        return this;
    }
}
