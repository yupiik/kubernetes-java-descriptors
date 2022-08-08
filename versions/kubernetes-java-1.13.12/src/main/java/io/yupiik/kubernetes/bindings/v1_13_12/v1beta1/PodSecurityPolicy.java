package io.yupiik.kubernetes.bindings.v1_13_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_12.Validable;
import io.yupiik.kubernetes.bindings.v1_13_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodSecurityPolicy implements Validable<PodSecurityPolicy> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private PodSecurityPolicySpec spec;

    public PodSecurityPolicy() {
        // no-op
    }

    public PodSecurityPolicy(final String apiVersion,
                             final String kind,
                             final ObjectMeta metadata,
                             final PodSecurityPolicySpec spec) {
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

    public PodSecurityPolicySpec getSpec() {
        return spec;
    }

    public void setSpec(final PodSecurityPolicySpec spec) {
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
        if (!(__other instanceof PodSecurityPolicy)) {
            return false;
        }
        final PodSecurityPolicy __otherCasted = (PodSecurityPolicy) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public PodSecurityPolicy apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PodSecurityPolicy kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PodSecurityPolicy metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PodSecurityPolicy spec(final PodSecurityPolicySpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public PodSecurityPolicy validate() {
        return this;
    }
}
