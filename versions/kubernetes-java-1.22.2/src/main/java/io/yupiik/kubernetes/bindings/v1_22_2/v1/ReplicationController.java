package io.yupiik.kubernetes.bindings.v1_22_2.v1;

import java.util.Objects;

public class ReplicationController {
    private String apiVersion;
    private String kind;
    private ReplicationControllerMetadata metadata;
    private ReplicationControllerSpec spec;
    private ReplicationControllerStatus status;

    public ReplicationController() {
        // no-op
    }

    public ReplicationController(final String apiVersion,
                                 final String kind,
                                 final ReplicationControllerMetadata metadata,
                                 final ReplicationControllerSpec spec,
                                 final ReplicationControllerStatus status) {
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

    public ReplicationControllerMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicationControllerMetadata metadata) {
        this.metadata = metadata;
    }

    public ReplicationControllerSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicationControllerSpec spec) {
        this.spec = spec;
    }

    public ReplicationControllerStatus getStatus() {
        return status;
    }

    public void setStatus(final ReplicationControllerStatus status) {
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
        if (!(__other instanceof ReplicationController)) {
            return false;
        }
        final ReplicationController __otherCasted = (ReplicationController) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
