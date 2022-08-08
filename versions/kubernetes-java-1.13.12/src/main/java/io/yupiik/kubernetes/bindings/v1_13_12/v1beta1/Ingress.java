package io.yupiik.kubernetes.bindings.v1_13_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_12.Validable;
import io.yupiik.kubernetes.bindings.v1_13_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ingress implements Validable<Ingress> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private IngressSpec spec;
    private IngressStatus status;

    public Ingress() {
        // no-op
    }

    public Ingress(final String apiVersion,
                   final String kind,
                   final ObjectMeta metadata,
                   final IngressSpec spec,
                   final IngressStatus status) {
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

    public IngressSpec getSpec() {
        return spec;
    }

    public void setSpec(final IngressSpec spec) {
        this.spec = spec;
    }

    public IngressStatus getStatus() {
        return status;
    }

    public void setStatus(final IngressStatus status) {
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
        if (!(__other instanceof Ingress)) {
            return false;
        }
        final Ingress __otherCasted = (Ingress) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public Ingress apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Ingress kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Ingress metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Ingress spec(final IngressSpec spec) {
        this.spec = spec;
        return this;
    }

    public Ingress status(final IngressStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public Ingress validate() {
        return this;
    }
}
