package io.yupiik.kubernetes.bindings.v1_11_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_1.Validable;
import io.yupiik.kubernetes.bindings.v1_11_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaemonSet implements Validable<DaemonSet> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private DaemonSetSpec spec;
    private DaemonSetStatus status;

    public DaemonSet() {
        // no-op
    }

    public DaemonSet(final String apiVersion,
                     final String kind,
                     final ObjectMeta metadata,
                     final DaemonSetSpec spec,
                     final DaemonSetStatus status) {
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

    public DaemonSetSpec getSpec() {
        return spec;
    }

    public void setSpec(final DaemonSetSpec spec) {
        this.spec = spec;
    }

    public DaemonSetStatus getStatus() {
        return status;
    }

    public void setStatus(final DaemonSetStatus status) {
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
        if (!(__other instanceof DaemonSet)) {
            return false;
        }
        final DaemonSet __otherCasted = (DaemonSet) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public DaemonSet apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public DaemonSet kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public DaemonSet metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public DaemonSet spec(final DaemonSetSpec spec) {
        this.spec = spec;
        return this;
    }

    public DaemonSet status(final DaemonSetStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public DaemonSet validate() {
        return this;
    }
}
