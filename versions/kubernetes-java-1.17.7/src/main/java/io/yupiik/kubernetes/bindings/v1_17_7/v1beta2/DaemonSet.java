package io.yupiik.kubernetes.bindings.v1_17_7.v1beta2;

import java.util.Objects;

public class DaemonSet {
    private String apiVersion;
    private String kind;
    private DaemonSetMetadata metadata;
    private DaemonSetSpec spec;
    private DaemonSetStatus status;

    public DaemonSet() {
        // no-op
    }

    public DaemonSet(final String apiVersion,
                     final String kind,
                     final DaemonSetMetadata metadata,
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

    public DaemonSetMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DaemonSetMetadata metadata) {
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
}
