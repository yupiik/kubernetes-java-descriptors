package io.yupiik.kubernetes.bindings.v1_20_12.v1;

import io.yupiik.kubernetes.bindings.v1_20_12.Validable;
import io.yupiik.kubernetes.bindings.v1_20_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReplicaSet implements Validable<ReplicaSet> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ReplicaSetSpec spec;
    private ReplicaSetStatus status;

    public ReplicaSet() {
        // no-op
    }

    public ReplicaSet(final String apiVersion,
                      final String kind,
                      final ObjectMeta metadata,
                      final ReplicaSetSpec spec,
                      final ReplicaSetStatus status) {
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

    public ReplicaSetSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicaSetSpec spec) {
        this.spec = spec;
    }

    public ReplicaSetStatus getStatus() {
        return status;
    }

    public void setStatus(final ReplicaSetStatus status) {
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
        if (!(__other instanceof ReplicaSet)) {
            return false;
        }
        final ReplicaSet __otherCasted = (ReplicaSet) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public ReplicaSet apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ReplicaSet kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ReplicaSet metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ReplicaSet spec(final ReplicaSetSpec spec) {
        this.spec = spec;
        return this;
    }

    public ReplicaSet status(final ReplicaSetStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public ReplicaSet validate() {
        return this;
    }
}
