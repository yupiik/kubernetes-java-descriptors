package io.yupiik.kubernetes.bindings.v1_14_0;

import java.util.Objects;

public class Pod {
    private String apiVersion;
    private String kind;
    private PodMetadata metadata;
    private PodSpec spec;
    private PodStatus status;

    public Pod() {
        // no-op
    }

    public Pod(final String apiVersion,
               final String kind,
               final PodMetadata metadata,
               final PodSpec spec,
               final PodStatus status) {
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

    public PodMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodMetadata metadata) {
        this.metadata = metadata;
    }

    public PodSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodSpec spec) {
        this.spec = spec;
    }

    public PodStatus getStatus() {
        return status;
    }

    public void setStatus(final PodStatus status) {
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
        if (!(__other instanceof Pod)) {
            return false;
        }
        final Pod __otherCasted = (Pod) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
