package io.yupiik.kubernetes.bindings.v1_16_5.v1;

import io.yupiik.kubernetes.bindings.v1_16_5.Validable;
import io.yupiik.kubernetes.bindings.v1_16_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lease implements Validable<Lease> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private LeaseSpec spec;

    public Lease() {
        // no-op
    }

    public Lease(final String apiVersion,
                 final String kind,
                 final ObjectMeta metadata,
                 final LeaseSpec spec) {
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

    public LeaseSpec getSpec() {
        return spec;
    }

    public void setSpec(final LeaseSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Lease)) {
            return false;
        }
        final Lease __otherCasted = (Lease) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public Lease apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Lease kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Lease metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Lease spec(final LeaseSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public Lease validate() {
        return this;
    }
}
