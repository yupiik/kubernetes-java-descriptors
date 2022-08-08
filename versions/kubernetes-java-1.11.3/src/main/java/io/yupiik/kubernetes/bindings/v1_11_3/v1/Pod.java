package io.yupiik.kubernetes.bindings.v1_11_3.v1;

import io.yupiik.kubernetes.bindings.v1_11_3.Validable;
import io.yupiik.kubernetes.bindings.v1_11_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pod implements Validable<Pod> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private PodSpec spec;
    private PodStatus status;

    public Pod() {
        // no-op
    }

    public Pod(final String apiVersion,
               final String kind,
               final ObjectMeta metadata,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public Pod apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Pod kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Pod metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Pod spec(final PodSpec spec) {
        this.spec = spec;
        return this;
    }

    public Pod status(final PodStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public Pod validate() {
        return this;
    }
}
