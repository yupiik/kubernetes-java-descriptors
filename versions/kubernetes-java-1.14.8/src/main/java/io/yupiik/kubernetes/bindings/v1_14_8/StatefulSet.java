package io.yupiik.kubernetes.bindings.v1_14_8;

import java.util.Objects;

public class StatefulSet {
    private String apiVersion;
    private String kind;
    private StatefulSetMetadata metadata;
    private StatefulSetSpec spec;
    private StatefulSetStatus status;

    public StatefulSet() {
        // no-op
    }

    public StatefulSet(final String apiVersion,
                       final String kind,
                       final StatefulSetMetadata metadata,
                       final StatefulSetSpec spec,
                       final StatefulSetStatus status) {
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

    public StatefulSetMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StatefulSetMetadata metadata) {
        this.metadata = metadata;
    }

    public StatefulSetSpec getSpec() {
        return spec;
    }

    public void setSpec(final StatefulSetSpec spec) {
        this.spec = spec;
    }

    public StatefulSetStatus getStatus() {
        return status;
    }

    public void setStatus(final StatefulSetStatus status) {
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
        if (!(__other instanceof StatefulSet)) {
            return false;
        }
        final StatefulSet __otherCasted = (StatefulSet) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
