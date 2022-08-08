package io.yupiik.kubernetes.bindings.v1_18_7.v1;

import io.yupiik.kubernetes.bindings.v1_18_7.Validable;
import io.yupiik.kubernetes.bindings.v1_18_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Namespace implements Validable<Namespace> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private NamespaceSpec spec;
    private NamespaceStatus status;

    public Namespace() {
        // no-op
    }

    public Namespace(final String apiVersion,
                     final String kind,
                     final ObjectMeta metadata,
                     final NamespaceSpec spec,
                     final NamespaceStatus status) {
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

    public NamespaceSpec getSpec() {
        return spec;
    }

    public void setSpec(final NamespaceSpec spec) {
        this.spec = spec;
    }

    public NamespaceStatus getStatus() {
        return status;
    }

    public void setStatus(final NamespaceStatus status) {
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
        if (!(__other instanceof Namespace)) {
            return false;
        }
        final Namespace __otherCasted = (Namespace) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public Namespace apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Namespace kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Namespace metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Namespace spec(final NamespaceSpec spec) {
        this.spec = spec;
        return this;
    }

    public Namespace status(final NamespaceStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public Namespace validate() {
        return this;
    }
}
