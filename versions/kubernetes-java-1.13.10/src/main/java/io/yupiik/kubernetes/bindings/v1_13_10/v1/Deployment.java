package io.yupiik.kubernetes.bindings.v1_13_10.v1;

import java.util.Objects;

public class Deployment {
    private String apiVersion;
    private String kind;
    private DeploymentMetadata metadata;
    private DeploymentSpec spec;
    private DeploymentStatus status;

    public Deployment() {
        // no-op
    }

    public Deployment(final String apiVersion,
                      final String kind,
                      final DeploymentMetadata metadata,
                      final DeploymentSpec spec,
                      final DeploymentStatus status) {
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

    public DeploymentMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DeploymentMetadata metadata) {
        this.metadata = metadata;
    }

    public DeploymentSpec getSpec() {
        return spec;
    }

    public void setSpec(final DeploymentSpec spec) {
        this.spec = spec;
    }

    public DeploymentStatus getStatus() {
        return status;
    }

    public void setStatus(final DeploymentStatus status) {
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
        if (!(__other instanceof Deployment)) {
            return false;
        }
        final Deployment __otherCasted = (Deployment) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
