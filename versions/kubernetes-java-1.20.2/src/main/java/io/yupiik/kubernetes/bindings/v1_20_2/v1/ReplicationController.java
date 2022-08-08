package io.yupiik.kubernetes.bindings.v1_20_2.v1;

import io.yupiik.kubernetes.bindings.v1_20_2.Validable;
import io.yupiik.kubernetes.bindings.v1_20_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReplicationController implements Validable<ReplicationController> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ReplicationControllerSpec spec;
    private ReplicationControllerStatus status;

    public ReplicationController() {
        // no-op
    }

    public ReplicationController(final String apiVersion,
                                 final String kind,
                                 final ObjectMeta metadata,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public ReplicationController apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ReplicationController kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ReplicationController metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ReplicationController spec(final ReplicationControllerSpec spec) {
        this.spec = spec;
        return this;
    }

    public ReplicationController status(final ReplicationControllerStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public ReplicationController validate() {
        return this;
    }
}
