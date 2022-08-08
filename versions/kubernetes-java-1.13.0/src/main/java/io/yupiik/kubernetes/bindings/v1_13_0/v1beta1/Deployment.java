package io.yupiik.kubernetes.bindings.v1_13_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_0.Validable;
import io.yupiik.kubernetes.bindings.v1_13_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Deployment implements Validable<Deployment> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private DeploymentSpec spec;
    private DeploymentStatus status;

    public Deployment() {
        // no-op
    }

    public Deployment(final String apiVersion,
                      final String kind,
                      final ObjectMeta metadata,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public Deployment apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Deployment kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Deployment metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Deployment spec(final DeploymentSpec spec) {
        this.spec = spec;
        return this;
    }

    public Deployment status(final DeploymentStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public Deployment validate() {
        return this;
    }
}
